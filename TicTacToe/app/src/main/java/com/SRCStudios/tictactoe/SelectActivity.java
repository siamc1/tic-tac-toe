package com.SRCStudios.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;

import com.SRCStudios.tictactoe.R;

public class SelectActivity extends AppCompatActivity {
    boolean isSelected = false;
    boolean isEnabled = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);
    }
    //-----------------------------
    //choose piece button code
    //-----------------------------
    public void btnO(View view){
        isEnabled = true;
        P1GameActivity.chrPlayer = 'O';
    }

    public void btnX(View view){
        P1GameActivity.chrPlayer = 'X';
        isEnabled = true;
    }
    //-----------------------------
    //choose difficulty button code
    //-----------------------------
    public void btnEasy(View view){
        if(isEnabled) {
            P1GameActivity.intLevel = 0;
            Intent i = new Intent(this, P1GameActivity.class);
            startActivity(i);
            this.finish();
        }
    }

    public void btnMedium(View view){
        if(isEnabled) {
            P1GameActivity.intLevel = 1;
            Intent i = new Intent(this, P1GameActivity.class);
            startActivity(i);
            this.finish();
        }
    }

    public void btnHard(View view){
        if(isEnabled) {
            P1GameActivity.intLevel = 2;
            Intent i = new Intent(this, P1GameActivity.class);
            startActivity(i);
            this.finish();
        }
    }
}
