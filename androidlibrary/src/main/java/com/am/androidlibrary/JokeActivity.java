package com.am.androidlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class JokeActivity extends AppCompatActivity {

    public final static String EXTRA_JOKE = "joke";

    @BindView(R.id.joke_textview)
    TextView jokeTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        if (getIntent().hasExtra(EXTRA_JOKE)) {
            String joke = getIntent().getStringExtra(EXTRA_JOKE);
            jokeTV.setText(joke);
        }
    }
}
