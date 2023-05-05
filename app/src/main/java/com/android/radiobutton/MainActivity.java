package com.android.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
String str;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radioButton1:
                if (checked)
                    str = "Lenevo";
                    Toast.makeText(MainActivity.this, "Lenevo Checked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radioButton2:
                if (checked)
                    str ="Asus";
                    Toast.makeText(MainActivity.this, "Asus Checked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radioButton3:
                if (checked)
                    str ="HP";
                    Toast.makeText(MainActivity.this, "HP Checked", Toast.LENGTH_SHORT).show();
                break;

        }
    }

    public void view(View view) {
        Intent intent = new Intent(MainActivity.this,RadioDisplayActivity.class);
        EditText editText = findViewById(R.id.et);
        intent.putExtra("radioChosen", str);
        intent.putExtra("editValue",editText.getText().toString());
        startActivity(intent);
    }
}