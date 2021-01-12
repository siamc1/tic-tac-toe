package com.SRCStudios.tictactoe;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;

import com.SRCStudios.tictactoe.R;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnPlayer1(View view){
        Intent i = new Intent(this,SelectActivity.class);
        //Intent i = new Intent(this,P1GameActivity.class);
        startActivity(i);
    }
    public void btnPlayer2(View view){
        Intent i = new Intent(this,P2GameActivity.class);
        startActivity(i);
    }
    public void btnRules(View view){
        Intent intentI = new Intent(this,HelpActivity.class);
        startActivity(intentI);

    }
}
