package com.byteshat.counter.pk;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        new Handler().postDelayed(() ->
                startActivity(new Intent(SplashScreen.this, MainActivity.class)), 3000);
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
