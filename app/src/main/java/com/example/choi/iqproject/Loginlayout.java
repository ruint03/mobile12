package com.example.choi.iqproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class Loginlayout extends AppCompatActivity implements View.OnClickListener {
    public EditText edit_id, edit_pass;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
        edit_id =  (EditText)findViewById(R.id.idText);
        edit_pass = (EditText)findViewById(R.id.passwordText);

    }
    public void onClick(View v){
     switch(v.getId()){
         case R.id.joinButton:
             Intent intent = new Intent(this, Joinlayout.class );
             startActivity(intent);
     }
    }
}
