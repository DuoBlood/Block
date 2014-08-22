package com.example.block;

import android.content.Context;
import android.content.Intent;
import android.sax.StartElementListener;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.util.Log;

public class CustomPhoneStateListener extends PhoneStateListener {
	//private static final String TAG = "PhoneStateChanged";
    Context context;
    public CustomPhoneStateListener(Context context) {
        super();
        this.context = context;
    }

    @Override
    public void onCallStateChanged(int state, String incomingNumber) {
        super.onCallStateChanged(state, incomingNumber);

        switch (state) {
        case TelephonyManager.CALL_STATE_IDLE:
            //when Idle i.e no call
            Log.d("block", "CustomPhoneStateListener:::onCallStateChanged:::" + "Phone state Idle");
            
            break;
        case TelephonyManager.CALL_STATE_OFFHOOK:
            //when Off hook i.e in call
            //Make intent and start your service here
            Log.d("block", "CustomPhoneStateListener:::onCallStateChanged:::" + "Phone state Off hook");
//            Intent i = new Intent(context, MainActivity.class);
//            i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//            context.startActivity(i);
            
            Intent intent11 = new Intent(context,com.example.block.lock.LockActivity.class);
        	intent11.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        	context.startActivity(intent11);
            break;
        case TelephonyManager.CALL_STATE_RINGING:
            //when Ringing
            Log.d("block", "CustomPhoneStateListener:::onCallStateChanged:::" + "Phone state Ringing");
//            Intent intent11 = new Intent(context,com.example.block.lock.LockActivity.class);
//        	intent11.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//        	context.startActivity(intent11);
//            break;
        default:
            break;
        }
    }
}
