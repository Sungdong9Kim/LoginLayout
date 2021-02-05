package com.example.loginlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String signedId;
    String googlePwd;
    EditText inputId;
    EditText inputPwd;
    Button loginButton;
    Button signInButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputId = (EditText)findViewById(R.id.inputID);
        inputPwd = (EditText)findViewById(R.id.inputPWD);

        signedId = "google";
        googlePwd = "1234";

        View.OnClickListener onClickListener = new Button.OnClickListener(){
            @Override
            public void onClick(View view){
                switch (view.getId()){
                    case R.id.btnLogin:
                        if(signedId.equals(inputId.getText().toString()) && googlePwd.equals(inputPwd.getText().toString())){
                            Log.d("test", "클릭되었습니다.1234");
                            Toast.makeText(MainActivity.this, "환영합니다.", Toast.LENGTH_LONG).show();
                        }
                        else {
                            Toast.makeText(MainActivity.this, "아이디, 비밀번호를 다시 확인해주세요.", Toast.LENGTH_LONG).show();
                            Log.d("test", "클릭되었습니다.4321");
                        }
                        break;
                    case R.id.btnSignin:
                        Toast.makeText(MainActivity.this, "아직 지원하지 않는 기능입니다.", Toast.LENGTH_LONG).show();
                        Log.d("test", "클릭되었습니다.");
                        break;
                }
            }
        };
        loginButton = (Button)findViewById(R.id.btnLogin);
        loginButton.setOnClickListener(onClickListener);
        signInButton = (Button)findViewById(R.id.btnSignin);
        signInButton.setOnClickListener(onClickListener);
    }
}