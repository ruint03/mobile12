package com.example.choi.iqproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Loginlayout extends AppCompatActivity implements View.OnClickListener {
    private EditText edit_id, edit_pass;
    private Button login;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        edit_id = (EditText) findViewById(R.id.idText);
        edit_pass = (EditText) findViewById(R.id.passwordText);
        login = (Button) findViewById(R.id.loginButton);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edit_id.getText().toString().length() == 0){
                    Toast.makeText(getApplicationContext(), "아이디를 입력하세요!", Toast.LENGTH_SHORT).show();
                    edit_id.requestFocus();
                    return;
                }
                if(edit_pass.getText().toString().length()==0){
                    Toast.makeText(getApplicationContext(),"패스워드를 입력하세요!",Toast.LENGTH_SHORT).show();
                    edit_pass.requestFocus();
                    return;
                }
                Intent intent = new Intent();
                intent.putExtra("id",edit_id.getText().toString());
                setResult(RESULT_OK, intent);
                finish();
            }
        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.d("RESULT", requestCode + "");
        Log.d("RESULT", resultCode + "");
        Log.d("RESULT", data + "");

        if (requestCode == 1000 && resultCode == RESULT_OK) {
            Toast.makeText(getApplicationContext(), "회원가입을 완료했습니다!", Toast.LENGTH_SHORT).show();
            edit_id.setText(data.getStringExtra("id"));
        }

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.joinButton:
                Intent intent = new Intent(this, Joinlayout.class);
                startActivityForResult(intent, 1000);
        }
    }


}
