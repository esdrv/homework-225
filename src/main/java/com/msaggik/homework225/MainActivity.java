    package com.msaggik.homework225;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

    public class MainActivity extends AppCompatActivity {
        private TextView questinOut;

    Algorithm algorithm = new Algorithm();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        questinOut = findViewById(R.id.questionOut);

        button.setOnClickListener(listner);
    }
    private final View.OnClickListener listner = new View.OnClickListener() {
        @Override

        public void onClick(View view) {

            questinOut.setText(algorithm.moderator());
        }
    };
}