package com.cmc.pnc;

import java.util.Calendar;
import java.util.Date;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.cmc.pnc.util.CustomDateTimePicker;

public class ActivityDetails extends Activity implements OnClickListener {
	private EditText edt_PilotBoatID, edt_BoatSDT, edt_EmbarkDT,
			edt_CommenceWDT, edt_CompleteWDT, edt_DisembarkDT, edt_PBEDT;
	private Button btn_AddNotes, btn_AddDetention, btn_complete;
	CustomDateTimePicker custom;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		setContentView(R.layout.activitydetails);
		initialiseVariables();
	}

	private void initialiseVariables() {
		btn_AddNotes = (Button) findViewById(R.id.btn_AddNotes);
		btn_AddNotes.setOnClickListener(this);
		btn_AddDetention = (Button) findViewById(R.id.btn_AddDetention);
		btn_AddDetention.setOnClickListener(this);
		btn_complete = (Button) findViewById(R.id.btn_complete);
		btn_complete.setOnClickListener(this);

		edt_PilotBoatID = (EditText) findViewById(R.id.edt_PilotBoatID);
		edt_BoatSDT = (EditText) findViewById(R.id.edt_BoatSDT);
		edt_BoatSDT.setOnClickListener(this);
		edt_EmbarkDT = (EditText) findViewById(R.id.edt_EmbarkDT);
		edt_EmbarkDT.setOnClickListener(this);
		edt_CommenceWDT = (EditText) findViewById(R.id.edt_CommenceWDT);
		edt_CommenceWDT.setOnClickListener(this);
		edt_CompleteWDT = (EditText) findViewById(R.id.edt_CompleteWDT);
		edt_CompleteWDT.setOnClickListener(this);
		edt_DisembarkDT = (EditText) findViewById(R.id.edt_DisembarkDT);
		edt_DisembarkDT.setOnClickListener(this);
		edt_PBEDT = (EditText) findViewById(R.id.edt_PBEDT);
		edt_PBEDT.setOnClickListener(this);

	}

	@Override
	public void onClick(View view) {
		if (view == edt_BoatSDT) {
			custom = new CustomDateTimePicker(this,
					new CustomDateTimePicker.ICustomDateTimeListener() {

						@Override
						public void onSet(Dialog dialog,
								Calendar calendarSelected, Date dateSelected,
								int year, String monthFullName,
								String monthShortName, int monthNumber,
								int date, String weekDayFullName,
								String weekDayShortName, int hour24,
								int hour12, int min, int sec, String AM_PM,
								View v) {
							edt_BoatSDT.setText(calendarSelected.get(Calendar.DAY_OF_MONTH)
									+ ":"+ monthNumber+ ":"+ year
									+ " "+ hour12+ ":" + min + " " + AM_PM);
						}
						@Override
						public void onCancel() {
						}
					});
			custom.showDialog();
		}
		if (view == edt_EmbarkDT) {
			custom = new CustomDateTimePicker(this,
					new CustomDateTimePicker.ICustomDateTimeListener() {
						@Override
						public void onSet(Dialog dialog,
								Calendar calendarSelected, Date dateSelected,
								int year, String monthFullName,
								String monthShortName, int monthNumber,
								int date, String weekDayFullName,
								String weekDayShortName, int hour24,
								int hour12, int min, int sec, String AM_PM,
								View v) {
							edt_EmbarkDT.setText(calendarSelected.get(Calendar.DAY_OF_MONTH)+ ":"	+ monthNumber
									+ ":"+ year	+ " "+ hour12+ ":" + min + " " + AM_PM);
						}

						@Override
						public void onCancel() {
						}
					});
			custom.showDialog();
		}

		if (view == edt_CommenceWDT) {
			custom = new CustomDateTimePicker(this,
					new CustomDateTimePicker.ICustomDateTimeListener() {
						@Override
						public void onSet(Dialog dialog,
								Calendar calendarSelected, Date dateSelected,
								int year, String monthFullName,
								String monthShortName, int monthNumber,
								int date, String weekDayFullName,
								String weekDayShortName, int hour24,
								int hour12, int min, int sec, String AM_PM,
								View v) {
							edt_CommenceWDT.setText(calendarSelected
									.get(Calendar.DAY_OF_MONTH)
									+ ":"
									+ monthNumber
									+ ":"
									+ year
									+ " "
									+ hour12
									+ ":" + min + " " + AM_PM);
						}

						@Override
						public void onCancel() {

						}
					});
			custom.showDialog();
		}

		if (view == edt_CompleteWDT) {
			custom = new CustomDateTimePicker(this,
					new CustomDateTimePicker.ICustomDateTimeListener() {

						@Override
						public void onSet(Dialog dialog,
								Calendar calendarSelected, Date dateSelected,
								int year, String monthFullName,
								String monthShortName, int monthNumber,
								int date, String weekDayFullName,
								String weekDayShortName, int hour24,
								int hour12, int min, int sec, String AM_PM,
								View v) {
							edt_CompleteWDT.setText(calendarSelected
									.get(Calendar.DAY_OF_MONTH)
									+ ":"
									+ monthNumber
									+ ":"
									+ year
									+ " "
									+ hour12
									+ ":" + min + " " + AM_PM);
						}

						@Override
						public void onCancel() {

						}
					});
			custom.showDialog();
		}

		if (view == edt_DisembarkDT) {
			custom = new CustomDateTimePicker(this,
					new CustomDateTimePicker.ICustomDateTimeListener() {

						@Override
						public void onSet(Dialog dialog,
								Calendar calendarSelected, Date dateSelected,
								int year, String monthFullName,
								String monthShortName, int monthNumber,
								int date, String weekDayFullName,
								String weekDayShortName, int hour24,
								int hour12, int min, int sec, String AM_PM,
								View v) {
							edt_DisembarkDT.setText(calendarSelected
									.get(Calendar.DAY_OF_MONTH)
									+ ":"
									+ monthNumber
									+ ":"
									+ year
									+ " "
									+ hour12
									+ ":" + min + " " + AM_PM);

						}

						@Override
						public void onCancel() {

						}
					});
			custom.showDialog();
		}

		if (view == edt_PBEDT) {
			custom = new CustomDateTimePicker(this,
					new CustomDateTimePicker.ICustomDateTimeListener() {

						@Override
						public void onSet(Dialog dialog,
								Calendar calendarSelected, Date dateSelected,
								int year, String monthFullName,
								String monthShortName, int monthNumber,
								int date, String weekDayFullName,
								String weekDayShortName, int hour24,
								int hour12, int min, int sec, String AM_PM,
								View v) {
							edt_PBEDT.setText(calendarSelected
									.get(Calendar.DAY_OF_MONTH)
									+ ":"
									+ monthNumber
									+ ":"
									+ year
									+ " "
									+ hour12
									+ ":" + min + " " + AM_PM);

						}

						@Override
						public void onCancel() {

						}
					});
			custom.showDialog();
		}

		if (view == btn_AddNotes) {
			AlertDialog diag = showNotesDialog(ActivityDetails.this);
			diag.show();
		}
		if (view == btn_AddDetention) {
			AlertDialog diag2 = showDetentionDialog(ActivityDetails.this);
			diag2.show();
		}
		if (view == btn_complete) {
			
			//if (edt_PilotBoatID.length() != 0) {
				displayAlertDialog("Are you sure you want complete this?");
			/*} else {
				AlertDialog.Builder alertDialog = new AlertDialog.Builder(
						ActivityDetails.this);				
				alertDialog.setMessage("Please enter the Pilot Boat ID");
				alertDialog.setPositiveButton("OK",new DialogInterface.OnClickListener() {

					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						dialog.cancel();
					}});
				
			}*/
		}
	}

	public static AlertDialog showNotesDialog(final Context con) {
		Log.i("showNotesDialog", "clicked showNotesDialog");
		AlertDialog.Builder b = new AlertDialog.Builder(con);
		b.setTitle("Add Notes");
		LayoutInflater li = LayoutInflater.from(con);
		View v = li.inflate(R.layout.dialog_notes, null);
		b.setView(v);
		b.setPositiveButton("Add", new DialogInterface.OnClickListener() {

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				Toast toast = Toast.makeText(con, "Notes are added...",	Toast.LENGTH_SHORT);
				toast.setGravity(Gravity.CENTER | Gravity.CENTER_HORIZONTAL, 0,	0);
				toast.show();

			}
		});
		b.setNegativeButton("Cancel", null);

		return b.create();
		// diag.show();

	}

	public static AlertDialog showDetentionDialog(final Context con) {
		AlertDialog.Builder b = new AlertDialog.Builder(con);
		b.setTitle("Add Detension");
		LayoutInflater li = LayoutInflater.from(con);
		View v = li.inflate(R.layout.dialog_dentention, null);
		b.setView(v);
		b.setPositiveButton("Add", new DialogInterface.OnClickListener() {

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				Toast toast = Toast.makeText(con, "Dentention is added...",
						Toast.LENGTH_SHORT);
				toast.setGravity(Gravity.CENTER | Gravity.CENTER_HORIZONTAL, 0,
						0);
				toast.show();
			}
		});
		b.setNegativeButton("Cancel", null);

		return b.create();
		// diag.show();

	}

	private void displayAlertDialog(final String message) {
		AlertDialog.Builder alertDialog = new AlertDialog.Builder(
				ActivityDetails.this);
		alertDialog.setTitle("Confirm Complete...");
		alertDialog.setMessage(message);
		alertDialog.setPositiveButton("YES",
				new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int which) {
						/*String boatID = edt_PilotBoatID.getText().toString();
						for (HashMap<String, String> map : PncApplication.requestList)
							for (Entry<String, String> mapEntry : map
									.entrySet()) {
								String key = mapEntry.getKey();
								// Log.i("setPositiveButton","Key  :"+key);
								String value = mapEntry.getValue();
								// Log.i("setPositiveButton","value  :"+value);
							}*/
						/*
						 * Iterator<Map.Entry<String,String>> iter =
						 * TestMap.entrySet().iterator(); while (iter.hasNext())
						 * { Map.Entry<String,String> entry = iter.next();
						 * if("Sample".equalsIgnoreCase(entry.getValue()){
						 * iter.remove(); } }
						 */
						/*for (HashMap<String, String> map1 : PncApplication.requestList) {
							Iterator iterator = map1.entrySet().iterator();
							while (iterator.hasNext()) {
								Map.Entry pairs = (Map.Entry) iterator.next();
								String tKey = (String) pairs.getKey();
								String tValue = (String) pairs.getValue();
								
								 * if(tValue.equalsIgnoreCase("MT AEL 1"))
								 * map1.remove(map1);
								 
								if ("MT AEL 1".equalsIgnoreCase((String) pairs
										.getValue())) {
									//map1.remove(pairs);
									//PncApplication.requestList.clear();
								  PncApplication.requestList.remove(false);
									
									
								}
								Log.i("Map Itema",	"Iteration   :" + pairs.getKey()+ "Value  " + pairs.getValue());
							}
						}*/
						/*
						 * for (HashMap<String, String> map1 :
						 * PncApplication.requestList) { Iterator iterator =
						 * map1.entrySet().iterator(); while
						 * (iterator.hasNext()) { Map.Entry pairs =
						 * (Map.Entry)iterator.next();
						 * Log.i("Map Itema","Iteration   :"
						 * +pairs.getKey()+"Value  "+pairs.getValue()); } }
						 */

						Toast toast3 = Toast.makeText(getApplicationContext(),"You clicked on YES", Toast.LENGTH_SHORT);
						toast3.setGravity(Gravity.CENTER | Gravity.CENTER_HORIZONTAL, 0,0);
						toast3.show();
						
						Intent intent = new Intent();
						intent.setClass(ActivityDetails.this, HarbourRequest.class);
						startActivity(intent);
						PncApplication.requestList.clear();
					}
				});
		alertDialog.setNegativeButton("NO",
				new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int which) {
						Toast.makeText(getApplicationContext(),
								"You clicked on NO", Toast.LENGTH_SHORT).show();
						dialog.cancel();
					}
				});

		alertDialog.show();
	}

}
