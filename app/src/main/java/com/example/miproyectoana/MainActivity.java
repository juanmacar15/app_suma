package com.example.miproyectoana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText et1, et2;
    TextView tv1;
    Button btnSumar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.txtNumero1);
        et2 = (EditText)findViewById(R.id.txtNumero2);
        tv1 = (TextView)findViewById(R.id.lblRsultado);
        btnSumar = (Button)findViewById(R.id.btnSumar);
        btnSumar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        float n1, n2, res;
        n1 = Float.parseFloat(et1.getText().toString());
        n2 = Float.parseFloat(et2.getText().toString());
        res = n1 + n2;
        tv1.setText("el resultado es: "+res);
        Toast.makeText(getApplicationContext(), "El resultado es: "+res, Toast.LENGTH_LONG).show();
    }
}