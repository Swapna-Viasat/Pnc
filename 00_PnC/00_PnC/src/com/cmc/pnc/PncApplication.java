package com.cmc.pnc;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.Application;

public class PncApplication extends Application {
	protected static PncApplication sInstance = null;
	protected static ArrayList<HashMap<String, String>> requestList = new ArrayList<HashMap<String, String>>();

	public void onCreate() {
		super.onCreate();
		sInstance = this;
		sInstance.initializeInstance();
	}

	public static PncApplication instance() {
		return sInstance;
	}

	private void initializeInstance() {

	}

}
