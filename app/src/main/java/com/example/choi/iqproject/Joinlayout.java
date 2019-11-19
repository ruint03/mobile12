package com.example.choi.iqproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Joinlayout extends AppCompatActivity {
    private EditText reg_id, reg_pass, reg_name, reg_birth;
    private Button reg;
    //유저 데이터 저장 변수
    String gender, user_id, user_pass, user_name;
    Integer user_birth;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.join_layout);

        final RadioGroup radioGroup = (RadioGroup) findViewById(R.id.genderGroup);
        reg_id = (EditText) findViewById(R.id.idText);//id 입력
        reg_pass = (EditText) findViewById(R.id.passwordText);//password 입력
        reg_birth = (EditText) findViewById(R.id.birthText);//생일 입력
        reg_name = (EditText) findViewById(R.id.childText);//이름 입력

        reg = (Button) findViewById(R.id.joinButton);//회원가입 버튼
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (reg_id.getText().toString().length() == 0) {
                    Toast.makeText(getApplicationContext(), "아이디를 입력하세요!", Toast.LENGTH_SHORT).show();
                    reg_id.requestFocus();
                    return;
                }
                if (reg_pass.getText().toString().length() == 0) {
                    Toast.makeText(getApplicationContext(), "비밀번호를 입력하세요!", Toast.LENGTH_SHORT).show();
                    reg_pass.requestFocus();
                    return;
                }
                if (reg_name.getText().toString().length() == 0) {
                    Toast.makeText(getApplicationContext(), "아이디를 입력하세요!", Toast.LENGTH_SHORT).show();
                    reg_name.requestFocus();
                    return;
                }
                if (reg_birth.getText().toString().length() >= 0 || reg_birth.getText().toString().length()<8) {
                    Toast.makeText(getApplicationContext(), "생일을 확인하세요!", Toast.LENGTH_SHORT).show();
                    reg_birth.requestFocus();
                    return;
                }
                int id = radioGroup.getCheckedRadioButtonId();
                RadioButton rb = (RadioButton) findViewById(id);
                gender = rb.getText().toString();//성별 데이터 저장
                //Toast.makeText(getApplicationContext(), rb.getText(), Toast.LENGTH_SHORT).show(); 성별 저장되었는지 확인 완료
                //회원가입시 작성한 id 로그인 화면으로 값 전송
                Intent result = new Intent();
                result.putExtra("id", reg_id.getText().toString());
                //유저 데이터 변수에 저장
                user_id = reg_id.getText().toString();
                user_pass = reg_pass.getText().toString();
                user_name = reg_name.getText().toString();
                user_birth = Integer.parseInt(reg_birth.getText().toString());

                setResult(RESULT_OK, result);
                finish();

            }

        });

    }
}

