package com.bangkokguy.android.setup;

import android.os.Bundle;
import android.app.Activity;
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

}
