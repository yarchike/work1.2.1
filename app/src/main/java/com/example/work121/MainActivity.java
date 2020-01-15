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

        final TextView exampleText=(TextView)findViewById(R.id.textOutpot);
        final EditText editTextname = (EditText)findViewById(R.id.nameUserInput);
        final EditText editTextemail = (EditText)findViewById(R.id.emailUserInput);

        Button buttonOk = (Button) findViewById(R.id.buttonOk);
        Button buttonClean = (Button) findViewById(R.id.buttonClean);

        buttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextname.getText().toString();
                String email = editTextemail.getText().toString();
                exampleText.setText("Подписка на рассылку успешно оформлена для пользователя " + name + " на электроный адрес " + email);

            }
        });
        buttonClean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextname.getText().clear();
                editTextemail.getText().clear();

            }
        });



    }
}
