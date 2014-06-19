package com.smart.location.utils;

import java.util.List;

import org.apache.http.NameValuePair;
import org.json.JSONObject;

import android.content.Context;
import android.os.AsyncTask;

import com.smart.location.httputils.HttpUtils;
import com.smart.location.interfaces.HttpResponsecallback;

public class HttpCallAsyncTask extends AsyncTask<Void, Void, Void> {
	Context mContext;
	JSONObject jsonResonse;
	HttpResponsecallback callback;
	String progressDialogMessage;
	List<NameValuePair> nameValuePairs;
	String httpAction;

	public HttpCallAsyncTask(Context mContext, List<NameValuePair> nameValuePairs,String progressDialogMessage,
			HttpResponsecallback callback,String httpAction) {
		this.mContext = mContext;
		this.callback = callback;
		this.nameValuePairs=nameValuePairs;
		this.httpAction=httpAction;
	}

	@Override
	protected void onPreExecute() {
		
		Utilities.showDialog(mContext, progressDialogMessage);
		super.onPreExecute();
	}

	@Override
	protected Void doInBackground(Void... params) {

		String postURL="http://www.navyon.com/dev/smartapp_dev/"+httpAction;
		jsonResonse = new HttpUtils().PostToHttpClient(postURL, nameValuePairs,
				mContext);
		return null;
	}

	@Override
	protected void onPostExecute(Void result) {
		super.onPostExecute(result);

		if (jsonResonse != null) {
//			Utilities.showTostmessage(jsonResonse.toString(), mContext);
		}
		Utilities.hideDialog();

		callback.onHttpRequestComplete(jsonResonse);
	}

}
