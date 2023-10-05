package com.example.rootscalculater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText etA,etB,etC;
 Button btnCalc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        connectComponents();
    } //dskfskdjhfksjdhfkjsh

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

        if (a.isEmpty() || !TextUtils.isDigitsOnly(a) || (a.isEmpty()) || !TextUtils.isDigitsOnly(a)){

            Toast.makeText(this, "Recheck your data", Toast.LENGTH_SHORT).show();
            return;
        }
        if (b.isEmpty() || !TextUtils.isDigitsOnly(b) || (b.isEmpty()) || !TextUtils.isDigitsOnly(b)){

            Toast.makeText(this, "Recheck your data", Toast.LENGTH_SHORT).show();
            return;
        }
        if (c.isEmpty() || !TextUtils.isDigitsOnly(c) || (c.isEmpty()) || !TextUtils.isDigitsOnly(c)){

            Toast.makeText(this, "Recheck your data", Toast.LENGTH_SHORT).show();
            return;
        }


        double a1, b1, c1, calc, cal1, delta;
        a1 = Double.parseDouble(a);
        b1 = Double.parseDouble(b);
        c1 = Double.parseDouble(c);
        delta = (b1 * b1) - (4 * a1 * c1);
        if (delta == 0) {
            calc = (-1 * b1) / (2 * a1);
            Toast.makeText(this, "Roots are:" + calc, Toast.LENGTH_SHORT).show();
        } else if (delta > 0) {
            calc = ((-1 * b1) - Math.sqrt(delta)) / (2 * a1);
            Toast.makeText(this, "Roots are:" + calc, Toast.LENGTH_SHORT).show();
            cal1 = ((-1 * b1) + Math.sqrt(delta)) / (2 * a1);
            Toast.makeText(this, "Roots are:" + cal1, Toast.LENGTH_SHORT).show();
        } else Toast.makeText(this, "There is no roots", Toast.LENGTH_SHORT).show();
    }
}