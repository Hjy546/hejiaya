package com.example.a6.hjyapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView a = findViewById(R.id.a);
        a.setText("sadadadas\rdsa\ndasda\n dasdsadsa");
        a.setText("s\n");
        a.setText("a\n");
    }
}
