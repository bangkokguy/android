package com.bangkokguy.android.setup;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.IBinder;
import android.os.Vibrator;
import android.util.Log;

public class faszom1 extends Service {

   public faszom1() {
      Log.d("my_alarm", "faszom --constructor");
      }
    
   @Override
   public void onCreate() {
      Log.d("my_alarm", "faszom onCreate");
      super.onCreate();
      Vibrator vi = (Vibrator)(getSystemService( Context.VIBRATOR_SERVICE ));
      vi.vibrate(2000);
      }
   
   @Override
   public int onStartCommand(Intent intent, int flags, int startId) {
      Log.d("my_alarm", "faszom onStartCommand");
      MediaPlayer mp = new MediaPlayer();
      //mp = MediaPlayer.create(sound.this, R.raw.pan1);
      mp = MediaPlayer.create(getApplicationContext(), R.raw.bell10s);
      mp.start();
      mp.setOnCompletionListener(new OnCompletionListener() {
         public void onCompletion(MediaPlayer mp) {
            Log.d("my_alarm", "faszom mp.release");
            mp.release();
            };
         });
      return Service.START_NOT_STICKY;
      }

   @Override
   public IBinder onBind(Intent intent) {
      Log.d("my_alarm", "faszom onBind");
      return null;
      }
   
   }