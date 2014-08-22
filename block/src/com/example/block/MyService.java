package com.example.block;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {
	
	BroadcastReceiver br;
	
	public void onCreate() {
	    Log.d("block", "MyService:::onCreate:::");
		
		super.onCreate();
	  }
	
	@Override
	public IBinder onBind(Intent intent) {
		return null;
	}
	
	public int onStartCommand(Intent intent, int flags, int startId) {
		Log.d("block", "MyService:::onStartCommand:::");
		
		br = new CallReceiver();
		return START_REDELIVER_INTENT ;
	  }

	private void someTask() {
		
	}
	
}
