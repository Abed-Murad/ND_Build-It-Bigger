package com.am.androidlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class JokeActivity extends AppCompatActivity {

    public final static String EXTRA_JOKE = "joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getIntent().hasExtra(EXTRA_JOKE)) {
            String joke = getIntent().getStringExtra(EXTRA_JOKE);

        }
    }
}
