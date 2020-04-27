package com.example.avehijup;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Lupapassword extends AppCompatActivity {
    private EditText userEmail;
    private Button kirimEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lupapassword);
        userEmail = findViewById(R.id.useremail);
        kirimEmail = findViewById(R.id.kirimemail);

        kirimEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email =
            }



        );

    }


}