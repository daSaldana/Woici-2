package com.neotecsoft.woici;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

import android.view.View;


public class Registro extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_registro);
        findViewById(R.id.imageView_cancel).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        findViewById(R.id.continuar_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.paso_1).setVisibility(View.GONE);
                findViewById(R.id.paso_2).setVisibility(View.VISIBLE);
            }
        });
        findViewById(R.id.continuar_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.paso_2).setVisibility(View.GONE);
                findViewById(R.id.paso_3).setVisibility(View.VISIBLE);
            }
        });
        findViewById(R.id.continuar_3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((globales)getApplication()).logueado=true;
                startActivity(new Intent(Registro.this, buscar.class));
            }
        });

    }



}
