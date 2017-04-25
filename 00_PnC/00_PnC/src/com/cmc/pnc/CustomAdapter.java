package com.cmc.pnc;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    
    private Activity activity;
    private ArrayList<HashMap<String, String>> data;
    private static LayoutInflater inflater=null;
     
    
    public CustomAdapter(Activity a, ArrayList<HashMap<String, String>> d) {
        activity = a;
        data=d;
        inflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);        
    }

    public int getCount() {
        return data.size();
    }

    public Object getItem(int position) {
        return position;
    }

    public long getItemId(int position) {
        return position;
    }
    
    public View getView(int position, View convertView, ViewGroup parent) {
        View vi=convertView;
        if(convertView==null)
            vi = inflater.inflate(R.layout.newrequestlist_row, null);

        TextView vesselName = (TextView)vi.findViewById(R.id.txt_lVesselName);
        TextView expcStartDate = (TextView)vi.findViewById(R.id.txt_lExpcstartdate);
        TextView pilotActivity = (TextView)vi.findViewById(R.id.txt_lPilotActivity);
        TextView vcn = (TextView)vi.findViewById(R.id.txt_lVCN);
        TextView fromLoc = (TextView)vi.findViewById(R.id.txt_lFromLoc);
        TextView toLoc = (TextView)vi.findViewById(R.id.txt_lToLoc);
        
        
        HashMap<String, String> song = new HashMap<String, String>();
        song = data.get(position);
        
        // Setting all values in listview
        vesselName.setText(song.get("vn"));
        expcStartDate.setText(song.get("expstdate"));
        pilotActivity.setText(song.get("pltAct"));
        vcn.setText(song.get("vcn"));
        fromLoc.setText(song.get("fromLoc"));
        toLoc.setText(song.get("toLoc"));        
        return vi;
    }
}