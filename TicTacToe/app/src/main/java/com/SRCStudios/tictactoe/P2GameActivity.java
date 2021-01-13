package com.SRCStudios.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.os.Bundle;
import android.widget.TextView;

import com.SRCStudios.tictactoe.R;

public class P2GameActivity extends AppCompatActivity {
    protected char[][] chrGrid;
    boolean isX, isPlaying;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p2_game);
        chrGrid = new char[3][3];
        isX = true;
        isPlaying = true;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                chrGrid[i][j] = 'n';
            }
        }

    }
    public void btnP2_1(View view) {
        
        if (chrGrid[0][0] == 'n') {
            if (isX) {
                isX = false;
                chrGrid[0][0] = 'X';
                ImageView b = findViewById(R.id.btnP2_1);
                b.setBackgroundResource(R.drawable.play_x);
                TextView i = findViewById(R.id.txtPlayer);
                i.setText("Player two's turn");
            }
            else {
                chrGrid[0][0] = 'O';
                isX = true;
                ImageView b = findViewById(R.id.btnP2_1);
                b.setBackgroundResource(R.drawable.play_o);
                TextView i = findViewById(R.id.txtPlayer);
                i.setText("Player one's turn");
            }
        }
        checkWin();
    }
    public void btnP2_2(View view){
        
        if (chrGrid[0][1] == 'n') {
            if (isX) {
                isX = false;
                chrGrid[0][1] = 'X';
                ImageView b = findViewById(R.id.btnP2_2);
                b.setBackgroundResource(R.drawable.play_x);
                TextView i = findViewById(R.id.txtPlayer);
                i.setText("Player two's turn");
            }
            else {
                chrGrid[0][1] = 'O';
                isX = true;
                ImageView b = findViewById(R.id.btnP2_2);
                b.setBackgroundResource(R.drawable.play_o);
                TextView i = findViewById(R.id.txtPlayer);
                i.setText("Player one's turn");
            }
        }
        checkWin();
    }
    public void btnP2_3(View view){
        if (chrGrid[0][2] == 'n') {
            if (isX) {
                isX = false;
                chrGrid[0][2] = 'X';
                ImageView b = findViewById(R.id.btnP2_3);
                b.setBackgroundResource(R.drawable.play_x);
                TextView i = findViewById(R.id.txtPlayer);
                i.setText("Player two's turn");
            }
            else {
                chrGrid[0][2] = 'O';
                isX = true;
                ImageView b = findViewById(R.id.btnP2_3);
                b.setBackgroundResource(R.drawable.play_o);
                TextView i = findViewById(R.id.txtPlayer);
                i.setText("Player one's turn");
            }
        }
        checkWin();
    }
    public void btnP2_4(View view){
        if (chrGrid[1][0] == 'n') {
            if (isX) {
                isX = false;
                chrGrid[1][0] = 'X';
                ImageView b = findViewById(R.id.btnP2_4);
                b.setBackgroundResource(R.drawable.play_x);
                TextView i = findViewById(R.id.txtPlayer);
                i.setText("Player two's turn");
            }
            else {
                chrGrid[1][0] = 'O';
                isX = true;
                ImageView b = findViewById(R.id.btnP2_4);
                b.setBackgroundResource(R.drawable.play_o);
                TextView i = findViewById(R.id.txtPlayer);
                i.setText("Player one's turn");
            }
        }
        checkWin();
    }
    public void btnP2_5(View view){
        if (chrGrid[1][1] == 'n') {
            if (isX) {
                chrGrid[1][1] = 'X';
                isX = false;
                ImageView b = findViewById(R.id.btnP2_5);
                b.setBackgroundResource(R.drawable.play_x);
                TextView i = findViewById(R.id.txtPlayer);
                i.setText("Player two's turn");
            }
            else {
                chrGrid[1][1] = 'O';
                isX = true;
                ImageView b = findViewById(R.id.btnP2_5);
                b.setBackgroundResource(R.drawable.play_o);
                TextView i = findViewById(R.id.txtPlayer);
                i.setText("Player one's turn");
            }
        }
        checkWin();
    }
    public void btnP2_6(View view){
        if (chrGrid[1][2] == 'n') {
            if (isX) {
                isX = false;
                chrGrid[1][2] = 'X';
                ImageView b = findViewById(R.id.btnP2_6);
                b.setBackgroundResource(R.drawable.play_x);
                TextView i = findViewById(R.id.txtPlayer);
                i.setText("Player two's turn");
            }
            else {
                chrGrid[1][2] = 'O';
                isX = true;
                ImageView b = findViewById(R.id.btnP2_6);
                b.setBackgroundResource(R.drawable.play_o);
                TextView i = findViewById(R.id.txtPlayer);
                i.setText("Player one's turn");
            }
        }
        checkWin();
    }
    public void btnP2_7(View view){
        if (chrGrid[2][0] == 'n') {
            if (isX) {
                isX = false;
                chrGrid[2][0] = 'X';
                ImageView b = findViewById(R.id.btnP2_7);
                b.setBackgroundResource(R.drawable.play_x);
                TextView i = findViewById(R.id.txtPlayer);
                i.setText("Player two's turn");
            }
            else {
                chrGrid[2][0] = 'O';
                isX = true;
                ImageView b = findViewById(R.id.btnP2_7);
                b.setBackgroundResource(R.drawable.play_o);
                TextView i = findViewById(R.id.txtPlayer);
                i.setText("Player one's turn");
            }
        }
        checkWin();
    }
    public void btnP2_8(View view){
        if (chrGrid[2][1] == 'n') {
            if (isX) {
                isX = false;
                chrGrid[2][1] = 'X';
                ImageView b = findViewById(R.id.btnP2_8);
                b.setBackgroundResource(R.drawable.play_x);
                TextView i = findViewById(R.id.txtPlayer);
                i.setText("Player two's turn");
            }
            else {
                chrGrid[2][1] = 'O';
                isX = true;
                ImageView b = findViewById(R.id.btnP2_8);
                b.setBackgroundResource(R.drawable.play_o);
                TextView i = findViewById(R.id.txtPlayer);
                i.setText("Player one's turn");
            }
        }
        checkWin();
    }
    public void btnP2_9(View view){
        if (chrGrid[2][2] == 'n') {
            if (isX) {
                isX = false;
                chrGrid[2][2] = 'X';
                ImageView b = findViewById(R.id.btnP2_9);
                b.setBackgroundResource(R.drawable.play_x);
                TextView i = findViewById(R.id.txtPlayer);
                i.setText("Player two's turn");
            } else {
                chrGrid[2][2] = 'O';
                isX = true;
                ImageView b = findViewById(R.id.btnP2_9);
                b.setBackgroundResource(R.drawable.play_o);
                TextView i = findViewById(R.id.txtPlayer);
                i.setText("Player one's turn");
            }
        }
        checkWin();
    }
    public void checkWin(){
        boolean isTie = true;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(chrGrid[i][j] == 'n'){
                    isTie = false;
                }
            }
        }


        if(chrGrid[0][0] == 'O'){
            if(chrGrid[0][1] == 'O' && chrGrid[0][2] == 'O'){
                isPlaying =false;
                Intent i = new Intent(this, WinScreenO.class);
                startActivity(i);
                this.finish();
            }
            else if(chrGrid[1][0] == 'O' && chrGrid[2][0] == 'O'){
                isPlaying =false;
                Intent i = new Intent(this, WinScreenO.class);
                startActivity(i);
                this.finish();
            }
            else if(chrGrid[1][1] == 'O' && chrGrid[2][2] == 'O'){
                isPlaying =false;
                Intent i = new Intent(this, WinScreenO.class);
                startActivity(i);
                this.finish();
            }
        }
        if(chrGrid[0][1] == 'O' && chrGrid[1][1] == 'O' && chrGrid[2][1] == 'O'){
            isPlaying =false;
            Intent i = new Intent(this, WinScreenO.class);
            startActivity(i);
            this.finish();
        }
        if(chrGrid[0][2] == 'O' && chrGrid[1][2] == 'O' && chrGrid[2][2] == 'O'){
            isPlaying =false;
            Intent i = new Intent(this, WinScreenO.class);
            startActivity(i);
            this.finish();
        }
        if(chrGrid[1][0] == 'O' && chrGrid[1][1] == 'O' && chrGrid[1][2] == 'O'){
            isPlaying =false;
            Intent i = new Intent(this, WinScreenO.class);
            startActivity(i);
            this.finish();
        }
        if(chrGrid[2][0] == 'O'){
            if(chrGrid[2][1] == 'O' && chrGrid[2][2] == 'O'){
                isPlaying =false;
                Intent i = new Intent(this, WinScreenO.class);
                startActivity(i);
                this.finish();
            }
            else if(chrGrid[1][1] == 'O' && chrGrid[0][2] == 'O'){
                isPlaying =false;
                Intent i = new Intent(this, WinScreenO.class);
                startActivity(i);
                this.finish();
            }
        }

        if(chrGrid[0][0] == 'X'){
            if(chrGrid[0][1] == 'X' && chrGrid[0][2] == 'X'){
                isPlaying =false;
                Intent i = new Intent(this, WinScreenX.class);
                startActivity(i);
                this.finish();
            }
            else if(chrGrid[1][0] == 'X' && chrGrid[2][0] == 'X'){
                isPlaying =false;
                Intent i = new Intent(this, WinScreenX.class);
                startActivity(i);
                this.finish();
            }
            else if(chrGrid[1][1] == 'X' && chrGrid[2][2] == 'X'){
                isPlaying =false;
                Intent i = new Intent(this, WinScreenX.class);
                startActivity(i);
                this.finish();
            }
        }
        if(chrGrid[0][1] == 'X' && chrGrid[1][1] == 'X' && chrGrid[2][1] == 'X'){
            isPlaying =false;
            Intent i = new Intent(this, WinScreenX.class);
            startActivity(i);
            this.finish();
        }
        if(chrGrid[0][2] == 'X' && chrGrid[1][2] == 'X' && chrGrid[2][2] == 'X'){
            isPlaying =false;
            Intent i = new Intent(this, WinScreenX.class);
            startActivity(i);
            this.finish();
        }
        if(chrGrid[1][0] == 'X' && chrGrid[1][1] == 'X' && chrGrid[1][2] == 'X'){
            isPlaying =false;
            Intent i = new Intent(this, WinScreenX.class);
            startActivity(i);
            this.finish();
        }
        if(chrGrid[2][0] == 'X'){
            if(chrGrid[2][1] == 'X' && chrGrid[2][2] == 'X'){
                isPlaying =false;
                Intent i = new Intent(this, WinScreenX.class);
                startActivity(i);
                this.finish();
            }
            else if(chrGrid[1][1] == 'X' && chrGrid[0][2] == 'X'){
                isPlaying =false;
                Intent i = new Intent(this, WinScreenX.class);
                startActivity(i);
                this.finish();
            }
        }
        if(!isPlaying){
            isTie = false;
        }
        if(isTie){
            Intent i = new Intent(this, TieActivityP2.class);
            startActivity(i);
            isPlaying = false;
            this.finish();
        }
    }
}
