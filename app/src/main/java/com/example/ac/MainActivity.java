package com.example.ac;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView deg,mode;
    boolean status=true,m=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        deg=findViewById(R.id.deg);
        mode=findViewById(R.id.mode);
    }

    public void pd(View view) {
        if(status){
            if(Integer.parseInt(deg.getText().toString())<30)
                deg.setText(String.valueOf(Integer.parseInt(deg.getText().toString())+1));
        }
    }

    public void md(View view) {
        if(status){
            if(Integer.parseInt(deg.getText().toString())>16)
                deg.setText(String.valueOf(Integer.parseInt(deg.getText().toString())-1));
        }
    }

    public void checkstatus(View view) {
        if(status)
            status=false;
        else
            status=true;
    }

    public void checkm(View view) {
        if(status){
            if(m)
                mode.setText("HEAT");
            else
                mode.setText("COLD");
            m=!m;
        }
    }
}