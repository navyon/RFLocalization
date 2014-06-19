package com.smart.location.pushnotifications;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.gcm.GoogleCloudMessaging;
import com.smart.location.HomeActivity;
import com.smart.location.R;
import com.smart.location.utils.Globals;
import com.smart.location.utils.SharedPrefSettingsUtil;

public class GCMUtilty {

	// public boolean isMyActivityRunning(Context mContext)
	// {
	// ArrayList<String> runningActivities = new ArrayList<String>();
	// ActivityManager activityManager = (ActivityManager)
	// mContext.getApplicationContext().getSystemService(Context.ACTIVITY_SERVICE);
	// List<RunningTaskInfo> services =
	// activityManager.getRunningTasks(Integer.MAX_VALUE);
	// for (int i = 0; i < services.size(); i++)
	// {
	// // if(AppConsts.isLogEnabled)
	// Log.e("services.get(i).topActivity.toString()",
	// services.get(i).topActivity.toString());
	// runningActivities.add(0, services.get(i).topActivity.toString());
	// }
	// if
	// (runningActivities.contains("ComponentInfo{com.jag.classapp/com.jag.classapp.HomeFragmentActivityUsingSlidingMenu}"))
	// return true;
	// return false;
	// }

	int notifCount = 0;

	public void generateNotification(Context context, String message,
			String tableId, String title) {

		Log.e("Noticiation received", "Utilities.java Notification message: "
				+ message);

		if (new SharedPrefSettingsUtil().getSharedPrefValue(context,
				"notifCount") == null) {
			new SharedPrefSettingsUtil().saveSharedPrefValue(context,
					"notifCount", "1");
			notifCount = 1;
		} else {
			notifCount = Integer.parseInt(new SharedPrefSettingsUtil()
					.getSharedPrefValue(context, "notifCount"));
			notifCount += 1;
			new SharedPrefSettingsUtil().saveSharedPrefValue(context,
					"notifCount", "" + notifCount);
		}

		Intent notificationIntent = null;

		notificationIntent = new Intent(context, HomeActivity.class);
		notificationIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		notificationIntent.putExtra("isNotificationReceived",
				"isNotificationReceived");
		notificationIntent.putExtra("message", message);

		// set intent so it does not start a new activity
		// notification.flags |= Notification.FLAG_AUTO_CANCEL;
		int uniqueRequestID = (int) System.currentTimeMillis();
		Globals.notificaitonsListIds.add(uniqueRequestID);
		showNotificationInNotificaitonBar(context, message, Globals.AppName, notificationIntent);

		// Toast.makeText(context, "Push Notification Received",
		// Toast.LENGTH_SHORT).show();

		// Launching home screen
		context.startActivity(notificationIntent);

	}

	public void sendNotification(Context context) {
		final GoogleCloudMessaging gcm = GoogleCloudMessaging
				.getInstance(context);
		final AtomicInteger msgId = new AtomicInteger();

		AsyncTask<Void, Void, Void> myAsyncTask = new AsyncTask<Void, Void, Void>() {
			String msg = "";

			@Override
			protected Void doInBackground(Void... params) {

				try {
					Bundle data = new Bundle();
					data.putString("hello",
							"Hello. This is message from OM POS using push notification.");
					String id = Integer.toString(msgId.incrementAndGet());
					gcm.send(
							GCMConstants.GCM_SENDER_ID + "@gcm.googleapis.com",
							id, data);
					msg = "Sent message";
				} catch (IOException ex) {
					msg = "Error :" + ex.getMessage();
					ex.printStackTrace();
				}
				return null;
			}

			@Override
			protected void onPostExecute(Void result) {
				super.onPostExecute(result);
				Log.e("GCM Msg Send", "My send message: " + msg);
			}
		};

		myAsyncTask.execute();
	}
	
	@SuppressWarnings("deprecation")
	public void showNotificationInNotificaitonBar(Context context, String message, String title, Intent notificationIntent)
	{
		int notificationId = (int) System.currentTimeMillis();
		Globals.notificaitonsListIds.add(notificationId);

		int icon = R.drawable.ic_launcher;
		Uri soundUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
		long when = System.currentTimeMillis();
		NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
		Notification notification = new Notification(icon, message, when);
			notification.sound = soundUri;
		notification.flags |= Notification.FLAG_SHOW_LIGHTS;
		notification.ledARGB = 0xff00ff00;
		notification.ledOnMS = 300;
		notification.ledOffMS = 1000;
		notification.defaults = Notification.DEFAULT_ALL;
		notification.flags |= Notification.FLAG_AUTO_CANCEL;
		int uniqueRequestID = (int) System.currentTimeMillis();
		PendingIntent intent = PendingIntent.getActivity(context, uniqueRequestID, notificationIntent, PendingIntent.FLAG_UPDATE_CURRENT);
		notification.setLatestEventInfo(context, title, message, intent);

		notificationManager.notify(notificationId, notification);
	}

}
