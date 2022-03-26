package com.example.sbs.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class MemberJoinActivity extends AppCompatActivity {
    private EditText editTextLoginId;
    private EditText editTextLoginPasswd;
    private EditText editTextLoginPasswdConfirm;
    private EditText editTextName;
    private EditText editTextNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member_join);
        setTitle("회원 가입");

        editTextLoginId = findViewById(R.id.editTextLoginId);
        editTextLoginPasswd = findViewById(R.id.editTextLoginPasswd);
        editTextLoginPasswdConfirm = findViewById(R.id.editTextLoginPasswdConfirm);
        editTextName = findViewById(R.id.editTextName);

        findViewById(R.id.buttonDoJoin).setOnClickListener(v -> {
            doJoin();
        });

        findViewById(R.id.buttonCancel).setOnClickListener(v -> {
            finish();
        });
    }

    private void doJoin() {
        String loginId = editTextLoginId.getText().toString().trim();
        String loginPasswd = editTextLoginPasswd.getText().toString().trim();
        String loginPasswdConfirm = editTextLoginPasswdConfirm.getText().toString().trim();
        String name = editTextName.getText().toString().trim();

        if (loginId.length() == 0) {
            Toast.makeText(this, "아이디를 입력해주세요.", Toast.LENGTH_SHORT).show();
            editTextLoginId.requestFocus();

            return;
        }

        if (loginPasswd.length() == 0) {
            Toast.makeText(this, "비밀번호를 입력해주세요.", Toast.LENGTH_SHORT).show();
            editTextLoginPasswd.requestFocus();

            return;
        }

        if (loginPasswd.equals(loginPasswdConfirm) == false) {
            Toast.makeText(this, "비밀번호가 일치하지 않습니다.", Toast.LENGTH_SHORT).show();
            editTextLoginPasswdConfirm.requestFocus();

            return;
        }

        if (name.length() == 0) {
            Toast.makeText(this, "이름을 입력해주세요.", Toast.LENGTH_SHORT).show();
            editTextName.requestFocus();

            return;
        }



        Member member = AppDatabase.findMember(loginId);

        if (member != null) {
            Toast.makeText(this, "이미 사용중인 아이디 입니다.", Toast.LENGTH_SHORT).show();
            editTextLoginId.requestFocus();
            return;
        }

        AppDatabase.join(loginId, loginPasswd, name);
        Toast.makeText(this, "가입 성공", Toast.LENGTH_SHORT).show();
        finish();
    }
}