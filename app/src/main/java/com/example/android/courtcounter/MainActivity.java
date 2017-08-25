package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
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

    public void plusThreePointsTeamA(View view) {
        scoreTeamA += 3;
        displayScoreTeamA();
    }

    public void plusTwoPointsTeamA(View view) {
        scoreTeamA += 2;
        displayScoreTeamA();
    }

    public void plusOnePointTeamA(View view) {
        scoreTeamA ++;
        displayScoreTeamA();
    }

    public void plusThreePointsTeamB(View view) {
        scoreTeamB += 3;
        displayScoreTeamB();
    }

    public void plusTwoPointsTeamB(View view) {
        scoreTeamB += 2;
        displayScoreTeamB();
    }

    public void plusOnePointTeamB(View view) {
        scoreTeamB ++;
        displayScoreTeamB();
    }

    private void displayScoreTeamA() {
        TextView scoreTeamATextView = (TextView) findViewById(R.id.teamA_text_view);
        scoreTeamATextView.setText("" + scoreTeamA);
    }

    private void displayScoreTeamB() {
        TextView scoreTeamBTextView = (TextView) findViewById(R.id.teamB_text_view);
        scoreTeamBTextView.setText("" + scoreTeamB);
    }

    public void resetScore(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayScoreTeamA();
        displayScoreTeamB();
    }

}
