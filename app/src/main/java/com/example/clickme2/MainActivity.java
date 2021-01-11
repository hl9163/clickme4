package com.example.clickme2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
static int counter =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void go(View view) {
        Button btn;
        btn = (Button) findViewById(R.id.button);
        counter++;
        if(counter%7 != 0)
        {
            btn.setText("number of clicks:"+counter);
        }
        else{
            btn.setText("boom!"+counter);
        }

    }
}