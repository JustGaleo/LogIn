package com.example.cecyt9.login;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtUsuario, txtContra;
    TextView lblMsj, text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUsuario=(EditText) findViewById(R.id.editText);
        txtContra = (EditText) findViewById(R.id.editText2);
        lblMsj = (TextView) findViewById(R.id.MSJ);


    }

    public void entrar(View laVistaXML){

        String usr = "AnaHS";
        String contra = "12345";
        if(txtUsuario.getText().toString().equals("AnaHS") && txtContra.getText().toString().equals("12345") ){

            Intent miIntento = new Intent(this, inicio.class);

            miIntento.putExtra("nombreusr", usr);
            miIntento.putExtra("contraseña", contra);
            startActivity(miIntento);
        } else{


            String msj = "Usuario y/o contraseña incorrectos";
            lblMsj.setText(msj);

            /*

            TextView text = (TextView) laVistaXML.findViewById(R.id.text);
            text.setText("Usuario y/o contraseña incorrectos");

            Toast toast = new Toast(getApplicationContext());
            toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
            toast.setDuration(Toast.LENGTH_LONG);
            toast.setView(laVistaXML);
            toast.show();*/

        }
    }
}
