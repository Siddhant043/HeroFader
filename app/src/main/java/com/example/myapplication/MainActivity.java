package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean tanjiroIsShowing = true;
    public void fade(View view){
        Log.i("Info", "Imaged Tapped!" );
        ImageView tanjiro = (ImageView) findViewById(R.id.tanjiroImageView);
        ImageView saitama = (ImageView) findViewById(R.id.saitamaImageView);
        if(tanjiroIsShowing == true){
            tanjiro.animate().alpha(0).setDuration(2000);
            saitama.animate().alpha(1).setDuration(2000);
            tanjiroIsShowing = false;

        } else {
            saitama.animate().alpha(0).setDuration(2000);
            tanjiro.animate().alpha(1).setDuration(2000);
            tanjiroIsShowing = true;

        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}