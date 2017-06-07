package com.example.jesseniph.paladinsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToAndroxus (View view) {
        Intent androxus = new Intent(MainActivity.this, Androxus.class);
        startActivity(androxus);
    }

    public void goToBariks (View view) {
        Intent bariks = new Intent(MainActivity.this, Bariks.class);
        startActivity(bariks);
    }

    public void goToBombKing (View view) {
        Intent bombKing = new Intent(MainActivity.this, BombKing.class);
        startActivity(bombKing);
    }

    public void goToBuck (View view) {
        Intent buck = new Intent(MainActivity.this, Buck.class);
        startActivity(buck);
    }

    public void goToCassie (View view) {
        Intent cassie = new Intent(MainActivity.this, Cassie.class);
        startActivity(cassie);
    }

    public void goToDrogo (View view) {
        Intent drogo = new Intent(MainActivity.this, Drogo.class);
        startActivity(drogo);
    }

    public void goToEvie (View view) {
        Intent evie = new Intent(MainActivity.this, Evie.class);
        startActivity(evie);
    }

    public void goToFernando (View view) {
        Intent fernando = new Intent(MainActivity.this, Fernando.class);
        startActivity(fernando);
    }

    public void goToGrohk (View view) {
        Intent grohk = new Intent(MainActivity.this, Grohk.class);
        startActivity(grohk);
    }

    public void goToGrover (View view) {
        Intent grover = new Intent(MainActivity.this, Grover.class);
        startActivity(grover);
    }

    public void goToMakoa (View view) {
        Intent makoa = new Intent(MainActivity.this, Makoa.class);
        startActivity(makoa);
    }


}
