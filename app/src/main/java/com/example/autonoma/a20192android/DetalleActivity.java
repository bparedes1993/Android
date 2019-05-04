package com.example.autonoma.a20192android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetalleActivity extends AppCompatActivity {

    TextView tvNombre, tvCorreo, tvTelefono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        //Asignamos
        tvNombre= findViewById(R.id.tvNombre);
        tvCorreo= findViewById(R.id.tvCorreo);
        tvTelefono= findViewById(R.id.tvTelefono);

        //Recuperamos valores
        Bundle bundle = getIntent().getExtras();

        //Asignamos valores a los textView
        tvNombre.setText(bundle.getString("nombre"));
        tvCorreo.setText(bundle.getString("correo"));
        tvTelefono.setText(bundle.getString("telefono"));
    }
}
