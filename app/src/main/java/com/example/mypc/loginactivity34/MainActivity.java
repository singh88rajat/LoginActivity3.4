package com.example.mypc.loginactivity34;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
    private String loginUserName;
    private String loginUserPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
public void LoginCheckActivity(View view)
{
    //Create Intent object
    Intent showLoginResult = new Intent(getApplicationContext(),WelcomeLogin.class);
    //Set data in bundle and then set bundle in intent object
    Bundle dataBundle = new Bundle();

    EditText loginEditText = (EditText) findViewById(R.id.username);
    loginUserName = loginEditText.getText().toString();
    EditText loginEditTextPass = (EditText) findViewById(R.id.password);
    loginUserPass = loginEditTextPass.getText().toString();

    dataBundle.putString("loginusername", loginUserName);
    dataBundle.putString("loginpass", loginUserPass);
    showLoginResult.putExtras(dataBundle);
    startActivity(showLoginResult);

}

}
