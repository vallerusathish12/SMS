package com.example.sathish.sms;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText E1, E2;
    private Button B1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        E1 = (EditText) findViewById(R.id.edittext);
        E2 = (EditText) findViewById(R.id.editText2);
        B1 = (Button) findViewById(R.id.btnSendSMS);

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
SENDSMS();
            }
        });
    }

    protected void SENDSMS() {
        Log.i("Send SMS", "");
        String phoneNo = E1.getText().toString();
        String message = E2.getText().toString();

        try {
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(phoneNo, null, message, null, null);
            Toast.makeText(getApplicationContext(), "SMS sent.", Toast.LENGTH_LONG).show();
        } catch (Exception e) {
            Toast.makeText(getApplicationContext(), "SMS faild, please try again.", Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }
    }

public void String(){
    int i = 0;
    i = i++;
    i=i+2;
}
}

