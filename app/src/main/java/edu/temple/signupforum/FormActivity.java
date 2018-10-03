package edu.temple.signupforum;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {

    EditText name;
    EditText email;
    EditText password;
    EditText passwordcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        name = findViewById(R.id.editText);
        email = findViewById(R.id.editText2);
        password = findViewById(R.id.editText3);
        passwordcon = findViewById(R.id.editText4);

        Button savebutton = findViewById(R.id.button);

        savebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((name.getText().toString().equals("")) || email.getText().toString().equals("") || password.getText().toString().equals("")  || passwordcon.getText().toString().equals("")){
                    Toast toast = Toast.makeText(FormActivity.this, R.string.toast1, Toast.LENGTH_SHORT);
                    toast.show();
                }
                else if (!password.getText().toString().equals(passwordcon.getText().toString())){
                    Toast toast = Toast.makeText(FormActivity.this, R.string.toast2, Toast.LENGTH_SHORT);
                    toast.show();
                }
                else {
                    Intent intent = new Intent(FormActivity.this, FrontPage.class);
                    intent.putExtra("extra_name", name.getText().toString());
                    startActivity(intent);
                }

            }
        });

    }
}
