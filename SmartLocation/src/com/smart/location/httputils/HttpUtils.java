package com.smart.location.httputils;

import java.io.IOException;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import com.smart.location.utils.Utilities;

public class HttpUtils
{
	private static JSONObject object = null;

	public JSONObject PostToHttpClient(String postURL, List<NameValuePair> nameValuePairs,Context mContext)
	{
		
		Utilities.printLog("Url is: ", ""+postURL,mContext);
		// Creating HTTP client
		DefaultHttpClient httpClient = new DefaultHttpClient();
		// Creating HTTP Post
		HttpPost httpPost = new HttpPost(postURL);

		// Url Encoding the POST parameters
		try
		{
			UrlEncodedFormEntity form =  new UrlEncodedFormEntity(nameValuePairs,"UTF-8");
			httpPost.setEntity(form);
			HttpResponse response = httpClient.execute(httpPost);
			// writing response to log
			String stringResponse = EntityUtils.toString(response.getEntity(),"UTF-8");
//			Log.d("Http Response:", stringResponse);
			
			if (null != stringResponse)
			{
				Utilities.printLog("postHttpClientResponse: ", stringResponse,mContext);
				object = new JSONObject(stringResponse);

			}
		}
		catch (Exception e)
		{
			object=null;
			Utilities.printStactTrace(e, mContext);
			return null;
		}
		return object;
	}

	/**
	 * Method Send the request using post method at specified url and with name value pairs and returns the JSON object.
	 * 
	 * @param post_URL
	 *            url where api exists
	 * @param nameValuePairslist
	 *            of name value pairs
	 * @return JSONObject
	 * @throws ClientProtocolException
	 * @throws IOException
	 * @throws JSONException
	 */
	public JSONObject PostToHttpClient11(String postURL, List<NameValuePair> nameValuePairs,Context mContext)
	{
		String string_response = "";
		try
		{
			// Utilities.printLog("URL", postURL);
			HttpParams httpparams = new BasicHttpParams();
			HttpProtocolParams.setVersion(httpparams, HttpVersion.HTTP_1_1);
			 HttpProtocolParams.setContentCharset(httpparams, "UTF-8");
			 HttpProtocolParams.setHttpElementCharset(httpparams, HTTP.UTF_8);
			HttpProtocolParams.setUseExpectContinue(httpparams, true);

			SchemeRegistry registry = new SchemeRegistry();
			registry.register(new Scheme("http", new PlainSocketFactory(), 80));
			boolean trustAll = true;
			registry.register(new Scheme("https", (trustAll ? new FakeSocketFactory() : SSLSocketFactory.getSocketFactory()), 443));
			DefaultHttpClient client = new DefaultHttpClient(new ThreadSafeClientConnManager(httpparams, registry), httpparams);

			HttpPost httpPost = new HttpPost(postURL);
			 httpPost.setEntity(new UrlEncodedFormEntity(nameValuePairs,"UTF-8"));
//			httpPost.setEntity(new UrlEncodedFormEntity(nameValuePairs));

			// httpPost.getURI();
			HttpResponse response = client.execute(httpPost);
			string_response = EntityUtils.toString(response.getEntity(),HTTP.UTF_8);

			// if (isArray)
			// {
			// string_response = "{\n\r \"data\":" + string_response + "}";
			// }

//			 Utilities.printLog("string_response", ""+string_response,mContext);

			if (null != string_response)
			{
//				Utilities.printLog("postHttpClientResponse: ", string_response,mContext);
				object = new JSONObject(string_response);
				//object.put("data", new JSONObject(string_response));
			}
			else
				Utilities.printLog("postHttpClientResponse: ", "postHttpClientResponse null",mContext);
		}
		catch (ClientProtocolException e)
		{
			System.out.println("String response for HTTPClinent:: Client Protocol exception");
			 e.printStackTrace();
			return null;
		}
		catch (IOException e)
		{
			System.out.println("String response for HTTPClinent:: IO Exception");
		 e.printStackTrace();
			return null;
		}
		catch (JSONException e)
		{
			//  Auto-generated catch block
			e.printStackTrace();
		}
		return object;
	}

	/**
	 * Method Send the request using post method at specified url and with name value pairs and returns the JSON object.
	 * 
	 * @param post_URL
	 *            url where api exists
	 * @param nameValuePairslist
	 *            of name value pairs
	 * @return JSONObject
	 * @throws ClientProtocolException
	 * @throws IOException
	 * @throws JSONException
	 */
	public JSONObject getHttpClient(String getURL, boolean isArray,Context mContext)
	{
		try
		{

			Utilities.printLog("URL", getURL,mContext);
			HttpParams httpparams = new BasicHttpParams();

			HttpProtocolParams.setVersion(httpparams, HttpVersion.HTTP_1_1);
			HttpProtocolParams.setContentCharset(httpparams, "UTF-8");
			HttpProtocolParams.setUseExpectContinue(httpparams, true);

			SchemeRegistry registry = new SchemeRegistry();
			registry.register(new Scheme("http", new PlainSocketFactory(), 80));
			boolean trustAll = true;
			registry.register(new Scheme("https", (trustAll ? new FakeSocketFactory() : SSLSocketFactory.getSocketFactory()), 443));
			DefaultHttpClient client = new DefaultHttpClient(new ThreadSafeClientConnManager(httpparams, registry), httpparams);
			HttpGet httpGet = new HttpGet(getURL);
			HttpResponse response = client.execute(httpGet);
			String string_response = EntityUtils.toString(response.getEntity());
			// Utilities.printLog("getHttpClient 1", string_response);
			if (isArray)
			{
				string_response = "{\n\r \"data\":" + string_response + "\n\r}";
			}

			if (null != string_response)
			{
				Utilities.printLog("getHttpClientResponse: ", string_response,mContext);
				object = new JSONObject(string_response);
			}
			else
				Utilities.printLog("getHttpClientResponse: ", "getHttpClientResponse null",mContext);
		}
		catch (ClientProtocolException e)
		{
			e.printStackTrace();
			return null;
		}
		catch (IOException e)
		{
			e.printStackTrace();
			return null;
		}
		catch (JSONException e)
		{
			e.printStackTrace();
		}
		return object;

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
