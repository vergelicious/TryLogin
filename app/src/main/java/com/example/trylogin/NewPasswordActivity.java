package com.example.trylogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class NewPasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_password);
    }

//    public void setNewPassword(View view) {
//        CheckInternet checkInternet = new CheckInternet();
//        if(!checkInternet.isConnected(this)) {
//            showCustomDialog();
//            return;
//        }
//
//        if(!validatePassword() | !validateConfirmPassword()) {
//            return;
//        }
//        progressBar.setVisibility(View.VISIBLE);
//
//        String _newPassword = newPassword.getEditText().getText().toString().trim();
//    }
}