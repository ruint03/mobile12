package com.example.choi.iqproject;

import android.app.Activity;
import android.app.NativeActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.textservice.TextInfo;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Navheadermain extends Activity {
    Button loginmove;
    TextView user_id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.nav_header_main);
        user_id = (TextView) findViewById(R.id.text_id);
        loginmove = findViewById(R.id.loginmove);
        loginmove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Navheadermain.this, Loginlayout.class);
                startActivityForResult(intent,2000);
            }
        });

    }
    //로그인 완료시 버튼 제거 및 사용자 계정 정보 출력
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.d("RESULT", requestCode + "");
        Log.d("RESULT", resultCode + "");
        Log.d("RESULT", data + "");


        if(requestCode==2000&&resultCode==RESULT_OK){
            loginmove.setVisibility(View.GONE);
            user_id.setVisibility(View.VISIBLE);
            user_id.setText(data.getStringExtra("id"));
        }
    }
}
