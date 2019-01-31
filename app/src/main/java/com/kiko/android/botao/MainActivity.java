package com.kiko.android.botao;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button buttonContador;
    EditText recebeTotalId;

    int total = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        buttonContador = (Button) findViewById(R.id.buttonContador);
        recebeTotalId = (EditText) findViewById(R.id.recebeTotalId);

        buttonContador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total +=1;
                String recebeTotalId = getText(total).toString();

            }
        });
    }
}
