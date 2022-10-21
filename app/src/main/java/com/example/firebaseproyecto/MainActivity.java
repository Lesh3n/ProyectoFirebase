package com.example.firebaseproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    Button btnAgregar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAgregar = (Button) findViewById(R.id.btnAgregar);
        btnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Presionaste el botón agregar", Toast.LENGTH_SHORT).show();
                insertar();
            }
        });
    }
    public void insertar() {
        // Write a message to the database
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("Alumno").child("r1"); // Busca una clave que se llama alumno y crea un hijo de r1 para guardar todos los datos dentro.

        myRef.child("Nombre").setValue("Andrés"); // A r1 agréguele la clave Nombre y valor Andrés
        myRef.child("Apellido").setValue("Ibáñez");  // A r1 agréguele la clave Apellido y valor Ibáñez


        myRef.setValue("Hello, World!");
    }
}