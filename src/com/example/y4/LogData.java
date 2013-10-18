package com.example.y4;

import java.util.LinkedList;

import android.util.Log;
import android.widget.TextView;

public class LogData {
	String logData = "";
	static LinkedList<TextView> views = new LinkedList<TextView>();
	public LogData(){
	}
	public void registerView(TextView view){
		Log.v("dd","onStart");
		views.add(view);
		logData = (String) view.getText();
	}
	public void addLine(String line){
		Log.v("dd","onStart");
		logData.concat(line);
		
	}
	public void removeView(TextView view){
		Log.v("dd","onStart");
		views.remove(view);
		
	}

}
