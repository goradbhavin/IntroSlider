package com.example.gb.introslider;

import android.content.Intent;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private CoordinatorLayout coordinatorLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        coordinatorLayout = (CoordinatorLayout) findViewById(R.id.coordintor);

        findViewById(R.id.btn_play_again).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // We normally won't show the welcome slider again in real app
                // but this is for testing
                PrefManager prefManager = new PrefManager(getApplicationContext());

                // make first time launch TRUE
                prefManager.setFirstTimeLaunch(true);

                Intent i=new Intent(MainActivity.this,WelcomeActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}
