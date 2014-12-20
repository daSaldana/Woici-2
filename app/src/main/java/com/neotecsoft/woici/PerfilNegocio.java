package com.neotecsoft.woici;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


public class PerfilNegocio extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_negocio);
        getSupportActionBar().hide();

        findViewById(R.id.imageButton_volver).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        findViewById(R.id.imageView_estoy_aqui).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.pide_registro).setVisibility(View.VISIBLE);
            }
        });
        findViewById(R.id.dato_extra).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.pide_registro).setVisibility(View.VISIBLE);
            }
        });
        findViewById(R.id.no_registrarme).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.pide_registro).setVisibility(View.GONE);
            }
        });
        findViewById(R.id.button_registrarse).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PerfilNegocio.this,Registro.class));
            }
        });
        if(((globales)getApplication()).logueado){
            ((ImageView)findViewById(R.id.imageView_block)).setImageResource(R.drawable.statics);
        }else{
            findViewById(R.id.imageView_block).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(PerfilNegocio.this,Registro.class));
                }
            });
        }
    }

}
