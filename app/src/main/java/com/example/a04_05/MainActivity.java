package com.example.a04_05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button somar, subtrair, dividir, multiplicar,sair;
    private TextView resultado;
    private EditText numero01, numero02;
    Double res, n1 , n2;


    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numero01 = (EditText) findViewById(R.id.txt_Imput1);
        numero02 = (EditText) findViewById(R.id.txt_Imput2);
        resultado = (TextView) findViewById(R.id.txt_Result);
        somar = (Button) findViewById(R.id.btn_Somar);
        subtrair = (Button) findViewById(R.id.btn_Subtrair);
        dividir = (Button) findViewById(R.id.btn_Dividir);
        multiplicar = (Button) findViewById(R.id.btn_Multiplicar);
        sair = (Button)findViewById(R.id.btn_Sair);


        sair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


        dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                converte();
                dividir();
            }
        });
        multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                converte();
                multiplicar();
            }
        });
        subtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                converte();
                subtrair();
            }
        });
        somar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                converte();
                somar();
            }
        });
    }

    public void converte(){
        n1 = Double.parseDouble(numero01.getText().toString());
        n2 = Double.parseDouble(numero02.getText().toString());
    }


    private void dividir() {

        res = n2 / n1;
        resultado.setText("" +res );

    }

    private void multiplicar() {

        res = n1 * n2;
        resultado.setText("" +res );
    }

    private void subtrair() {

        res = n2 - n1;
        resultado.setText("" +res );
    }

    private void somar() {

        res = n1 + n2;
        resultado.setText("" +res );

    }




}