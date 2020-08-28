package com.example.aleatorio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.solver.widgets.ConstraintHorizontalLayout;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import static java.lang.Integer.valueOf;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView txtResultado;
    private EditText entrada;
    private Button btnEmpezar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtResultado = (TextView) findViewById(R.id.TextViewResultado);
        entrada = (EditText) findViewById(R.id.entrada);

        btnEmpezar = (Button) findViewById(R.id.btnEmpezar);
        btnEmpezar.setOnClickListener(this);
    }//int resultado = Integer.valueOf(entrada.getText().toString());

    @Override
    public void onClick(View view) {

        if(btnEmpezar == view){
            aceptar();
        }
    }

    private void aceptar() {

        int numero = Integer.valueOf(entrada.getText().toString());

        for (int i= 1; i <= numero; i++ ){
            int random =(int)(Math.random()*(numero));
            String resultado = String.valueOf(random);
            txtResultado.setText(resultado);
        }
    }
}