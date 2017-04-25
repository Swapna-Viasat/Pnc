package com.cmc.pnc;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class HarbourRequest extends Activity implements OnClickListener {
	private Button btn_InProgress;
	private ListView list;
	private CustomAdapter adapter;
	private TextView txt_SigninTime;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		setContentView(R.layout.harbourrequest);
		txt_SigninTime = (TextView)findViewById(R.id.txt_SigninTime);
		String currentDateTimeString = DateFormat.getDateTimeInstance().format(new Date());
		txt_SigninTime.setText(currentDateTimeString);
		
		Calendar calOne = Calendar.getInstance();
		calOne.add(Calendar.HOUR, 2);
		Date date1 = calOne.getTime();
		String dateOne = (new SimpleDateFormat("dd-MM-yyyy HH:mm")).format(date1);
		
		Calendar calTwo = Calendar.getInstance();
		calTwo.add(Calendar.HOUR, 3);
		Date date2 = calTwo.getTime();
		String dateTwo = (new SimpleDateFormat("dd-MM-yyyy HH:mm")).format(date2);
		
		Calendar calThree = Calendar.getInstance();
		calThree.add(Calendar.HOUR, 4);
		Date date3 = calThree.getTime();
		String dateThree = (new SimpleDateFormat("dd-MM-yyyy HH:mm")).format(date3);
		
		
		/*
		 * btn_InProgress = (Button) findViewById(R.id.btn_InProgress);
		 * btn_InProgress.setOnClickListener(this);
		 */
		//ArrayList<HashMap<String, String>> requestList = new ArrayList<HashMap<String, String>>();
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("vn", "MT AEL 1");
		map.put("expstdate", dateOne);
		map.put("pltAct", "U");
		map.put("vcn", "11428");
		map.put("fromLoc", "STS");
		map.put("toLoc", "SEA");
		PncApplication.requestList.add(map);
		HashMap<String, String> map1 = new HashMap<String, String>();
		map1.put("vn", "MT AEL 2");
		map1.put("expstdate", dateTwo);
		map1.put("pltAct", "B");
		map1.put("vcn", "11429");
		map1.put("fromLoc", "SEA");
		map1.put("toLoc", "ANC");
		PncApplication.requestList.add(map1);
		HashMap<String, String> map2 = new HashMap<String, String>();
		map2.put("vn", "MT AEL 3");
		map2.put("expstdate", dateThree);
		map2.put("pltAct", "A");
		map2.put("vcn", "11430");
		map2.put("fromLoc", "ANC");
		map2.put("toLoc", "STS");
		PncApplication.requestList.add(map2);
		
		list = (ListView) findViewById(R.id.list);

		adapter = new CustomAdapter(this, PncApplication.requestList);
		list.setAdapter(adapter);

		// Click event for single list row
		list.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				Intent intent = new Intent();
				intent.setClass(HarbourRequest.this, RequestDetails.class);
				startActivity(intent);

			}
		});
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if(keyCode == KeyEvent.KEYCODE_BACK){
			PncApplication.requestList.clear();
		}
		return super.onKeyDown(keyCode, event);
	}

	@Override
	public void onClick(View view) {
		if (view == btn_InProgress) {
			Intent intent = new Intent();
			intent.setClass(HarbourRequest.this, RequestDetails.class);
			startActivity(intent);
		}

	}

}
