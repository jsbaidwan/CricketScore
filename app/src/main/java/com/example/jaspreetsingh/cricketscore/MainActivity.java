package com.example.jaspreetsingh.cricketscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int score = 0;
    int wicket = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Calculate the number of wickets
     */
    public void wicket (View view)   {
        wicket = wicket + 1;
        if (wicket<11) {
            displayWicket(wicket);
        }
        if(wicket==10){
            Toast.makeText(getApplicationContext(),"ALL OUT",Toast.LENGTH_LONG).show();
        }
    }

    /**
     * Increase the number of runs
     */
    public void oneRun(View v)  {
        score = score + 1;
        if (wicket<10) {
            displayScore(score);
        }
    }
    public void twoRun(View v)  {
        score = score + 2;
        if (wicket<10) {
            displayScore(score);
        }
    }
    public void fourRun(View v)  {
        score = score + 4;
        if (wicket<10) {
            displayScore(score);
        }
    }
    public void sixRun(View v)  {
        score = score + 6;
        if (wicket<10) {
            displayScore(score);
        }
    }

    /**
     * Reset the Score and the wickets
     */
    public void reset (View view)   {
        score = 0;
        wicket = 0;
        displayScore(score);
        displayWicket(wicket);
    }

    /**
     * Display score of the team
     */
    public void displayScore(int score)  {
        TextView totalScore = (TextView) findViewById(R.id.run_text_view);
        totalScore.setText(String.valueOf(score));
    }
    public void displayWicket(int wicket)   {
        TextView totalWicket = (TextView) findViewById(R.id.wicket_text_view);
        totalWicket.setText(String.valueOf(wicket));
    }
}
