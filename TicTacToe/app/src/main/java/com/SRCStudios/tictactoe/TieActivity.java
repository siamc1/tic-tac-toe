package com.SRCStudios.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.SRCStudios.tictactoe.R;

public class TieActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tie);
    }
    public void btnPlayAgain(View view){
        Intent i = new Intent(this, SelectActivity.class);
        startActivity(i);
        this.finish();
    }
    public void btnMainMenu(View view){
        this.finish();
    }
}
