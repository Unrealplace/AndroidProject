package com.oliver.oltravel;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class OLSplashActivity extends AppCompatActivity {

    protected Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_olsplash);
//        延时3秒推出主界面
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(OLSplashActivity.this,MainActivity.class));
            }
        },3000);
    }
}
