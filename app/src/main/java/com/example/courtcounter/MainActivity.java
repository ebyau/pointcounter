package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int scoreTeamA = 0;
int scoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    /**
     * Displays the given score for Team A.
     */
       public void displayscoreForTeamA(int score){
        TextView scoreView =  findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayscoreForTeamB(int score){

           TextView scoreView = findViewById(R.id.team_b_score);
           scoreView.setText(String.valueOf(score));
    }


    /**
     * Adds 3 points for team A.
     */
    public void plusThree(View view){
           scoreTeamA = scoreTeamA + 3;
           displayscoreForTeamA(scoreTeamA);

    }
    /**
     * Adds 2 points for team A.
     */
    public void plusTwo(View view){
        scoreTeamA = scoreTeamA + 2;
        displayscoreForTeamA(scoreTeamA);
    }
    /**
     * Adds 1 point for team A.
     */
    public void freeThrow(View view){
        scoreTeamA = scoreTeamA + 1;
        displayscoreForTeamA(scoreTeamA);
    }
    /**
     * Adds 3 points for team B.
     */
    public void plusThreeTeamB(View view){
        scoreTeamB = scoreTeamB + 3;
        displayscoreForTeamB(scoreTeamB);
    }
    /**
     * Adds 2 points for team B.
     */
    public void plusTwoTeamB(View view){
        scoreTeamB = scoreTeamB + 2;
        displayscoreForTeamB(scoreTeamB);
    }
    /**
     * Adds 1 point for team B.
     */
    public void freeThrowTeamB(View view){
        scoreTeamB = scoreTeamB + 1;
        displayscoreForTeamB(scoreTeamB);
    }
    public void reset(View view) {
        scoreTeamB = 0;
        scoreTeamA = 0;
        displayscoreForTeamB(scoreTeamB);
        displayscoreForTeamA(scoreTeamA);
    }




}

