package com.cmc.pnc;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;

public class LoginScreen extends Activity implements OnClickListener{
	
	private Button btn_Login;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		setContentView(R.layout.loginscreen);
		btn_Login = (Button)findViewById(R.id.btn_Login);
		btn_Login.setOnClickListener(this);
	}
	public void onClick(View view) 
	{
		if(view == btn_Login){
			Intent intent = new Intent();
			intent.setClass(LoginScreen.this, HarbourRequest.class);   
			startActivity(intent);
		}
		
	}

}
