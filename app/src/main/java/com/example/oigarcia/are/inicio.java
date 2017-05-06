package com.example.oigarcia.are;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class inicio extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        View boton=findViewById(R.id.button);
        boton.setOnClickListener((View.OnClickListener) this);
    }

    public void onClick (View v){
        Intent intencion= new  Intent(this,Registro.class);
        startActivity(intencion);
    }

    public void salir (View v){
        System.exit(0);


    }



}
