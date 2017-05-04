package com.example.jaspreetsingh.cricketscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void oneRun(View v)  {
        score = score + 1;
        displayScore(score);
    }
    public void twoRun(View v)  {
        score = score + 2;
        displayScore(score);
    }
    public void fourRun(View v)  {
        score = score + 4;
        displayScore(score);
    }
    public void sixRun(View v)  {
        score = score + 6;
        displayScore(score);
    }

    public void displayScore(int score)  {
        TextView totalScore = (TextView) findViewById(R.id.run_text_view);
        totalScore.setText(String.valueOf(score));
    }
}
