package edu.temple.signupforum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FrontPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front_page);

        String name = getIntent().getStringExtra("extra_name");
        TextView textView = findViewById(R.id.textView5);

        textView.setText("Welcome, " + name + ".  Here is the front page!");
    }
}
