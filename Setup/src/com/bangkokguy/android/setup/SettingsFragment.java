package com.bangkokguy.android.setup;

import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.util.Log;

public class SettingsFragment extends PreferenceFragment {
   @Override
   public void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       Log.i ("SettingsFragment","OnCreate");
       // Load the preferences from an XML resource
       addPreferencesFromResource(R.xml.preferences);
       Log.i ("SettingsFragment","after addpreferences");
   }
   
   //public View onCreateView(LayoutInflater inflater, ViewGroup container,
    //  Bundle savedInstanceState) {
     // Log.d("SettingsFragment", "onCreateView()");
     // return inflater.inflate(R.layout.settings_00, container, false);
   //}
   
}
