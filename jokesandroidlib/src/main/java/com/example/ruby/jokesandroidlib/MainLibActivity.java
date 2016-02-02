package com.example.ruby.jokesandroidlib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainLibActivity extends AppCompatActivity {

    public static String BUNDLE_JOKE_KEY = "JOKE";

    private String joke = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lib_main);

        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            joke = extras.getString(BUNDLE_JOKE_KEY);
        }

        setupView();
    }

    private void setupView(){
        TextView tv_joke = (TextView) findViewById(R.id.tv_joke);

        tv_joke.setText(joke);
    }

}
