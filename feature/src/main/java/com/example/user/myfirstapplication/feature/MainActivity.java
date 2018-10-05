package com.example.user.myfirstapplication.feature;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView nametextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nametextView = (TextView) findViewById(R.id.nameTextViewId);
        nametextView.setText("History of Computer");
    }
}
