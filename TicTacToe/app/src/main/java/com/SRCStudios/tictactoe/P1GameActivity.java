package com.SRCStudios.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.SRCStudios.tictactoe.R;

import java.util.Random;
import java.util.ArrayList;

public class P1GameActivity extends AppCompatActivity {
    static protected boolean isTurn, isPlaying;
    static int intLevel;
    static char chrPlayer, chrCPU;
    char[][] chrGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_p1);

        //Sets is playing to true
        isPlaying = true;

        //creates a new 2 dimensional arrayto hold the
        chrGrid = new char[3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                chrGrid[i][j] = 'n';
            }
        }
        //sets the chrCPU to the opposite of the chrPlayer
        if(chrPlayer == 'X'){
            chrCPU = 'O';
        }
        else{
            chrCPU = 'X';
        }
        //Checks to see who goes first and sets the game into motion by setting the value of isTurn and, if it's false, it will start the game with cpuTurn
        if(chrPlayer == 'X'){
            isTurn = true;
        }
        else{
            isTurn = false;
            cpuTurn();
        }
    }

    /**
     * Buttons Code
     * Checks to see if it's the players turn, and if so, it will play their mark on the button
     * @param view
     */
    public void btnP1_1(View view){
        //checks to see if isTurn is true
        if(isTurn && chrGrid[0][0] == 'n'){
            //checks to see if you are an X or an O
            if(chrPlayer == 'X'){
                //Sets the position in the 2D array to the players symbol
                chrGrid[0][0] = 'X';
                //Creates an instance of the ImageButton as an ImageView and sets it's image to the player's symbol
                ImageView b = findViewById(R.id.btnP1_1);
                b.setBackgroundResource(R.drawable.play_x);
                //sets isTurn to false
                isTurn = false;
                //checks to see  ifanyone won before activating the cpuTurn and checking to see if some one again
                checkWin();
                cpuTurn();
                checkWin();
            }
            //Same code as before, just if the players symbol is an O
            else if(chrPlayer == 'O'){
                chrGrid[0][0] = 'O';
                ImageView b = findViewById(R.id.btnP1_1);
                b.setBackgroundResource(R.drawable.play_o);
                isTurn = false;
                checkWin();
                cpuTurn();
                checkWin();
            }
        }
    }
    public void btnP1_2(View view){
        if(isTurn && chrGrid[0][1] == 'n'){
            if(chrPlayer == 'X'){
                chrGrid[0][1] = 'X';
                ImageView b = findViewById(R.id.btnP1_2);
                b.setBackgroundResource(R.drawable.play_x);
                isTurn = false;
                checkWin();
                cpuTurn();
                checkWin();
            }
            else if(chrPlayer == 'O'){
                chrGrid[0][1] = 'O';
                ImageView b = findViewById(R.id.btnP1_2);
                b.setBackgroundResource(R.drawable.play_o);
                isTurn = false;
                checkWin();
                cpuTurn();
                checkWin();
            }
        }
    }
    public void btnP1_3(View view){
        if(isTurn && chrGrid[0][2] == 'n'){
            if(chrPlayer == 'X'){
                chrGrid[0][2] = 'X';
                ImageView b = findViewById(R.id.btnP1_3);
                b.setBackgroundResource(R.drawable.play_x);
                isTurn = false;
                checkWin();
                cpuTurn();
                checkWin();
            }
            else if(chrPlayer == 'O'){
                chrGrid[0][2] = 'O';
                ImageView b = findViewById(R.id.btnP1_3);
                b.setBackgroundResource(R.drawable.play_o);
                isTurn = false;
                checkWin();
                cpuTurn();
                checkWin();
            }
        }
    }
    public void btnP1_4(View view){
        if(isTurn && chrGrid[1][0] == 'n'){
            if(chrPlayer == 'X'){
                chrGrid[1][0] = 'X';
                ImageView b = findViewById(R.id.btnP1_4);
                b.setBackgroundResource(R.drawable.play_x);
                isTurn = false;
                checkWin();
                cpuTurn();
                checkWin();
            }
            else if(chrPlayer == 'O'){
                chrGrid[1][0] = 'O';
                ImageView b = findViewById(R.id.btnP1_4);
                b.setBackgroundResource(R.drawable.play_o);
                isTurn = false;
                checkWin();
                cpuTurn();
                checkWin();
            }
        }
    }
    public void btnP1_5(View view){
        if(isTurn && chrGrid[1][1] == 'n'){
            if(chrPlayer == 'X'){
                chrGrid[1][1] = 'X';
                ImageView b = findViewById(R.id.btnP1_5);
                b.setBackgroundResource(R.drawable.play_x);
                isTurn = false;
                checkWin();
                cpuTurn();
                checkWin();
            }
            else if(chrPlayer == 'O'){
                chrGrid[1][1] = 'O';
                ImageView b = findViewById(R.id.btnP1_5);
                b.setBackgroundResource(R.drawable.play_o);
                isTurn = false;
                checkWin();
                cpuTurn();
                checkWin();
            }
        }
    }
    public void btnP1_6(View view){
        if(isTurn && chrGrid[1][2] == 'n'){
            if(chrPlayer == 'X'){
                chrGrid[1][2] = 'X';
                ImageView b = findViewById(R.id.btnP1_6);
                b.setBackgroundResource(R.drawable.play_x);
                isTurn = false;
                checkWin();
                cpuTurn();
                checkWin();
            }
            else if(chrPlayer == 'O'){
                chrGrid[1][2] = 'O';
                ImageView b = findViewById(R.id.btnP1_6);
                b.setBackgroundResource(R.drawable.play_o);
                isTurn = false;
                checkWin();
                cpuTurn();
                checkWin();
            }
        }
    }
    public void btnP1_7(View view){
        if(isTurn && chrGrid[2][0] == 'n'){
            if(chrPlayer == 'X'){
                chrGrid[2][0] = 'X';
                ImageView b = findViewById(R.id.btnP1_7);
                b.setBackgroundResource(R.drawable.play_x);
                isTurn = false;
                checkWin();
                cpuTurn();
                checkWin();
            }
            else if(chrPlayer == 'O'){
                chrGrid[2][0] = 'O';
                ImageView b = findViewById(R.id.btnP1_7);
                b.setBackgroundResource(R.drawable.play_o);
                isTurn = false;
                checkWin();
                cpuTurn();
                checkWin();
            }
        }
    }
    public void btnP1_8(View view){
        if(isTurn && chrGrid[2][1] == 'n'){
            if(chrPlayer == 'X'){
                chrGrid[2][1] = 'X';
                ImageView b = findViewById(R.id.btnP1_8);
                b.setBackgroundResource(R.drawable.play_x);
                isTurn = false;
                checkWin();
                cpuTurn();
                checkWin();
            }
            else if(chrPlayer == 'O'){
                chrGrid[2][1] = 'O';
                ImageView b = findViewById(R.id.btnP1_8);
                b.setBackgroundResource(R.drawable.play_o);
                isTurn = false;
                checkWin();
                cpuTurn();
                checkWin();
            }
        }
    }
    public void btnP1_9(View view){
        if(isTurn && chrGrid[2][2] == 'n'){
            if(chrPlayer == 'X'){
                chrGrid[2][2] = 'X';
                ImageView b = findViewById(R.id.btnP1_9);
                b.setBackgroundResource(R.drawable.play_x);
                isTurn = false;
                checkWin();
                cpuTurn();
                checkWin();
            }
            else if(chrPlayer == 'O'){
                chrGrid[2][2] = 'O';
                ImageView b = findViewById(R.id.btnP1_9);
                b.setBackgroundResource(R.drawable.play_o);
                isTurn = false;
                checkWin();
                cpuTurn();
                checkWin();
            }
        }
    }
    /*
     *cpuTurn is used to allow the computer to select and utilise it's moves. It works for all three levels by checking to see which difficulty level the current round has been set to and only using that specific algorythm to select a move
     */
    public void cpuTurn(){
        //Creates a new Random object called r and initializes it
        Random r= new Random();
        //creates an arraylist to hold possible moves
        ArrayList <Integer> intPositions = new  <Integer>ArrayList();

        //will run through all blocks on the board and check their current status. If it's status is n, it will add the corresponding button number to the arraylist
        for(int i = 0; i < 3; i++){
            for ( int j = 0; j < 3; j++){
                //checks to see if the current position hasn't been played on yet.
                if(chrGrid[i][j] == 'n'){
                    //checks to see which position it is and adds the corresponding button number to the arraylist
                    if(i == 0){
                        if(j == 0){
                            intPositions.add(1);
                        }
                        else if(j == 1){
                            intPositions.add(2);
                        }
                        else{
                            intPositions.add(3);
                        }
                    }
                    else if(i == 1){
                        if(j == 0){
                            intPositions.add(4);
                        }
                        else if(j == 1){
                            intPositions.add(5);
                        }
                        else{
                            intPositions.add(6);
                        }
                    }
                    else if(i == 2){
                        if(j == 0){
                            intPositions.add(7);
                        }
                        else if(j == 1){
                            intPositions.add(8);
                        }
                        else{
                            intPositions.add(9);
                        }
                    }
                }

            }
        }
        //Creates 2 new integer variables, one to hold the position and one to hold the position's location in the arraylist of possible moves
        int intPosNum;
        int intPos = 0;
        //if the level is set to 0, easy, it will select a random possible position
        if(intLevel == 0 && intPositions.size() > 0){
            intPosNum = r.nextInt(intPositions.size());
            intPos = intPositions.get(intPosNum);
        }
        //else if the difficulty level is set to one, medium, it will run a simple algorythm that uses a wieghting system to choose one of the best moves
        else if(intLevel == 1){
            int[] intWeights = new int[intPositions.size()];
            for(int i = 0; i < intWeights.length; i++){
                intWeights[i] = 0;
            }
            for(int i = 0; i < intPositions.size(); i++){
                if(intPositions.get(i) == 1){
                    if(chrGrid[0][1] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[0][1] == chrPlayer){
                        intWeights[i] += 3;
                    }
                    else{
                        intWeights[i] += 1;
                    }
                    if(chrGrid[1][0] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[1][0] == chrPlayer){
                        intWeights[i] += 3;
                    }
                    else{
                        intWeights[i] += 1;
                    }
                    if(chrGrid[1][1] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[1][1] == chrPlayer){
                        intWeights[i] += 3;
                    }
                    else{
                        intWeights[i] += 1;
                    }
                    
                    //For The Win Code
                    if(chrGrid[0][1] == chrCPU && chrGrid[0][2] == chrCPU){
                        intWeights[i] += 30;
                    }
                    if(chrGrid[1][0] == chrCPU && chrGrid[2][0] == chrCPU){
                        intWeights[i] += 30;
                    }
                    if(chrGrid[1][1] == chrCPU && chrGrid[2][2] == chrCPU){
                        intWeights[i] += 30;
                    }
                }

                else if(intPositions.get(i) == 2){
                    if(chrGrid[0][0] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[0][0] == chrPlayer){
                        intWeights[i] += 3;
                    }
                    else{
                        intWeights[i] += 1;
                    }
                    if(chrGrid[1][0] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[1][0] == chrPlayer){
                        intWeights[i] += 3;
                    }
                    else{
                        intWeights[i] += 1;
                    }
                    if(chrGrid[1][1] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[1][1] == chrPlayer){
                        intWeights[i] += 3;
                    }
                    else{
                        intWeights[i] += 1;
                    }
                    if(chrGrid[1][2] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[1][2] == chrPlayer){
                        intWeights[i] += 3;
                    }
                    else{
                        intWeights[i] += 1;
                    }
                    if(chrGrid[0][2] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[0][2] == chrPlayer){
                        intWeights[i] += 3;
                    }
                    else{
                        intWeights[i] += 1;
                    }
                    
                    //For The Win Code
                    if(chrGrid[0][0] == chrCPU && chrGrid[0][2] == chrCPU){
                        intWeights[i] += 30;
                    }
                    if(chrGrid[1][1] == chrCPU && chrGrid[2][1] == chrCPU){
                        intWeights[i] += 30;
                    }
                }

                else if(intPositions.get(i) == 3){
                    if(chrGrid[0][1] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[0][1] == chrPlayer){
                        intWeights[i] += 3;
                    }
                    else{
                        intWeights[i] += 1;
                    }
                    if(chrGrid[1][2] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[1][2] == chrPlayer){
                        intWeights[i] += 3;
                    }
                    else{
                        intWeights[i] += 1;
                    }
                    if(chrGrid[1][1] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[1][1] == chrPlayer){
                        intWeights[i] += 3;
                    }
                    else{
                        intWeights[i] += 1;
                    }

                    //For The Win Code
                    if(chrGrid[0][0] == chrCPU && chrGrid[0][1] == chrCPU){
                        intWeights[i] += 30;
                    }
                    if(chrGrid[1][2] == chrCPU && chrGrid[2][2] == chrCPU){
                        intWeights[i] += 30;
                    }
                    if(chrGrid[1][1] == chrCPU && chrGrid[2][0] == chrCPU){
                        intWeights[i] += 30;
                    }
                }

                else if(intPositions.get(i) == 4){
                    if(chrGrid[0][0] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[0][0] == chrPlayer){
                        intWeights[i] += 3;
                    }
                    else{
                        intWeights[i] += 1;
                    }
                    if(chrGrid[0][1] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[0][1] == chrPlayer){
                        intWeights[i] += 3;
                    }
                    else{
                        intWeights[i] += 1;
                    }
                    if(chrGrid[1][1] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[1][1] == chrPlayer){
                        intWeights[i] += 3;
                    }
                    else{
                        intWeights[i] += 1;
                    }
                    if(chrGrid[2][1] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[2][1] == chrPlayer){
                        intWeights[i] += 3;
                    }
                    else{
                        intWeights[i] += 1;
                    }
                    if(chrGrid[2][0] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[2][0] == chrPlayer){
                        intWeights[i] += 3;
                    }
                    else{
                        intWeights[i] += 1;
                    }

                    //For The Win Code
                    if(chrGrid[0][0] == chrCPU && chrGrid[2][0] == chrCPU){
                        intWeights[i] += 30;
                    }
                    if(chrGrid[1][1] == chrCPU && chrGrid[1][2] == chrCPU){
                        intWeights[i] += 30;
                    }
                }

                else if(intPositions.get(i) == 5){
                    if(chrGrid[0][0] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[0][0] == chrPlayer){
                        intWeights[i] += 3;
                    }
                    else{
                        intWeights[i] += 1;
                    }
                    if(chrGrid[0][1] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[0][1] == chrPlayer){
                        intWeights[i] += 3;
                    }
                    else{
                        intWeights[i] += 1;
                    }
                    if(chrGrid[0][2] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[0][2] == chrPlayer){
                        intWeights[i] += 3;
                    }
                    else{
                        intWeights[i] += 1;
                    }
                    if(chrGrid[1][0] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[1][0] == chrPlayer){
                        intWeights[i] += 3;
                    }
                    else{
                        intWeights[i] += 1;
                    }
                    if(chrGrid[1][2] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[1][2] == chrPlayer){
                        intWeights[i] += 3;
                    }
                    else{
                        intWeights[i] += 1;
                    }
                    if(chrGrid[2][0] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[2][0] == chrPlayer){
                        intWeights[i] += 3;
                    }
                    else{
                        intWeights[i] += 1;
                    }
                    if(chrGrid[2][1] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[2][1] == chrPlayer){
                        intWeights[i] += 3;
                    }
                    else{
                        intWeights[i] += 1;
                    }
                    if(chrGrid[2][2] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[2][2] == chrPlayer){
                        intWeights[i] += 3;
                    }
                    else{
                        intWeights[i] += 1;
                    }

                    //For The Win Code
                    if(chrGrid[0][1] == chrCPU && chrGrid[2][1] == chrCPU){
                        intWeights[i] += 30;
                    }
                    if(chrGrid[1][0] == chrCPU && chrGrid[1][2] == chrCPU){
                        intWeights[i] += 30;
                    }
                    if(chrGrid[0][0] == chrCPU && chrGrid[2][2] == chrCPU){
                        intWeights[i] += 30;
                    }
                    if(chrGrid[1][2] == chrCPU && chrGrid[2][0] == chrCPU){
                        intWeights[i] += 30;
                    }
                }

                else if(intPositions.get(i) == 6){
                    if(chrGrid[0][2] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[0][2] == chrPlayer){
                        intWeights[i] += 3;
                    }
                    else{
                        intWeights[i] += 1;
                    }
                    if(chrGrid[0][1] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[0][1] == chrPlayer){
                        intWeights[i] += 3;
                    }
                    else{
                        intWeights[i] += 1;
                    }
                    if(chrGrid[1][1] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[1][1] == chrPlayer){
                        intWeights[i] += 3;
                    }
                    else{
                        intWeights[i] += 1;
                    }
                    if(chrGrid[2][1] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[2][1] == chrPlayer){
                        intWeights[i] += 3;
                    }
                    else{
                        intWeights[i] += 1;
                    }
                    if(chrGrid[2][2] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[2][2] == chrPlayer){
                        intWeights[i] += 3;
                    }
                    else{
                        intWeights[i] += 1;
                    }

                    if(chrGrid[0][2] == chrCPU && chrGrid[2][2] == chrCPU){
                        intWeights[i] += 30;
                    }
                    if(chrGrid[1][0] == chrCPU && chrGrid[1][1] == chrCPU){
                        intWeights[i] += 30;
                    }

                    //For The Win Code
                    if(chrGrid[1][0] == chrCPU && chrGrid[1][1] == chrCPU){
                        intWeights[i] += 30;
                    }
                    if(chrGrid[0][2] == chrCPU && chrGrid[2][2] == chrCPU){
                        intWeights[i] += 30;
                    }
                }

                else if(intPositions.get(i) == 7){
                    if(chrGrid[1][0] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[1][0] == chrPlayer){
                        intWeights[i] += 3;
                    }
                    else{
                        intWeights[i] += 1;
                    }
                    if(chrGrid[0][1] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[0][1] == chrPlayer){
                        intWeights[i] += 3;
                    }
                    else{
                        intWeights[i] += 1;
                    }
                    if(chrGrid[1][1] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[1][1] == chrPlayer){
                        intWeights[i] += 3;
                    }
                    else{
                        intWeights[i] += 1;
                    }

                    //For The Win Code
                    if(chrGrid[0][0] == chrCPU && chrGrid[1][0] == chrCPU){
                        intWeights[i] += 30;
                    }
                    if(chrGrid[2][1] == chrCPU && chrGrid[2][2] == chrCPU){
                        intWeights[i] += 30;
                    }
                    if(chrGrid[1][1] == chrCPU && chrGrid[0][2] == chrCPU){
                        intWeights[i] += 30;
                    }
                }

                else if(intPositions.get(i) == 8){
                    if(chrGrid[2][0] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[2][0] == chrPlayer){
                        intWeights[i] += 3;
                    }
                    else{
                        intWeights[i] += 1;
                    }
                    if(chrGrid[1][0] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[1][0] == chrPlayer){
                        intWeights[i] += 3;
                    }
                    else{
                        intWeights[i] += 1;
                    }
                    if(chrGrid[1][1] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[1][1] == chrPlayer){
                        intWeights[i] += 3;
                    }
                    else{
                        intWeights[i] += 1;
                    }
                    if(chrGrid[1][2] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[1][2] == chrPlayer){
                        intWeights[i] += 3;
                    }
                    else{
                        intWeights[i] += 1;
                    }
                    if(chrGrid[2][2] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[2][2] == chrPlayer){
                        intWeights[i] += 3;
                    }
                    else{
                        intWeights[i] += 1;
                    }

                    //For The Win Code
                    if(chrGrid[2][0] == chrCPU && chrGrid[2][2] == chrCPU){
                        intWeights[i] += 30;
                    }
                    if(chrGrid[1][1] == chrCPU && chrGrid[0][1] == chrCPU){
                        intWeights[i] += 30;
                    }
                }

                else if(intPositions.get(i) == 9){
                    if(chrGrid[1][2] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[1][2] == chrPlayer){
                        intWeights[i] += 3;
                    }
                    else{
                        intWeights[i] += 1;
                    }
                    if(chrGrid[1][1] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[1][1] == chrPlayer){
                        intWeights[i] += 3;
                    }
                    else{
                        intWeights[i] += 1;
                    }
                    if(chrGrid[2][1] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[2][1] == chrPlayer){
                        intWeights[i] += 3;
                    }
                    else{
                        intWeights[i] += 1;
                    }

                    //For The Win Code
                    if(chrGrid[2][0] == chrCPU && chrGrid[2][1] == chrCPU){
                        intWeights[i] += 30;
                    }
                    if(chrGrid[0][0] == chrCPU && chrGrid[1][1] == chrCPU){
                        intWeights[i] += 30;
                    }
                    if(chrGrid[0][2] == chrCPU && chrGrid[1][2] == chrCPU){
                        intWeights[i] += 30;
                    }
                }
            }

            int[] intTempPos = new int[intPositions.size()];
            for(int i = 0; i < intPositions.size(); i++){
                intTempPos[i] = intPositions.get(i);
            }
            int[] intSortedPositions = InsertionSort(intWeights, intTempPos);
            int[] intReverseSortedPositions = new int[intSortedPositions.length];
            for(int i = 0; i < intSortedPositions.length; i++){
                intReverseSortedPositions[i] = intSortedPositions[intSortedPositions.length - i - 1];
            }
            int intChoice = 0;
            if(intReverseSortedPositions.length > 0){
                intPos = intReverseSortedPositions[intChoice];
            }

        }

        else {
            int[] intWeights = new int[intPositions.size()];
            for(int i = 0; i < intWeights.length; i++){
                intWeights[i] = 0;
            }
            for(int i = 0; i < intPositions.size(); i++){
                if(intPositions.get(i) == 1){
                    if(chrGrid[0][1] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[0][1] == chrPlayer){
                        intWeights[i] += 2;
                    }
                    else{
                        intWeights[i] += 1;
                    }
                    if(chrGrid[1][0] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[1][0] == chrPlayer){
                        intWeights[i] += 2;
                    }
                    else{
                        intWeights[i] += 1;
                    }
                    if(chrGrid[1][1] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[1][1] == chrPlayer){
                        intWeights[i] += 2;
                    }
                    else{
                        intWeights[i] += 1;
                    }

                    //For The Win Code
                    if(chrGrid[0][1] == chrCPU && chrGrid[0][2] == chrCPU){
                        intWeights[i] += 30;
                    }
                    if(chrGrid[1][0] == chrCPU && chrGrid[2][0] == chrCPU){
                        intWeights[i] += 30;
                    }
                    if(chrGrid[1][1] == chrCPU && chrGrid[2][2] == chrCPU){
                        intWeights[i] += 30;
                    }

                    //Loss Prevention Code
                    if(chrGrid[0][1] == chrPlayer && chrGrid[0][2] == chrPlayer){
                        intWeights[i] += 20;
                    }
                    if(chrGrid[1][0] == chrPlayer && chrGrid[2][0] == chrPlayer){
                        intWeights[i] += 20;
                    }
                    if(chrGrid[1][1] == chrPlayer && chrGrid[2][2] == chrPlayer){
                        intWeights[i] += 20;
                    }
                }

                else if(intPositions.get(i) == 2){
                    if(chrGrid[0][0] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[0][0] == chrPlayer){
                        intWeights[i] += 2;
                    }
                    else{
                        intWeights[i] += 1;
                    }
                    if(chrGrid[1][0] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[1][0] == chrPlayer){
                        intWeights[i] += 2;
                    }
                    else{
                        intWeights[i] += 1;
                    }
                    if(chrGrid[1][1] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[1][1] == chrPlayer){
                        intWeights[i] += 2;
                    }
                    else{
                        intWeights[i] += 1;
                    }
                    if(chrGrid[1][2] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[1][2] == chrPlayer){
                        intWeights[i] += 2;
                    }
                    else{
                        intWeights[i] += 1;
                    }
                    if(chrGrid[0][2] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[0][2] == chrPlayer){
                        intWeights[i] += 2;
                    }
                    else{
                        intWeights[i] += 1;
                    }

                    //For The Win Code
                    if(chrGrid[0][0] == chrCPU && chrGrid[0][2] == chrCPU){
                        intWeights[i] += 30;
                    }
                    if(chrGrid[1][1] == chrCPU && chrGrid[2][1] == chrCPU){
                        intWeights[i] += 30;
                    }

                    //Loss Prevention Code
                    if(chrGrid[0][0] == chrPlayer && chrGrid[0][2] == chrPlayer){
                        intWeights[i] += 20;
                    }
                    if(chrGrid[1][1] == chrPlayer && chrGrid[2][1] == chrPlayer){
                        intWeights[i] += 20;
                    }
                }

                else if(intPositions.get(i) == 3){
                    if(chrGrid[0][1] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[0][1] == chrPlayer){
                        intWeights[i] += 2;
                    }
                    else{
                        intWeights[i] += 1;
                    }
                    if(chrGrid[1][2] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[1][2] == chrPlayer){
                        intWeights[i] += 2;
                    }
                    else{
                        intWeights[i] += 1;
                    }
                    if(chrGrid[1][1] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[1][1] == chrPlayer){
                        intWeights[i] += 2;
                    }
                    else{
                        intWeights[i] += 1;
                    }

                    //For The Win Code
                    if(chrGrid[0][0] == chrCPU && chrGrid[0][1] == chrCPU){
                        intWeights[i] += 30;
                    }
                    if(chrGrid[1][2] == chrCPU && chrGrid[2][2] == chrCPU){
                        intWeights[i] += 30;
                    }
                    if(chrGrid[1][1] == chrCPU && chrGrid[2][0] == chrCPU){
                        intWeights[i] += 30;
                    }

                    //Loss Prevention Code
                    if(chrGrid[0][0] == chrPlayer && chrGrid[0][1] == chrPlayer){
                        intWeights[i] += 20;
                    }
                    if(chrGrid[1][2] == chrPlayer && chrGrid[2][2] == chrPlayer){
                        intWeights[i] += 20;
                    }
                    if(chrGrid[1][1] == chrPlayer && chrGrid[2][0] == chrPlayer){
                        intWeights[i] += 20;
                    }
                }

                else if(intPositions.get(i) == 4){
                    if(chrGrid[0][0] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[0][0] == chrPlayer){
                        intWeights[i] += 2;
                    }
                    else{
                        intWeights[i] += 1;
                    }
                    if(chrGrid[0][1] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[0][1] == chrPlayer){
                        intWeights[i] += 2;
                    }
                    else{
                        intWeights[i] += 1;
                    }
                    if(chrGrid[1][1] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[1][1] == chrPlayer){
                        intWeights[i] += 2;
                    }
                    else{
                        intWeights[i] += 1;
                    }
                    if(chrGrid[2][1] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[2][1] == chrPlayer){
                        intWeights[i] += 2;
                    }
                    else{
                        intWeights[i] += 1;
                    }
                    if(chrGrid[2][0] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[2][0] == chrPlayer){
                        intWeights[i] += 2;
                    }
                    else{
                        intWeights[i] += 1;
                    }

                    //For The Win Code
                    if(chrGrid[0][0] == chrCPU && chrGrid[2][0] == chrCPU){
                        intWeights[i] += 30;
                    }
                    if(chrGrid[1][1] == chrCPU && chrGrid[1][2] == chrCPU){
                        intWeights[i] += 30;
                    }

                    //Loss Prevention Code
                    if(chrGrid[0][0] == chrPlayer && chrGrid[2][0] == chrPlayer){
                        intWeights[i] += 20;
                    }
                    if(chrGrid[1][1] == chrPlayer && chrGrid[1][2] == chrPlayer){
                        intWeights[i] += 20;
                    }
                }

                else if(intPositions.get(i) == 5){
                    if(chrGrid[0][0] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[0][0] == chrPlayer){
                        intWeights[i] += 2;
                    }
                    else{
                        intWeights[i] += 1;
                    }
                    if(chrGrid[0][1] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[0][1] == chrPlayer){
                        intWeights[i] += 2;
                    }
                    else{
                        intWeights[i] += 1;
                    }
                    if(chrGrid[0][2] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[0][2] == chrPlayer){
                        intWeights[i] += 2;
                    }
                    else{
                        intWeights[i] += 1;
                    }
                    if(chrGrid[1][0] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[1][0] == chrPlayer){
                        intWeights[i] += 2;
                    }
                    else{
                        intWeights[i] += 1;
                    }
                    if(chrGrid[1][2] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[1][2] == chrPlayer){
                        intWeights[i] += 2;
                    }
                    else{
                        intWeights[i] += 1;
                    }
                    if(chrGrid[2][0] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[2][0] == chrPlayer){
                        intWeights[i] += 2;
                    }
                    else{
                        intWeights[i] += 1;
                    }
                    if(chrGrid[2][1] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[2][1] == chrPlayer){
                        intWeights[i] += 2;
                    }
                    else{
                        intWeights[i] += 1;
                    }
                    if(chrGrid[2][2] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[2][2] == chrPlayer){
                        intWeights[i] += 2;
                    }
                    else{
                        intWeights[i] += 1;
                    }

                    //For The Win Code
                    if(chrGrid[0][1] == chrCPU && chrGrid[2][1] == chrCPU){
                        intWeights[i] += 30;
                    }
                    if(chrGrid[1][0] == chrCPU && chrGrid[1][2] == chrCPU){
                        intWeights[i] += 30;
                    }
                    if(chrGrid[0][0] == chrCPU && chrGrid[2][2] == chrCPU){
                        intWeights[i] += 30;
                    }
                    if(chrGrid[1][2] == chrCPU && chrGrid[2][0] == chrCPU){
                        intWeights[i] += 30;
                    }

                    //Loss Prevention Code
                    if(chrGrid[0][1] == chrPlayer && chrGrid[2][1] == chrPlayer){
                        intWeights[i] += 20;
                    }
                    if(chrGrid[1][0] == chrPlayer && chrGrid[1][2] == chrPlayer){
                        intWeights[i] += 20;
                    }
                    if(chrGrid[0][0] == chrPlayer && chrGrid[2][2] == chrPlayer){
                        intWeights[i] += 20;
                    }
                    if(chrGrid[1][2] == chrPlayer && chrGrid[2][0] == chrPlayer){
                        intWeights[i] += 20;
                    }
                }

                else if(intPositions.get(i) == 6){
                    if(chrGrid[0][2] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[0][2] == chrPlayer){
                        intWeights[i] += 2;
                    }
                    else{
                        intWeights[i] += 1;
                    }
                    if(chrGrid[0][1] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[0][1] == chrPlayer){
                        intWeights[i] += 2;
                    }
                    else{
                        intWeights[i] += 1;
                    }
                    if(chrGrid[1][1] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[1][1] == chrPlayer){
                        intWeights[i] += 2;
                    }
                    else{
                        intWeights[i] += 1;
                    }
                    if(chrGrid[2][1] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[2][1] == chrPlayer){
                        intWeights[i] += 2;
                    }
                    else{
                        intWeights[i] += 1;
                    }
                    if(chrGrid[2][2] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[2][2] == chrPlayer){
                        intWeights[i] += 2;
                    }
                    else{
                        intWeights[i] += 1;
                    }

                    //For The Win Code
                    if(chrGrid[1][0] == chrCPU && chrGrid[1][1] == chrCPU){
                        intWeights[i] += 30;
                    }
                    if(chrGrid[0][2] == chrCPU && chrGrid[2][2] == chrCPU){
                        intWeights[i] += 30;
                    }

                    //Loss Prevention Code
                    if(chrGrid[1][0] == chrPlayer && chrGrid[1][1] == chrPlayer){
                        intWeights[i] += 30;
                    }
                    if(chrGrid[0][2] == chrPlayer && chrGrid[2][2] == chrPlayer){
                        intWeights[i] += 30;
                    }
                }

                else if(intPositions.get(i) == 7){
                    if(chrGrid[1][0] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[1][0] == chrPlayer){
                        intWeights[i] += 2;
                    }
                    else{
                        intWeights[i] += 1;
                    }
                    if(chrGrid[0][1] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[0][1] == chrPlayer){
                        intWeights[i] += 2;
                    }
                    else{
                        intWeights[i] += 1;
                    }
                    if(chrGrid[1][1] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[1][1] == chrPlayer){
                        intWeights[i] += 2;
                    }
                    else{
                        intWeights[i] += 1;
                    }

                    //For The Win Code
                    if(chrGrid[0][0] == chrCPU && chrGrid[1][0] == chrCPU){
                        intWeights[i] += 30;
                    }
                    if(chrGrid[2][1] == chrCPU && chrGrid[2][2] == chrCPU){
                        intWeights[i] += 30;
                    }
                    if(chrGrid[1][1] == chrCPU && chrGrid[0][2] == chrCPU){
                        intWeights[i] += 30;
                    }

                    //Loss Prevention Code
                    if(chrGrid[0][0] == chrPlayer && chrGrid[1][0] == chrPlayer){
                        intWeights[i] += 20;
                    }
                    if(chrGrid[2][1] == chrPlayer && chrGrid[2][2] == chrPlayer){
                        intWeights[i] += 20;
                    }
                    if(chrGrid[1][1] == chrPlayer && chrGrid[0][2] == chrPlayer){
                        intWeights[i] += 20;
                    }
                }

                else if(intPositions.get(i) == 8){
                    if(chrGrid[2][0] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[2][0] == chrPlayer){
                        intWeights[i] += 2;
                    }
                    else{
                        intWeights[i] += 1;
                    }
                    if(chrGrid[1][0] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[1][0] == chrPlayer){
                        intWeights[i] += 2;
                    }
                    else{
                        intWeights[i] += 1;
                    }
                    if(chrGrid[1][1] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[1][1] == chrPlayer){
                        intWeights[i] += 2;
                    }
                    else{
                        intWeights[i] += 1;
                    }
                    if(chrGrid[1][2] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[1][2] == chrPlayer){
                        intWeights[i] += 2;
                    }
                    else{
                        intWeights[i] += 1;
                    }
                    if(chrGrid[2][2] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[2][2] == chrPlayer){
                        intWeights[i] += 2;
                    }
                    else{
                        intWeights[i] += 1;
                    }

                    //For The Win Code
                    if(chrGrid[2][0] == chrCPU && chrGrid[2][2] == chrCPU){
                        intWeights[i] += 30;
                    }
                    if(chrGrid[1][1] == chrCPU && chrGrid[0][1] == chrCPU){
                        intWeights[i] += 30;
                    }

                    //Loss Prevention Code
                    if(chrGrid[2][0] == chrPlayer && chrGrid[2][2] == chrPlayer){
                        intWeights[i] += 20;
                    }
                    if(chrGrid[1][1] == chrPlayer && chrGrid[0][1] == chrPlayer){
                        intWeights[i] += 20;
                    }
                }

                else if(intPositions.get(i) == 9){
                    if(chrGrid[1][2] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[1][2] == chrPlayer){
                        intWeights[i] += 2;
                    }
                    else{
                        intWeights[i] += 1;
                    }
                    if(chrGrid[1][1] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[1][1] == chrPlayer){
                        intWeights[i] += 2;
                    }
                    else{
                        intWeights[i] += 1;
                    }
                    if(chrGrid[2][1] == chrCPU){
                        intWeights[i] += 2;
                    }
                    else if(chrGrid[2][1] == chrPlayer){
                        intWeights[i] += 2;
                    }
                    else{
                        intWeights[i] += 1;
                    }

                    //For The Win Code
                    if(chrGrid[2][0] == chrCPU && chrGrid[2][1] == chrCPU){
                        intWeights[i] += 30;
                    }
                    if(chrGrid[0][0] == chrCPU && chrGrid[1][1] == chrCPU){
                        intWeights[i] += 30;
                    }
                    if(chrGrid[0][2] == chrCPU && chrGrid[1][2] == chrCPU){
                        intWeights[i] += 30;
                    }

                    //Loss Prevention Code
                    if(chrGrid[2][0] == chrPlayer && chrGrid[2][1] == chrPlayer){
                        intWeights[i] += 20;
                    }
                    if(chrGrid[0][0] == chrPlayer && chrGrid[1][1] == chrPlayer){
                        intWeights[i] += 20;
                    }
                    if(chrGrid[0][2] == chrPlayer && chrGrid[1][2] == chrPlayer){
                        intWeights[i] += 20;
                    }
                }
            }
            if(intPositions.size() > 7 && chrGrid[1][1] == chrPlayer){
                if(intPositions.contains(1)){
                    intWeights[intPositions.indexOf(1)] += 20;
                }
                if(intPositions.contains(3)){
                    intWeights[intPositions.indexOf(3)] += 20;
                }
                if(intPositions.contains(7)){
                    intWeights[intPositions.indexOf(7)] += 20;
                }
                if(intPositions.contains(9)){
                    intWeights[intPositions.indexOf(9)] += 20;
                }
            }



            if(intPositions.size() > 7 && chrGrid[0][0] == chrPlayer){
                if(intPositions.contains(5)){
                    intWeights[intPositions.indexOf(5)] += 20;
                }
            }
            if(intPositions.size() > 7 && chrGrid[0][2] == chrPlayer){
                if(intPositions.contains(5)){
                    intWeights[intPositions.indexOf(5)] += 20;
                }
            }
            if(intPositions.size() > 7 && chrGrid[2][0] == chrPlayer){
                if(intPositions.contains(5)){
                    intWeights[intPositions.indexOf(5)] += 20;
                }
            }
            if(intPositions.size() > 7 && chrGrid[2][2] == chrPlayer){
                if(intPositions.contains(5)){
                    intWeights[intPositions.indexOf(5)] += 20;
                }
            }



            if(intPositions.size() > 7 && chrGrid[0][1] == chrPlayer){
                if(intPositions.contains(4)){
                    intWeights[intPositions.indexOf(4)] += 20;
                }
                if(intPositions.contains(6)){
                    intWeights[intPositions.indexOf(6)] += 20;
                }
                if(intPositions.contains(8)){
                    intWeights[intPositions.indexOf(8)] += 30;
                }
            }
            if(intPositions.size() > 7 && chrGrid[1][0] == chrPlayer){
                if(intPositions.contains(2)){
                    intWeights[intPositions.indexOf(2)] += 20;
                }
                if(intPositions.contains(6)){
                    intWeights[intPositions.indexOf(6)] += 30;
                }
                if(intPositions.contains(8)){
                    intWeights[intPositions.indexOf(8)] += 20;
                }
            }
            if(intPositions.size() > 7 && chrGrid[1][2] == chrPlayer){
                if(intPositions.contains(4)){
                    intWeights[intPositions.indexOf(4)] += 30;
                }
                if(intPositions.contains(2)){
                    intWeights[intPositions.indexOf(2)] += 20;
                }
                if(intPositions.contains(8)){
                    intWeights[intPositions.indexOf(8)] += 20;
                }
            }
            if(intPositions.size() > 7 && chrGrid[2][1] == chrPlayer){
                if(intPositions.contains(4)){
                    intWeights[intPositions.indexOf(4)] += 30;
                }
                if(intPositions.contains(6)){
                    intWeights[intPositions.indexOf(6)] += 20;
                }
                if(intPositions.contains(8)){
                    intWeights[intPositions.indexOf(2)] += 20;
                }
            }



            if(chrGrid[0][1] == chrPlayer && chrGrid[1][0] == chrPlayer && chrGrid[0][0] == 'n'){
                if(intPositions.contains(1)){
                    intWeights[intPositions.indexOf(1)] += 30;
                }
            }
            if(chrGrid[0][1] == chrPlayer && chrGrid[1][2] == chrPlayer && chrGrid[0][2] == 'n'){
                if(intPositions.contains(3)){
                    intWeights[intPositions.indexOf(3)] += 30;
                }
            }
            if(chrGrid[2][1] == chrPlayer && chrGrid[1][0] == chrPlayer && chrGrid[2][0] == 'n'){
                if(intPositions.contains(7)){
                    intWeights[intPositions.indexOf(7)] += 30;
                }
            }
            if(chrGrid[2][1] == chrPlayer && chrGrid[1][2] == chrPlayer && chrGrid[2][2] == 'n'){
                if(intPositions.contains(9)){
                    intWeights[intPositions.indexOf(9)] += 30;
                }
            }

            boolean CPUIsFirst = true;
            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                    if(chrGrid[i][j] == chrPlayer)CPUIsFirst = false;
                }
            }
            if(CPUIsFirst){
                if(intPositions.contains(1)){
                    intWeights[intPositions.indexOf(1)] += 20;
                }
                if(intPositions.contains(3)){
                    intWeights[intPositions.indexOf(3)] += 20;
                }
                if(intPositions.contains(7)){
                    intWeights[intPositions.indexOf(7)] += 20;
                }
                if(intPositions.contains(9)){
                    intWeights[intPositions.indexOf(9)] += 20;
                }
            }

            int[] intTempPos = new int[intPositions.size()];
            for(int i = 0; i < intPositions.size(); i++){
                intTempPos[i] = intPositions.get(i);
            }
            int[] intSortedPositions = InsertionSort(intWeights, intTempPos);
            int[] intReverseSortedPositions = new int[intSortedPositions.length];
            for(int i = 0; i < intSortedPositions.length; i++){
                intReverseSortedPositions[i] = intSortedPositions[intSortedPositions.length - i - 1];
            }
            int intChoice = 0;
            if(intPositions.size() > 7){
                int PositonSelectionBiasLimit = intReverseSortedPositions.length / 3;
                intChoice = r.nextInt(PositonSelectionBiasLimit);
            }

            if(intReverseSortedPositions.length > 0){
                intPos = intReverseSortedPositions[intChoice];
            }

        }
        
        if(intPos == 1){
            chrGrid[0][0] = chrCPU;
            ImageButton b = findViewById(R.id.btnP1_1);
            if(chrCPU == 'O'){
                b.setBackgroundResource(R.drawable.play_o);
            }
            else{
                b.setBackgroundResource(R.drawable.play_x);
            }
        }
        if(intPos == 2){
            chrGrid[0][1] = chrCPU;
            ImageButton b = findViewById(R.id.btnP1_2);
            if(chrCPU == 'O'){
                b.setBackgroundResource(R.drawable.play_o);
            }
            else{
                b.setBackgroundResource(R.drawable.play_x);
            }
        }
        if(intPos == 3){
            chrGrid[0][2] = chrCPU;
            ImageButton b = findViewById(R.id.btnP1_3);
            if(chrCPU == 'O'){
                b.setBackgroundResource(R.drawable.play_o);
            }
            else{
                b.setBackgroundResource(R.drawable.play_x);
            }
        }
        if(intPos == 4){
            chrGrid[1][0] = chrCPU;
            ImageButton b = findViewById(R.id.btnP1_4);
            if(chrCPU == 'O'){
                b.setBackgroundResource(R.drawable.play_o);
            }
            else{
                b.setBackgroundResource(R.drawable.play_x);
            }
        }
        if(intPos == 5){
            chrGrid[1][1] = chrCPU;
            ImageButton b = findViewById(R.id.btnP1_5);
            if(chrCPU == 'O'){
                b.setBackgroundResource(R.drawable.play_o);
            }
            else{
                b.setBackgroundResource(R.drawable.play_x);
            }
        }
        if(intPos == 6){
            chrGrid[1][2] = chrCPU;
            ImageButton b = findViewById(R.id.btnP1_6);
            if(chrCPU == 'O'){
                b.setBackgroundResource(R.drawable.play_o);
            }
            else{
                b.setBackgroundResource(R.drawable.play_x);
            }
        }
        if(intPos == 7){
            chrGrid[2][0] = chrCPU;
            ImageButton b = findViewById(R.id.btnP1_7);
            if(chrCPU == 'O'){
                b.setBackgroundResource(R.drawable.play_o);
            }
            else{
                b.setBackgroundResource(R.drawable.play_x);
            }
        }
        if(intPos == 8){
            chrGrid[2][1] = chrCPU;
            ImageButton b = findViewById(R.id.btnP1_8);
            if(chrCPU == 'O'){
                b.setBackgroundResource(R.drawable.play_o);
            }
            else{
                b.setBackgroundResource(R.drawable.play_x);
            }
        }
        if(intPos == 9){
            chrGrid[2][2] = chrCPU;
            ImageButton b = findViewById(R.id.btnP1_9);
            if(chrCPU == 'O'){
                b.setBackgroundResource(R.drawable.play_o);
            }
            else{
                b.setBackgroundResource(R.drawable.play_x);
            }
        }
        intPositions.clear();
        checkWin();
        isTurn = true;
    }

    public static int[] InsertionSort(int[] nums, int[] num2){
        int intTemp;
        int intTemp2;
        for ( int i = 1; i < nums.length; i++){
            int j = i;
            while (j > 0 && nums[j - 1] > nums[j]){
                intTemp = nums[j];
                intTemp2 = num2[j];
                nums[j] = nums[j - 1];
                num2[j] = num2[j - 1];
                nums[j - 1] = intTemp;
                num2[j - 1] = intTemp2;
                j--;
            }
        }
        return num2;
    }

    public void checkWin() {
        boolean isTie = true;
        if(isPlaying){
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (chrGrid[i][j] == 'n') {
                        isTie = false;
                    }
                }
            }
        }

        if(isPlaying){
            if (chrGrid[0][0] == chrCPU) {
                if (chrGrid[0][1] == chrCPU && chrGrid[0][2] == chrCPU) {
                    isPlaying = false;
                    Intent i = new Intent(this, LoseActivity.class);
                    startActivity(i);
                    this.finish();
                } else if (chrGrid[1][0] == chrCPU && chrGrid[2][0] == chrCPU) {
                    isPlaying = false;
                    Intent i = new Intent(this, LoseActivity.class);
                    startActivity(i);
                    this.finish();
                } else if (chrGrid[1][1] == chrCPU && chrGrid[2][2] == chrCPU) {
                    isPlaying = false;
                    Intent i = new Intent(this, LoseActivity.class);
                    startActivity(i);
                    this.finish();
                }
            }
            if (chrGrid[0][1] == chrCPU && chrGrid[1][1] == chrCPU && chrGrid[2][1] == chrCPU) {
                isPlaying = false;
                    Intent i = new Intent(this, LoseActivity.class);
                    startActivity(i);
                    this.finish();
            }
            if (chrGrid[0][2] == chrCPU && chrGrid[1][2] == chrCPU && chrGrid[2][2] == chrCPU) {
                isPlaying = false;
                    Intent i = new Intent(this, LoseActivity.class);
                    startActivity(i);
                    this.finish();
            }
            if (chrGrid[1][0] == chrCPU && chrGrid[1][1] == chrCPU && chrGrid[1][2] == chrCPU) {
                isPlaying = false;
                    Intent i = new Intent(this, LoseActivity.class);
                    startActivity(i);
                    this.finish();
            }
            if (chrGrid[2][0] == chrCPU) {
                if (chrGrid[2][1] == chrCPU && chrGrid[2][2] == chrCPU) {
                    isPlaying = false;
                    Intent i = new Intent(this, LoseActivity.class);
                    startActivity(i);
                    this.finish();
                } else if (chrGrid[1][1] == chrCPU && chrGrid[0][2] == chrCPU) {
                    isPlaying = false;
                    Intent i = new Intent(this, LoseActivity.class);
                    startActivity(i);
                    this.finish();
                }
            }

            if (chrGrid[0][0] == chrPlayer) {
                if (chrGrid[0][1] == chrPlayer && chrGrid[0][2] == chrPlayer) {
                    Intent i = new Intent(this, WinScreenP1.class);
                    startActivity(i);
                    isPlaying = false;
                    this.finish();
                    
                } else if (chrGrid[1][0] == chrPlayer && chrGrid[2][0] == chrPlayer) {
                    Intent i = new Intent(this, WinScreenP1.class);
                    startActivity(i);
                    isPlaying = false;
                    this.finish();
                } else if (chrGrid[1][1] == chrPlayer && chrGrid[2][2] == chrPlayer) {
                    Intent i = new Intent(this, WinScreenP1.class);
                    startActivity(i);
                    isPlaying = false;
                    this.finish();
                }
            }
            if (chrGrid[0][1] == chrPlayer && chrGrid[1][1] == chrPlayer && chrGrid[2][1] == chrPlayer) {
                Intent i = new Intent(this, WinScreenP1.class);
                startActivity(i);
                isPlaying = false;
                    this.finish();
            }
            if (chrGrid[0][2] == chrPlayer && chrGrid[1][2] == chrPlayer && chrGrid[2][2] == chrPlayer) {
                Intent i = new Intent(this, WinScreenP1.class);
                startActivity(i);
                isPlaying = false;
                    this.finish();
            }
            if (chrGrid[1][0] == chrPlayer && chrGrid[1][1] == chrPlayer && chrGrid[1][2] == chrPlayer) {
                Intent i = new Intent(this, WinScreenP1.class);
                startActivity(i);
                isPlaying = false;
                    this.finish();
            }
            if (chrGrid[2][0] == chrPlayer) {
                if (chrGrid[2][1] == chrPlayer && chrGrid[2][2] == chrPlayer) {
                    Intent i = new Intent(this, WinScreenP1.class);
                    startActivity(i);
                    isPlaying = false;
                    this.finish();
                } else if (chrGrid[1][1] == chrPlayer && chrGrid[0][2] == chrPlayer) {
                    Intent i = new Intent(this, WinScreenP1.class);
                    startActivity(i);
                    isPlaying = false;
                    this.finish();
                }

            }
        }


        if(isPlaying == false){
            isTie = false;
        }
        if (isTie) {
            Intent i = new Intent(this, TieActivity.class);
            startActivity(i);
            isPlaying = false;
            this.finish();
        }
    }
}
