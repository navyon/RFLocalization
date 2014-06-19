package com.smart.location.pushnotifications;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.smart.location.R;

public class GCMNotificationDialog extends Activity
{
	TextView oneBtnsDialogTitle,oneBtnsDialogMsg;
	Button oneBtnDialogOk;
	@Override
	public void setContentView(int layoutResID)
	{
		super.setContentView(layoutResID);
		setContentView(R.layout.dialog_with_one_option);
		
		oneBtnsDialogTitle=(TextView)findViewById(R.id.oneBtnsDialogTitle);
		oneBtnsDialogTitle.setText(getResources().getString(R.string.app_name));
		
		oneBtnsDialogMsg=(TextView)findViewById(R.id.oneBtnsDialogMsg);
		if(getIntent().hasExtra("message"))
			oneBtnsDialogMsg.setText(getIntent().getStringExtra("message"));
		else
			oneBtnsDialogMsg.setText("Push Notification received");
		
		oneBtnDialogOk=(Button)findViewById(R.id.oneBtnDialogOk);
		oneBtnDialogOk.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View v)
			{
				finish();
			}
		});
		
	}
}
