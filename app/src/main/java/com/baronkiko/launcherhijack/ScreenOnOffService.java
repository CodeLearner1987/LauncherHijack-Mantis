package com.baronkiko.launcherhijack;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.util.Log;

public class ScreenOnOffService extends Service {
    BroadcastReceiver mReceiver = null;
    private static SettingsMan.SettingStore settings;

    @Override
    public void onCreate() {
        super.onCreate();

        IntentFilter filter = new IntentFilter(Intent.ACTION_SCREEN_ON);
        filter.addAction(Intent.ACTION_SCREEN_OFF);
        mReceiver = new ScreenOnOffReceiver();
        registerReceiver(mReceiver, filter);
    }

    @Override
    public void onStart(Intent intent, int startId) {
        super.onStart(intent, startId);
        boolean screenOff = false;

        if (settings.SleepDetection) {
            try {
                screenOff = intent.getBooleanExtra("screen_state", false);
            } catch (Exception e) {
                e.printStackTrace();
            }

            if (screenOff) {
                Log.i("Wolf", "Screen trg");
                HomePress.Perform(getApplicationContext());
                String pName = AccServ.pName;
                String cName = AccServ.cName;
                Log.i("Wolf", "pak name " + pName + " class name " + cName);
                Intent i = getPackageManager().getLeanbackLaunchIntentForPackage(pName);
                if (i != null) {
                    startActivity(i);
                }
            }
        }
    }

    @Override
    public void onDestroy() {
        Log.i("Wolf", "Service Destroyed");
        if (mReceiver != null) {
            unregisterReceiver(mReceiver);
        }
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
