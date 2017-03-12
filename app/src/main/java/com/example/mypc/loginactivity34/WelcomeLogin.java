package com.example.mypc.loginactivity34;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class WelcomeLogin extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_login);

        Intent intentwelcome = getIntent();

        String userNameBundle=intentwelcome.getExtras().getString("loginusername");
        String passBundle=intentwelcome.getExtras().getString("loginpass");
        if(userNameBundle.equals("Mukesh")&& passBundle.equals("abc123")) {
            Toast.makeText(getApplicationContext(), "Welcome:" + userNameBundle, Toast.LENGTH_LONG).show();
        }
       else
        {
            Toast.makeText(getApplicationContext(), "Incorrect Login Credentails", Toast.LENGTH_LONG).show();
        }
    }
}
