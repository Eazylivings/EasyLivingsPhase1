package org.comfortstay.LoginModule;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import org.comfortstay.Constant.Config;
import org.comfortstay.com.comfortstays.R;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends AppCompatActivity implements Config {

    private ProgressBar progressBar;
    private CoordinatorLayout coordinatorLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_login);

    }

    private Boolean exit = false;
    @Override
    public void onBackPressed() {

        if (exit) {
            finish();
        } else {
            Toast.makeText(this, "Press Back again to Exit.",
                    Toast.LENGTH_SHORT).show();
            exit = true;
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    exit = false;
                }
            }, 3 * 1000);
        }
    }

    public void onClickLoginButton(View view){


    }

    public void onClickRegisterButton(View view){

//        Intent intent = new Intent(this, RegisterActivity.class);
//        startActivity(intent);
//        finish();
    }

    public void onClickForgotPassword(View view){

//        Intent intent = new Intent(this, ForgotPasswordActivity.class);
//        startActivity(intent);
//        finish();
    }

}

