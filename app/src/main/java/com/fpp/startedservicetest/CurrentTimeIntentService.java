package com.fpp.startedservicetest;

import android.app.Dialog;
import android.app.IntentService;
import android.content.Intent;
import android.content.Context;
import android.text.format.Time;
import android.util.Log;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;


/**
 * 显示时间的Service
 */
public class CurrentTimeIntentService extends IntentService {

    public CurrentTimeIntentService() {
        super("CurrentTimeIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                Time time  = new Time();
                time.setToNow();
                String currentTime = time.format("%Y-%m-%d %H:%M:%S");
                Log.e("当前时间：",currentTime);
            }
        };
        Timer timer = new Timer();
        timer.schedule(task,3000,1000);

    }


}
