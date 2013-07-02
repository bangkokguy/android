package com.bangkokguy.android.setup;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.bangkokguy.android.setup.faszom1;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;

public class SettingsActivity extends Activity {

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

      // Display the fragment as the main content.
      Log.i ("SettingsActivity","OnCreate");
      this.getFragmentManager().beginTransaction()
              .replace(android.R.id.content, new SettingsFragment())
              .commit();
   }
   
   @Override
   public boolean onCreateOptionsMenu(Menu menu) {
      // Inflate the menu; this adds items to the action bar if it is present.
      getMenuInflater().inflate(R.menu.main, menu);
      return true;
   }
   Date date = null;
   
   public void StartService() {
      String startDate = "20-6-2013 07:00";
      SimpleDateFormat formatter = new SimpleDateFormat("d-M-yyyy hh:mm");
      try {
         date = formatter.parse(startDate);
         }
      catch (ParseException e) {Log.d("my_alarm", "date parse error");}
      long millis = date.getTime();
      
      // prepare and fire the alarm manager; 1*1000*60*5=five minutes
      Intent intent = new Intent(this, faszom1.class);
      PendingIntent pintent = PendingIntent.getService(this, 0, intent, 0);
      AlarmManager alarm = (AlarmManager)getSystemService(Context.ALARM_SERVICE);
      alarm.setRepeating(AlarmManager.RTC_WAKEUP, millis, 1*1000*60*5, pintent); 
      }

}
