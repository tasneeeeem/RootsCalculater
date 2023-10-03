package com.example.rootscalculater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {
EditText etA,etB,etC;
 Button btnCalc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        connectComponents();
    }

    private void connectComponents() {
        etA=findViewById(R.id.etA);
        etB=findViewById(R.id.etB);
        etC=findViewById(R.id.etC);
        btnCalc=findViewById(R.id.btnCalc);

    }

    public void Calculateroots(View view) {
        String a=etA.getText().toString();
        String b=etB.getText().toString();
        String c=etC.getText().toString();
double a,b,c,calc;
        a=Double.parseDouble(a);
        b=Double.parseDouble(b);
        c=Double.parseDouble(c);
calc=
    }
}