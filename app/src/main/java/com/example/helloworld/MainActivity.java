package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.text);

        // User can tap a button to change the text color of the label.
        findViewById(R.id.changeTextColorButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // change text color of label
                textView.setTextColor(getResources().getColor(R.color.white));
            }
        });

        // User can tap a button to change the color of the background view.
        findViewById(R.id.changeBackgroundButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // change background color
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.yellow_green));
            }
        });

        // User can tap a button to change the text string of the label - Android is Awesome!
        findViewById(R.id.changeTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Android is Awesome!");
            }
        });

        // User can tap on the background view to reset all views to default settings.
        findViewById(R.id.parent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 1. Reset text
                textView.setText("Hello from Blake!");
                // 2. Reset text color
                textView.setTextColor(getResources().getColor(R.color.black));
                // 3. Reset background color
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.light_blue));
            }
        });

        // User can tap the “Change text string” button to update the label with the text from the text field.
        findViewById(R.id.changeCustomTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // change textView to what is in EditView
                String userEnteredText = ((EditText) findViewById(R.id.editText)).getText().toString();

                if (userEnteredText.isEmpty()) {
                    textView.setText("Hello from Blake!");
                } else {
                    textView.setText(userEnteredText);
                }
            }
        });

    }
}