package com.fpp.startedservicetest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuAdapter;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvTime = (TextView) findViewById(R.id.tv_time);
        TextView tvStopService = (TextView) findViewById(R.id.tv_stop_service);
        tvTime.setOnClickListener(this);
        tvStopService.setOnClickListener(this);



    }
    Intent intent;
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tv_time:
                intent = new Intent(MainActivity.this,CurrentTimeIntentService.class);
                startService(intent);
                break;

            case R.id.tv_stop_service:
                stopService(intent);
                break;

        }
    }
}
