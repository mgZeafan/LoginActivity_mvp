package com.example.mohamedg.loginactivity_mvp.Login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mohamedg.loginactivity_mvp.CustomerList.CustomerListActivity;
import com.example.mohamedg.loginactivity_mvp.R;

public class LoginActivity extends AppCompatActivity implements ILoginView {

    EditText edEmail,edPassword;
    Button btnLogin;
    ILoginPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {

            setContentView(R.layout.activity_login);
            presenter = new LoginPresenter(this);
            btnLogin=findViewById(R.id.btnLogin);
            edEmail=findViewById(R.id.txtEmail);
            edPassword=findViewById(R.id.txtPassword);
            btnLogin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String mail = edEmail.getText().toString();
                    String password = edPassword.getText().toString();
                    presenter.CheckIsUserValided(mail, password);
                }
            });
        } catch (Exception e)
        {
            Toast.makeText(this, ""+e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void ReturnResult(boolean result) {
        if(result)
        {
            startActivity(new Intent(this, CustomerListActivity.class));
        }else {
            Toast.makeText(this, "failure", Toast.LENGTH_SHORT).show();
        }

    }
}
