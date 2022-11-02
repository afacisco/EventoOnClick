package com.example.eventoonclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

/*
Autor: Juan Francisco Sánchez González
Fecha: 01/11/2022
Clase: Segunda actividad que recibe el texto (nombre) y lo muestra en un control
*/

public class SaludoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);

        TextView mostrarSaludo = (TextView) findViewById(R.id.tvMuestraSaludo);
        mostrarSaludo.setText(getIntent().getStringExtra("nombreUsuario").toString());
    }
}