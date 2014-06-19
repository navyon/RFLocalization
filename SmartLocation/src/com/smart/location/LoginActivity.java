package com.smart.location;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONObject;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import com.smart.location.interfaces.HttpResponsecallback;
import com.smart.location.utils.Globals;
import com.smart.location.utils.HttpCallAsyncTask;
import com.smart.location.utils.SharedPrefSettingsUtil;
import com.smart.location.utils.Utilities;

public class LoginActivity extends Activity implements OnClickListener,
		HttpResponsecallback {

	EditText userNameET, passwordET;
	Button loginBtn, signupBtn;
	Context mContext;
SharedPrefSettingsUtil sharedPref;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.loginlayout);
		mContext = this;
		initViews();
		new GCMMainClass(this);
	}

	private void initViews() {
		sharedPref=new SharedPrefSettingsUtil();
		userNameET = (EditText) findViewById(R.id.userNameET);
		passwordET = (EditText) findViewById(R.id.passwordET);

		loginBtn = (Button) findViewById(R.id.loginBtn);
		loginBtn.setOnClickListener(this);
		signupBtn = (Button) findViewById(R.id.signupBtn);
		signupBtn.setOnClickListener(this);
	}

	@Override
	public void onClick(View view) {
		switch (view.getId()) {
		case R.id.loginBtn:
			loginUser(userNameET.getText().toString(), passwordET.getText()
					.toString());
			break;
		case R.id.signupBtn:
			startActivity(new Intent(mContext,SignupActivity.class));
			finish();
			break;
		default:
			break;
		}

	}

	private void loginUser(String userName, String password) {
		if (userName.equals("") || password.equals("")) {
			Utilities
					.showTostmessage(Globals.invalidUserNamePassword, mContext);
		} else {
			sharedPref.saveSharedPrefValue(mContext, "username", userName);

			List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
			nameValuePairs.add(new BasicNameValuePair("username", userName));
			nameValuePairs.add(new BasicNameValuePair("password", password));
			nameValuePairs.add(new BasicNameValuePair("device_id", sharedPref.getSharedPrefValue(mContext, "device_id")));
			
			if(Utilities.checkNetworkStatus(mContext))
			{
			new HttpCallAsyncTask(mContext, nameValuePairs,
					Globals.userSignupMessage, LoginActivity.this,Globals.httpActionLogin).execute();
			}
			else
			{
				Utilities.showTostmessage("Internet not connected", mContext);
			}
			
		}
	}

	@Override
	public void onHttpRequestComplete(JSONObject jsonResonse) {
		
		
		if(jsonResonse!=null)
		{
			Utilities.printLog("Login Resonse", jsonResonse.toString(), mContext);
			if(jsonResonse.optString("code").equals("OK"))
			{
				sharedPref.saveSharedPrefValue(mContext, "isLogin", "isLogin");
				sharedPref.saveSharedPrefValue(mContext, "username", jsonResonse.optString("username"));
				Utilities.showTostmessage("Successfully logged in...", mContext);
				startActivity(new Intent(mContext,HomeActivity.class));
				finish();
			}
		}

	}
}
