package com.example.y4;

import android.location.LocationManager;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	public static LogData sharedLogData = new LogData();
	public TextView textView1;
	public Button button1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button button1 = (Button)findViewById(R.id.button1); 
		TextView textView1 = (TextView)findViewById(R.id.textView1); 

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	@Override
	public void onDestroy() {
	    super.onDestroy();  // Always call the superclass  
	    // Stop method tracing that the activity started during onCreate()
	    android.os.Debug.stopMethodTracing();
	    String line = "onDestroy";
	    sharedLogData.addLine(line);
	    sharedLogData.registerView(textView1);
	    sharedLogData.removeView(textView1);
	}
	@Override
	protected void onStart() {
    super.onStart();  // Always call the superclass method first
    
    // The activity is either being restarted or started for the first time
    // so this is where we should make sure that GPS is enabled
    LocationManager locationManager = 
            (LocationManager) getSystemService(Context.LOCATION_SERVICE);
    boolean gpsEnabled = locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER);
    
    if (!gpsEnabled) {
        // Create a dialog here that requests the user to enable GPS, and use an intent
        // with the android.provider.Settings.ACTION_LOCATION_SOURCE_SETTINGS action
        // to take the user to the Settings screen to enable GPS when they click "OK"
    }
    String line = "onStart";
    sharedLogData.addLine(line);
    sharedLogData.registerView(textView1);
    Log.v("dd","onStart");
	}
	
	@Override
	protected void onResume(){
		super.onResume();
	String line = "onResume";
    sharedLogData.addLine(line);
    sharedLogData.registerView(textView1);
	}
	


	@Override
	protected void onRestart() {
    super.onRestart();  // Always call the superclass method first
    String line = "onRestart";
    sharedLogData.addLine(line);	
    sharedLogData.registerView(textView1);
    // Activity being restarted from stopped state    
    }
    public void gotonewAvtivity(View view){
    	Intent i = new Intent(MainActivity.this, newActivity.class);
    	startActivity(i);    

    }

	
}
