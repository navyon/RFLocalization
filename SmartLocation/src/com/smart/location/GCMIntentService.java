package com.smart.location;


import org.json.JSONException;
import org.json.JSONObject;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.smart.location.pushnotifications.GCMBaseIntentService;
import com.smart.location.pushnotifications.GCMConstants;
import com.smart.location.pushnotifications.GCMRegistrar;
import com.smart.location.pushnotifications.GCMUtilty;
import com.smart.location.utils.Globals;
import com.smart.location.utils.SharedPrefSettingsUtil;

/**
 * IntentService responsible for handling GCM messages.
 */
public class GCMIntentService extends GCMBaseIntentService {

	private static final String TAG = "GCMIntentService";

	public GCMIntentService() {
		super(GCMConstants.GCM_SENDER_ID);
	}

	@Override
	public void onRegistered(Context context, String registrationId) {
		Log.i(TAG, "Device registered: regId = " + registrationId + "\n\n"
				+ getString(R.string.gcm_registered));
		Globals.isRegistering = false;
		new SharedPrefSettingsUtil().saveSharedPrefValue(context,
				"device_id", registrationId);
	}

	@Override
	public void onUnregistered(Context context, String registrationId) {
		Log.i(TAG, "Device unregistered");
		if (GCMRegistrar.isRegisteredOnServer(context)) {

		} else {
			// This callback results from the call to unregister made on
			// ServerUtilities when the registration to the server failed.
			Log.i(TAG, "Ignoring unregister callback");
		}
	}

	@Override
	public void onMessage(Context context, Intent intent) {

		String notificationMsg = intent.getStringExtra("message");
		String tableId = intent.getStringExtra("table_id");

		try {
			JSONObject jsonMsg=new JSONObject(notificationMsg);
			
			notificationMsg=jsonMsg.getString("message");
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Log.e(TAG, "Received message:   " + notificationMsg);

		new GCMUtilty().generateNotification(context, notificationMsg, tableId,
				Globals.AppName);

	}

	@Override
	public void onDeletedMessages(Context context, int total) {
		Log.i(TAG, "Received deleted messages notification");
	}

	@Override
	public void onError(Context context, String errorId) {
		Log.i(TAG, "Received error: " + errorId);
	}

	@Override
	public boolean onRecoverableError(Context context, String errorId) {
		Log.i(TAG, "Received recoverable error: " + errorId);
		return super.onRecoverableError(context, errorId);
	}

	/**
	 * Issues a notification to inform the user that server has sent a message.
	 */

}
