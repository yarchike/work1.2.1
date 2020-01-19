package com.example.work121;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText editTextname = (EditText)findViewById(R.id.nameUserInput);
        final EditText editTextemail = (EditText)findViewById(R.id.emailUserInput);
        final TextView exampleText=(TextView)findViewById(R.id.textOutpot);
        buttonClicOk(editTextname, editTextemail, exampleText);
        buttonClicClean(editTextname, editTextemail, exampleText);

    }
    private void buttonClicOk(final EditText editTextname, final EditText editTextemail, final TextView exampleText){
        Button buttonOk = (Button) findViewById(R.id.buttonOk);
        buttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextname.getText().toString();
                String email = editTextemail.getText().toString();
                String textSubscription = getString(R.string.text_subscription);
                String textEmail = getString(R.string.text_email);
                exampleText.setText(textSubscription + name + textEmail + email);

            }
        });
    }
    private void buttonClicClean(final EditText editTextname, final EditText editTextemail,  final TextView exampleText){
        Button buttonClean = (Button) findViewById(R.id.buttonClean);

        buttonClean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextname.getText().clear();
                editTextemail.getText().clear();
                exampleText.setText(null);


            }
        });
    }

}
