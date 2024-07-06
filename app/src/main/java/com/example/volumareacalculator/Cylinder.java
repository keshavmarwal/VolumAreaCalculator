package com.example.volumareacalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Cylinder extends AppCompatActivity {
    EditText editView;
    EditText hight;
    Button btn;
    TextView ans;
    Button abtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cylinder);
        editView =findViewById(R.id.inputText);
        ans =findViewById(R.id.ansText);
        btn =findViewById(R.id.button);
        abtn=findViewById(R.id.button2);
        hight =findViewById(R.id.hight);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String radious = editView.getText().toString();
                int r = Integer.parseInt(radious);
                String hig =hight.getText().toString();
                int h = Integer.parseInt(hig);

                double sol = h*3.14*r*r;
                ans.setText(""+sol+" m^3");

            }
        });
        abtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String radious = editView.getText().toString();
                int r = Integer.parseInt(radious);
                String hig =hight.getText().toString();
                int h = Integer.parseInt(hig);
                double area =2*3.14*r*h;
                ans.setText(""+area+" m^2");
            }
        });
    }
}