package com.aquio.chloie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import android.support.design.widget.Snackbar;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("4ITB", "The onCreate() event has been executed");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("4ITB", "The onStart() event has been executed");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("4ITB", "The onResume() event has been executed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("4ITB", "The onPause() event has been executed");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d("4ITB", "The onStop() event has been executed");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("4ITB", "The onDestroy() event has been executed");
    }

    public void showBack(View showBack){
        Toast.makeText(this, "Cannot Return to Previous Page", Toast.LENGTH_LONG).show();
    }

    public void showNext(View showNext){
        Snackbar.make(showNext,"Nothing to Show",Snackbar.LENGTH_LONG).show();
    }
}
