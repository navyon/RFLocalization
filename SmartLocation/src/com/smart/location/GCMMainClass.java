package com.smart.location;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.util.Log;

import com.smart.location.pushnotifications.GCMConstants;
import com.smart.location.pushnotifications.GCMRegistrar;
import com.smart.location.utils.Globals;

public class GCMMainClass
{

	Context mContext;
	Activity activity;
	ProgressDialog mProgressDialog;
	final String SERVER_URL = "http://www.navyon.com/dev/smartapp_dev/";

	public GCMMainClass(final Activity context)
	{

		this.activity = context;
		this.mContext = context;
		/** GCM Notification Work: */
		checkNotNull(SERVER_URL, "SERVER_URL");
		checkNotNull(GCMConstants.GCM_SENDER_ID, "SENDER_ID");
		// Make sure the device has the proper dependencies.
		GCMRegistrar.checkDevice(context);
		// Make sure the manifest was properly set - comment out this line
		// while developing the app, then uncomment it when it's ready.
		GCMRegistrar.checkManifest(context);
		final String regId = GCMRegistrar.getRegistrationId(context);
		if (regId.equals(""))
		{
			 Log.d("GCM RegistrationMessage", "Not Registered");
			// Automatically registers application on startup.
			GCMRegistrar.register(context, GCMConstants.GCM_SENDER_ID);
		}
		else
		{
			// Device is already registered on GCM, check server.
			if (GCMRegistrar.isRegisteredOnServer(context))
			{
				// Skips registration.
				Globals.isRegistering = false;

				 Log.d("GCM RegistrationMessage", context.getString(R.string.already_registered));

			}
			else
			{
				// Try to register again, but not in the UI thread.
				// It's also necessary to cancel the thread onDestroy(),
				// hence the use of AsyncTask instead of a raw thread.
				// new GCMRegister(regId).execute();
			}
		}
	}


	private void checkNotNull(Object reference, String name)
	{
		if (reference == null)
		{
			throw new NullPointerException(mContext.getString(R.string.error_config, name));
		}
	}

}
