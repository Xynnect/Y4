package com.example.y4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class newActivity extends Activity {
    

   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.newlayout); 
       Button button1 = (Button)findViewById(R.id.button1); 
	   TextView textView1 = (TextView)findViewById(R.id.textView1); 
   }


   @Override
   public boolean onCreateOptionsMenu(Menu menu) {
       // Inflate the menu; this adds items to the action bar if it is present.
       getMenuInflater().inflate(R.menu.main, menu);
       return true;
   }

   public void gotoMainActivity(View view){
   	Intent i = new Intent(newActivity.this, MainActivity.class);
   	startActivity(i);    

   }
}
