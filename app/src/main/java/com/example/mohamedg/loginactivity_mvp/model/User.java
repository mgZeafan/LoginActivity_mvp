package com.example.mohamedg.loginactivity_mvp.model;

import android.text.TextUtils;
import android.util.Patterns;

public class User implements  IUser{
    private String Password;
    private String email;

    public User(String Password, String email) {
        this.Password = Password;
        this.email = email;
    }

    public String getPassword() {
        return Password;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean isValidData() {
        return !TextUtils.isEmpty(getEmail())&&
                Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches()&&
                getPassword().length()>8;
    }
}
