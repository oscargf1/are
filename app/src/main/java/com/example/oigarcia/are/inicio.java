package com.example.oigarcia.are;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
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
        Intent salida=new Intent( Intent.ACTION_MAIN); //Llamando a la activity principal
        finish();

    }



}
