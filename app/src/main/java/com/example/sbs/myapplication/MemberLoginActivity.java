package com.example.sbs.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class MemberLoginActivity extends AppCompatActivity {
    private EditText editTextLoginId;
    private EditText editTextLoginPasswd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member_login);

        setTitle("회원 로그인");

        editTextLoginId = findViewById(R.id.editTextLoginId);
        editTextLoginPasswd = findViewById(R.id.editTextLoginPasswd);

        findViewById(R.id.buttonDoLogin).setOnClickListener(v -> {
            doLogin();
        });

        findViewById(R.id.buttonJoin).setOnClickListener(v -> {
            startActivity(new Intent(MemberLoginActivity.this, MemberJoinActivity.class));
        });
    }

    private void doLogin() {
        String loginId = editTextLoginId.getText().toString().trim();
        String loginPasswd = editTextLoginPasswd.getText().toString().trim();

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

        Member member = AppDatabase.findMember(loginId);

        if (member == null) {
            Toast.makeText(this, "존재하지 않는 아이디 입니다.", Toast.LENGTH_SHORT).show();
            editTextLoginId.requestFocus();
            return;
        } else if (member.getLoginPasswd().equals(loginPasswd) == false) {
            Toast.makeText(this, "비밀번호가 일치하지 않습니다.", Toast.LENGTH_SHORT).show();
            editTextLoginPasswd.requestFocus();
            return;
        }

        Intent intent = new Intent(this, HomeMainActivity.class);
        intent.putExtra("loginedMemberId", member.getId());
        startActivity(intent);
        Toast.makeText(this, "로그인 성공", Toast.LENGTH_SHORT).show();
    }
}