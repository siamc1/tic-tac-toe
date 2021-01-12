package com.SRCStudios.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import androidx.appcompat.app.AppCompatActivity;

import com.SRCStudios.tictactoe.R;

public class WinScreenP1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_win_screen_p1);
    }
    public void btnMainMenu(View view){
        this.finish();
    }
    public void btnPlayAgain(View view){
        Intent i = new Intent(this, SelectActivity.class);
        startActivity(i);
        this.finish();
    }
}
