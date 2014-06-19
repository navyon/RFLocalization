package com.smart.location.utils;

import android.app.ProgressDialog;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import android.widget.Toast;

public class Utilities {

	public static void printLog(String string, String string2, Context mContext) {
		Log.e(string, string2);
		
	}

	public static void printStactTrace(Exception e, Context mContext) {
		e.printStackTrace();
		
	}

	public static void showTostmessage(String message,Context context) {
		try
		{
		Toast.makeText(context, message.toString(), Toast.LENGTH_LONG).show();
		}
		catch(Exception e)
		{
			printStactTrace(e, context);
		}
	}
	public static void showDialog(Context activity, String message)
	{
		try
		{
			if (Globals.mProgressDialog == null)
				Globals.mProgressDialog = new ProgressDialog(activity);
			if (Globals.mProgressDialog.isShowing())
			{

				Globals.mProgressDialog.cancel();
				Globals.mProgressDialog.dismiss();
			}
			Globals.mProgressDialog.setCancelable(false);
			Globals.mProgressDialog.setMessage(message);
			Globals.mProgressDialog.show();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void hideDialog()
	{
		if (Globals.mProgressDialog != null)
			if (Globals.mProgressDialog.isShowing())
				Globals.mProgressDialog.dismiss();
		Globals.mProgressDialog = null;
	}

	public static int getCellNumber(Context mContext) {
		//I am in cell number 0
		return 0;
	}
	
	public static boolean checkNetworkStatus(Context context)
	{
		ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
		NetworkInfo netInfo = cm.getActiveNetworkInfo();
		if (netInfo != null && netInfo.isConnected())
		{
			return true;
		}
		return false;
	}
}
