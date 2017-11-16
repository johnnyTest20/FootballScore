package com.example.android.footballscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.android.footballscore.R;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);

    }

    /**
     * Displays the given score for Team A.
     */

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreTeamA);
        scoreView.setText(String.valueOf(score));

    }

    /**
     * adding three points for Team A for Field Goal
     */
    public void fieldGoalTeamA(View View) {

        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * adding six points for Team A for Touchdown
     */

    public void touchDownTeamA(View View) {
        scoreTeamA += 6;
        displayForTeamA(scoreTeamA);
    }

    /**
     * adding one points for Extra Field Goal on Team A
     */
    public void extraPointerFieldGoalTeamA(View View) {

        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * adding one point for two point conversion on Team A
     */
    public void twoPointConversionTeamA(View View) {

        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    public void safetyTeamA(View View) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreTeamB);
        scoreView.setText(String.valueOf(score));

    }

    /**
     * adding three points for Team B for Field Goal
     */
    public void fieldGoalTeamB(View View) {

        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * adding six points for Team B for Touchdown
     */

    public void touchDownTeamB(View View) {
        scoreTeamB += 6;
        displayForTeamB(scoreTeamB);
    }

    /**
     * adding one points for Extra Field Goal on Team B
     */
    public void extraPointerFieldGoalTeamB(View View) {

        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * adding one point for two point conversion on Team B
     */
    public void twoPointConversionTeamB(View View) {

        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * adding two point for Safety on Team B
     */
    public void safetyTeamB(View View) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * /**
     * Resetting all score to zero
     */
    public void reset(View View) {
        scoreTeamA = 0;
        scoreTeamB = 0;

        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);

    }

}


