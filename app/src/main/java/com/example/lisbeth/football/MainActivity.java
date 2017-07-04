package com.example.lisbeth.football;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    int scores = 0;
    int score = 0;
    private Button subt1, subt2, addt1, addt2;
    private TextView tvteam1, tvteam2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        subt1 = (Button) findViewById(R.id.btn_score);
        subt2 = (Button) findViewById(R.id.button2);

        addt1 = (Button) findViewById(R.id.btn_score2);
        addt2 = (Button) findViewById(R.id.button);

        tvteam1 = (TextView) findViewById(R.id.textView4);
        tvteam2 = (TextView) findViewById(R.id.textView5);

        subt1.setOnClickListener(this);
        subt2.setOnClickListener(this);
        addt1.setOnClickListener(this);
        addt2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_score2) {
            score = ++score;
            tvteam1.setText("" + score);
        }
        if (v.getId() == R.id.btn_score) {
            if (score == 0)
            {
                return;
            }
            score = score - 1;
            tvteam1.setText("" + score);
        }
        if (v.getId() == R.id.button) {
            scores = ++scores;
            tvteam2.setText("" + scores);
        }
        if (v.getId() == R.id.button2) {
            if(scores==0){
                return;
            }
            scores = scores - 1;
            tvteam2.setText("" + scores);

        }
    }
}