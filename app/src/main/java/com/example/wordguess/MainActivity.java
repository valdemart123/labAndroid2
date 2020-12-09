package com.example.wordguess;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText wordField;
    String guessedWord = "******";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wordField = (EditText) findViewById(R.id.guesWord);
        wordField.setText(guessedWord);
    }

    public void onLetterClick(View view){
        Button button = (Button)view;
        setLetterToWord(button.getText().charAt(0));
    }

    public void setLetterToWord (char letter) {
        wordField.setText(letter);
    }
}