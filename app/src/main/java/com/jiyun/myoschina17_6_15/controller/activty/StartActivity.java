package com.jiyun.myoschina17_6_15.controller.activty;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.jiyun.myoschina17_6_15.R;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        setsleep();
    }

    private void setsleep() {
        Thread thread = new Thread(){
            @Override
            public void run() {
                super.run();
                try {
                    sleep(2000);
                    Intent intent = new Intent(StartActivity.this,MainActivity.class);
                    startActivity(intent);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        thread.start();
    }
}