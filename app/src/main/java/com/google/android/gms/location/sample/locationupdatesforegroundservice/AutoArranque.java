package com.google.android.gms.location.sample.locationupdatesforegroundservice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class AutoArranque extends BroadcastReceiver {

    private static final String TAG = "BootUpReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {


        Log.d("*****", "Arranque");
        Intent i = new Intent(context, MainActivity.class);
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(i);
    }
}