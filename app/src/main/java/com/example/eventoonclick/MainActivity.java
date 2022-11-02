package com.example.eventoonclick;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/*
Autor: Juan Francisco Sánchez González
Fecha: 01/11/2022
Clase: Actividad principal que recoge el texto (nombre) del usuario y se lo
pasamos a una segunda actividad controlando el evento onClick del botón
*/

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Iniciamos la nueva actividad pasándole el texto
    @Override
    protected void onResume() {
        super.onResume();

        EditText nombre = (EditText) findViewById(R.id.etNombre);
        Button btnSiguiente = (Button) findViewById(R.id.btnSaludo);
        Intent i = new Intent(this, SaludoActivity.class);

        // Listener del evento OnClick del botón
        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i.putExtra("nombreUsuario", nombre.getText().toString());
                startActivity(i);
            }
        });


    }
}