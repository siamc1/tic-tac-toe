package com.SRCStudios.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.os.Bundle;

import com.SRCStudios.tictactoe.R;

public class HelpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
    }

    public void btnBack(View view){
        this.finish();
    }
}
