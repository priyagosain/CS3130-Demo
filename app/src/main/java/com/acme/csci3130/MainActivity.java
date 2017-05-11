package com.acme.csci3130;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends Activity {
    Button button;
    TextView helloText;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //get the TextView Object
        helloText = (TextView) findViewById(R.id.helloText);
        //get the EditText object
        editText = (EditText) findViewById(R.id.editText);
        //get the button object
        button = (Button) findViewById(R.id.button);
    }
    public void onClick(View view) {
        helloText.setText(editText.getText().toString());
    }
        }








