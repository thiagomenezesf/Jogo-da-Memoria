package com.example.jogodamemria;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Inicio extends AppCompatActivity implements View.OnClickListener{
    private Button button;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio);
        button = (Button) findViewById(R.id.button30);
        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view==button){
            Intent i = new Intent(this, Explicacao.class);
            startActivity(i);
        }
    }
}
