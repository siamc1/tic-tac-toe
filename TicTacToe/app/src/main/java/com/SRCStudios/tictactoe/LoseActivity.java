package com.SRCStudios.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;

import com.SRCStudios.tictactoe.R;

public class LoseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lose);
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
