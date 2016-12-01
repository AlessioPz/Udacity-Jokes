package com.bussolalabs.jokeslibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R2.id.txt_joke)
    TextView textViewJoke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jokes_lib_activity_main);

        ButterKnife.bind(this);

        Intent intent = getIntent();
        if (intent != null) {
            textViewJoke.setText(intent.getStringExtra("joke"));
        }
    }
}
