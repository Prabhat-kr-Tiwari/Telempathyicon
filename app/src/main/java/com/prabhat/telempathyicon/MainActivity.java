package com.prabhat.telempathyicon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {


    private int CurrentProgress = 0;
    private ProgressBar progressBar;
    private ImageView buttonimg;
    private ImageView buttonimg2;
    private ProgressBar progressBar2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar = findViewById(R.id.progressBar);
        buttonimg = findViewById(R.id.buttonimg);

        progressBar2 = findViewById(R.id.progressBar2);
        buttonimg2 = findViewById(R.id.buttonimg2);

        buttonimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CurrentProgress = CurrentProgress + 10;
                progressBar.setProgress(CurrentProgress);
                progressBar.setMax(100);
            }
        });

        buttonimg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CurrentProgress = CurrentProgress + 10;
                progressBar2.setProgress(CurrentProgress);
                progressBar2.setMax(100);
            }
        });


    }
}