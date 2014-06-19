package com.smart.location;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.smart.location.utils.Globals;
import com.smart.location.utils.SharedPrefSettingsUtil;

public class SplashScreen extends Activity {

	Context mContext;
	boolean isMyDeviceRegistered = false, isLoggedIn = false;

	Handler handler = new Handler();
    int uptimeMillis=3*1000;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash_screen);
		mContext = this;
		if (new SharedPrefSettingsUtil().getSharedPrefValue(mContext,
				"isRegistered") != null) {
			isMyDeviceRegistered = true;
		}

		if (new SharedPrefSettingsUtil()
				.getSharedPrefValue(mContext, "isLogin") != null) {
			isLoggedIn = true;
		}

		String mydeviceId = new SharedPrefSettingsUtil().getSharedPrefValue(
				mContext, "device_id");
		if (mydeviceId == null || mydeviceId.equals("")) {
			// Create and start push manager
			new GCMMainClass(this);
		} else {
			Globals.isRegistering = false;

		}
		handler.postAtTime(runnable, uptimeMillis);

	}

	Runnable runnable=new Runnable() {
		
		@Override
		public void run() {
//			if(isLoggedIn)
//			{
//			startActivity(new Intent(mContext,HomeActivity.class));
//			}
//			else
//			{
				startActivity(new Intent(mContext,LoginActivity.class));
//			}
			finish();	
		}
	};
}
