package com.example.caro.reservabdcaro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private TextView txTexto;
    private String nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txTexto = (TextView) findViewById(R.id.texto);

        TreDatos();

    }

    public void TreDatos(){
        Bundle extra = new Bundle();
        extra = this.getIntent().getExtras();
        nombre = extra.getString("nombre");
        txTexto.setText("Nombre: " + nombre);
    }
}
