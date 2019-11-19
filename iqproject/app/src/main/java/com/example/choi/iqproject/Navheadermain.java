package com.example.choi.iqproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Navheadermain extends Activity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.nav_header_main);
        Button loginmove = (Button) findViewById(R.id.loginmove);
        loginmove.setOnClickListener(this);
    }

    public void onClick(View v) {
        Intent intent = new Intent(this, Loginlayout.class);
        startActivity(intent);

    }
}
