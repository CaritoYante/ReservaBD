package com.example.caro.reservabdcaro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre =(EditText) findViewById(R.id.nombre);

    }

    public void clickea(View v){
        Intent intent = new Intent(this, Main2Activity.class);
        Bundle extra = new Bundle();
        extra.putString("nombre", nombre.getText().toString().trim());
        intent.putExtras(extra);
        finish();
        startActivity(intent);
    }
}
