package com.cmc.pnc;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class RequestDetails extends Activity implements OnClickListener{
	private Button btn_Start;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		setContentView(R.layout.requestdetails);
		
		btn_Start = (Button)findViewById(R.id.btn_Start);
		btn_Start.setOnClickListener(this);
	}
	@Override
	public void onClick(View view) {
		if(view == btn_Start){
			Intent intent = new Intent();
			intent.setClass(RequestDetails.this, ActivityDetails.class);   
			startActivity(intent);
		}
		
	}

}
