package com.smart.location.pushnotifications;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import static com.smart.location.pushnotifications.GCMConstants.DEFAULT_INTENT_SERVICE_CLASS_NAME;

/**
 * {@link BroadcastReceiver} that receives GCM messages and delivers them to an
 * application-specific {@link GCMBaseIntentService} subclass.
 * <p>
 * By default, the {@link GCMBaseIntentService} class belongs to the application
 * main package and is named
 * {@link GCMConstants#DEFAULT_INTENT_SERVICE_CLASS_NAME}. To use a new class,
 * the {@link #getGCMIntentServiceClassName(Context)} must be overridden.
 */
public class GCMBroadcastReceiver extends BroadcastReceiver
{

	private static boolean mReceiverSet = false;

	private final GCMLogger mLogger = new GCMLogger("GCMBroadcastReceiver", "[" + getClass().getName() + "]: ");

	@Override
	public final void onReceive(Context context, Intent intent)
	{
		mLogger.log(Log.VERBOSE, "onReceive: %s", intent.getAction());
		// do a one-time check if app is using a custom GCMBroadcastReceiver
		if (!mReceiverSet)
		{
			mReceiverSet = true;
			GCMRegistrar.setRetryReceiverClassName(context, getClass().getName());
		}

		// if(isMyActivityRunning(context))
		// {
		// intent.putExtra(name, value)
		// }
		// else
		// {
		String className = getGCMIntentServiceClassName(context);
		mLogger.log(Log.VERBOSE, "GCM IntentService class: %s", className);
		// Delegates to the application-specific intent service.
		GCMBaseIntentService.runIntentInService(context, intent, className);
		setResult(Activity.RESULT_OK, null /* data */, null /* extra */);
		// }

	}

	/**
	 * Gets the class name of the intent service that will handle GCM messages.
	 */
	protected String getGCMIntentServiceClassName(Context context)
	{
		return getDefaultIntentServiceClassName(context);
	}

	/**
	 * Gets the default class name of the intent service that will handle GCM
	 * messages.
	 */
	static final String getDefaultIntentServiceClassName(Context context)
	{
		String className = context.getPackageName() + DEFAULT_INTENT_SERVICE_CLASS_NAME;
		return className;
	}

}
