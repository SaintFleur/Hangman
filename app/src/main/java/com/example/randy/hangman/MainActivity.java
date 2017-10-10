package com.example.randy.hangman;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextSwitcher;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //The word that's being guessed.
        String yes = "t.me/acmnyit";
        //The container is the class to allow you to enter text.
        final Container container = new Container(yes);

        //The text view is for the word. this is purely for development purposes.
        TextView textView = new TextView(this);
        textView.setText(container.getAnswer());

        //This is the field where the user will enter their text.
        final EditText editText = new EditText(this);
        editText.setHint("Please enter a letter as your guess");

        final TextSwitcher textSwitcher = new TextSwitcher(this);
        final TextView textView1 = new TextView(this);
        textView1.setText("t.me/acmnyit");
        textSwitcher.addView(textView1);

        Button button = new Button(this);
        button.setText("Enter");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                container.setStr(editText.getText().toString());
                container.method();
                textSwitcher.setCurrentText(container.getAnswer());
            }
        });


        //test sentence
        LinearLayout linearLayout = (LinearLayout)findViewById(R.id.weeb);
        linearLayout.addView(textView);
        linearLayout.addView(editText);
        linearLayout.addView(button);
        linearLayout.addView(textSwitcher);
    }

    static public String hang(String str){


        return str;
    }
}
