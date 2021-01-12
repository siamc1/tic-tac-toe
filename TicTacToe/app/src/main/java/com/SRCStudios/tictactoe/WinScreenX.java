package com.SRCStudios.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.SRCStudios.tictactoe.R;

public class WinScreenX extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_win_screen_x);
    }
    public void btnPlayAgain(View view){
        Intent i = new Intent(this, P2GameActivity.class);
        startActivity(i);
        this.finish();
    }
    public void btnMainMenu(View view){
        this.finish();
    }
}
