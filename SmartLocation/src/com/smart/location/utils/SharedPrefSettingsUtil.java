package com.smart.location.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Log;

public class SharedPrefSettingsUtil {
	static String PREFS_NAME = "pref";

	public String getSharedPrefValue(Context mContext, String sharedPrefTitle) {
		Log.e("context", mContext + ";;");
		SharedPreferences settings = mContext.getSharedPreferences(PREFS_NAME,
				0);
		return settings.getString(sharedPrefTitle, null);
	}

	public void saveSharedPrefValue(Context mContext, String sharedPrefTitle,
			String sharedPrefValue) {
		try {
			SharedPreferences settings = mContext.getSharedPreferences(
					PREFS_NAME, 0);
			final SharedPreferences.Editor editor = settings.edit();
			editor.putString(sharedPrefTitle, sharedPrefValue);
			editor.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void removeSharedPrefValue(Context mContext, String sharedPrefTitle) {
		try {
			SharedPreferences settings = mContext.getSharedPreferences(
					PREFS_NAME, 0);
			Editor editor = settings.edit();
			editor.remove(sharedPrefTitle);
			editor.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}




}
