package com.android.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RadioDisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_display);
        TextView textViewforET =findViewById(R.id.textet);
        TextView textView = findViewById(R.id.text);

        Bundle extras = getIntent().getExtras();
        if (extras!= null){
            String messages = extras.getString("radioChosen");
            textView.setText(messages);
            Intent intent = getIntent();
            String str = intent.getStringExtra("editValue");
            textViewforET.setText(str);
        }
    }
}