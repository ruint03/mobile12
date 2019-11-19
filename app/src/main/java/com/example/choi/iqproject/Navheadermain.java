package com.example.choi.iqproject;

import android.app.Activity;
import android.app.NativeActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Navheadermain extends Activity {
    Button loginmove;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.nav_header_main);
        loginmove = findViewById(R.id.loginmove);
        loginmove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Navheadermain.this, Loginlayout.class);
                startActivity(intent);
            }
        });
    }
}
