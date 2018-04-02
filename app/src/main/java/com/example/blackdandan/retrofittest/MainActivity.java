package com.example.blackdandan.retrofittest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Pools.WORKER.schedule(new Runnable() {
            @Override
            public void run() {
                NetWork.requestGitHubService();
            }
        });
    }
}
