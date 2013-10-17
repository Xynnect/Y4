package com.example.y4;

import java.util.LinkedList;

import android.widget.TextView;

public class LogData {
	String logData = "";
	LinkedList<TextView> views = new LinkedList<TextView>();
	public LogData(){
	}
	public void registerView(TextView view){
		views.add(view);
		logData = (String) view.getText();
	}
	public void addLine(String line){
		logData.concat(line);
		
	}
	public void removeView(TextView view){
		views.remove(view);
		
	}

}
