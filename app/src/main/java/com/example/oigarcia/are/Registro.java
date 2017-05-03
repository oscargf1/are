package com.example.oigarcia.are;

import android.content.Intent;
import android.app.Activity;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
public class Registro extends Activity implements View.OnClickListener {



    EditText n,a,m,c;
    int opc;
    String tipo;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        View boton=findViewById(R.id.button2);
        boton.setOnClickListener((View.OnClickListener) this);

    }

    public void onClick (View v) {

        //Intent intencion= new  Intent(this,Confirmacion.class);
        //intencion.putExtra(Confirmacion.nom, nombre)
        //startActivity(intencion);

        n = (EditText) findViewById(R.id.editText);
        a = (EditText) findViewById(R.id.editText2);
        m = (EditText) findViewById(R.id.editText3);
        c = (EditText) findViewById(R.id.editText4);

        final RadioGroup r = (RadioGroup) findViewById(R.id.rg);
        final RadioButton rb = (RadioButton) findViewById(R.id.radio1);
        final CheckBox con = (CheckBox) findViewById(R.id.checkBox);

        opc = r.getCheckedRadioButtonId();

        if (TextUtils.isEmpty(n.getText())) {
            n.setError("Diligencie este campo");
            return;
        }

        if (TextUtils.isEmpty(a.getText())) {
            a.setError("Diligencie este campo");
            return;
        }

        if (TextUtils.isEmpty(m.getText())) {
            m.setError("Diligencie este campo");
            return;
        }

        if (TextUtils.isEmpty(c.getText())) {
            c.setError("Diligencie este campo");
            return;
        }


            if (con.isChecked()) {

                if (opc == -1) {
                    Toast.makeText(this, "Seleccione Tipo", Toast.LENGTH_SHORT).show();
                } else {
                    if (rb.isChecked()) {
                        tipo = "Usuario";
                    } else {
                        tipo = "Mecanismo de Emergencia";
                    }

                    AlertDialog.Builder ventana = new AlertDialog.Builder(this);
                    ventana.setTitle("Registro Exitoso ");
                    ventana.setMessage("Señor (a) " + n.getText() + " " + a.getText() + "\n" + "Ha quedado registrado con la siguiente informacion:" + "\n" +
                            "Telefono: " + c.getText() + "\n" + "Mail: " + m.getText() + "\n" + "Tipo: " + tipo);
                    ventana.show();
                }
            } else {
                Toast.makeText(this, "Debe aceptar las condiciones", Toast.LENGTH_SHORT).show();
            }



      }

    public void salir (View v){
        Intent salida=new Intent( Intent.ACTION_MAIN); //Llamando a la activity principal
        finish();

    }


    }
