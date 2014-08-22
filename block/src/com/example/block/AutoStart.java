package com.example.block;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class AutoStart extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent1) {
	        Log.i("blok", "started");
	        context.startService(new Intent(context, MyService.class) );
	}

}
