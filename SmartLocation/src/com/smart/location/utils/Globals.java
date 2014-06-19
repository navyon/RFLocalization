package com.smart.location.utils;

import java.util.ArrayList;
import java.util.List;

import android.app.ProgressDialog;

public class Globals {

	public static final String AppName="Smart Location";
	public static boolean isRegistering;
	public static List<Integer> notificaitonsListIds=new ArrayList<Integer>();
	public static ProgressDialog mProgressDialog;
	public static String invalidUserNamePassword="Username or Password cannot be empty.";
	public static String userLoginMessage="Login in Progress. Please wait...";
	public static String userSignupMessage="Signup in Progress. Please wait...";
	public static String userNotifyMessage="Sending message in Progress. Please wait...";
	public static String httpActionLogin="login.php";
	public static String httpActionSignup="userregistration.php";
	public static String httpActionSendMessage="sendnotification.php";
}
