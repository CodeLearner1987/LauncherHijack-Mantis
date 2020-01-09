package com.baronkiko.launcherhijack;

import android.content.Context;
import android.content.Intent;

class ScreenOnOffReceiver extends android.content.BroadcastReceiver {

    private boolean screenOff;

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(Intent.ACTION_SCREEN_OFF)) {
            screenOff = true;
        } else if (intent.getAction().equals(Intent.ACTION_SCREEN_ON)) {
            screenOff = false;
        }
        Intent i = new Intent(context, ScreenOnOffService.class);
        i.putExtra("screen_state", screenOff);
        context.startService(i);
    }
}
