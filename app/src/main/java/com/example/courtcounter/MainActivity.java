package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    final int TRY_POINTS = 5;
    final int PENALTY_POINT = 3;
    final int DROP_GOAL_POINT = 3;
    final int CONVERSATION_POINTS = 2;
    int initialPoint = 0;
    int totalPointsTeamA = 0;
    int totalPointsTeamB = 0;
    int totalFoulPlaysTeamA = 0;
    int totalFoulPlaysTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayPointsTeamA(initialPoint);
        displayPointsTeamB(initialPoint);
    }

    private void displayPointsTeamA(int point) {
        TextView teamAtextView = findViewById(R.id.team_a_score);
        teamAtextView.setText(""+ point);
    }
    private void displayPointsTeamB(int point) {
        TextView teamAtextView =  findViewById(R.id.team_b_score);
        teamAtextView.setText(""+ point);
    }
    private  void displayTeamAFoulPoints() {
        TextView teamAFoulTextView = findViewById(R.id.team_a_foul);
        teamAFoulTextView.setText(""+ totalFoulPlaysTeamA);
    }
    private  void displayTeamBFoulPoints() {
        TextView teamAFoulTextView = findViewById(R.id.team_b_foul);
        teamAFoulTextView.setText(""+ totalFoulPlaysTeamB);
    }

    public void resetScores(View view){
        TextView teamAtextView = findViewById(R.id.team_a_score);
        TextView teamAfoulView = findViewById(R.id.team_a_foul);
        totalPointsTeamA = 0;
        totalFoulPlaysTeamA = 0;
        teamAtextView.setText("" + totalPointsTeamA);
        teamAfoulView.setText("" + totalFoulPlaysTeamA);
        teamAtextView = findViewById(R.id.team_b_score);
        TextView teamBfoulView = findViewById(R.id.team_b_foul);
        totalPointsTeamB = 0;
        totalFoulPlaysTeamB = 0;
        teamAtextView.setText("" + totalPointsTeamB);
        teamBfoulView.setText("" + totalFoulPlaysTeamB);
    }
    public  void foulPlayTeamA(View view) {
        totalFoulPlaysTeamA = totalFoulPlaysTeamA + 1;
        displayTeamAFoulPoints();
    }
    public  void foulPlayTeamB(View view) {
        totalFoulPlaysTeamB = totalFoulPlaysTeamB + 1;
        displayTeamBFoulPoints();
    }
    public void tryPointsTeamA(View view) {
        totalPointsTeamA = totalPointsTeamA + TRY_POINTS;
        displayPointsTeamA(totalPointsTeamA);
    }
    public void penaltyPointsTeamA(View view) {
        totalPointsTeamA = totalPointsTeamA + PENALTY_POINT;
        displayPointsTeamA(totalPointsTeamA);
    }
    public void dropGoalPointsTeamA(View view) {
        totalPointsTeamA = totalPointsTeamA + DROP_GOAL_POINT;
        displayPointsTeamA(totalPointsTeamA);
    }
    public void conversationPointsTeamA(View view) {
        totalPointsTeamA = totalPointsTeamA + CONVERSATION_POINTS;
        displayPointsTeamA(totalPointsTeamA);
    }
    public void tryPointsTeamB(View view) {
        totalPointsTeamB = totalPointsTeamB + TRY_POINTS;
        displayPointsTeamB(totalPointsTeamB);
    }
    public void penaltyPointsTeamB(View view) {
        totalPointsTeamB = totalPointsTeamB + PENALTY_POINT;
        displayPointsTeamB(totalPointsTeamB);
    }
    public void dropGoalPointsTeamB(View view) {
        totalPointsTeamB = totalPointsTeamB + DROP_GOAL_POINT;
        displayPointsTeamB(totalPointsTeamB);
    }
    public void conversationPointsTeamB(View view) {
        totalPointsTeamB = totalPointsTeamB + CONVERSATION_POINTS;
        displayPointsTeamB(totalPointsTeamB);
    }
}
