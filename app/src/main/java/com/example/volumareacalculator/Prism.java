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

public class Prism extends AppCompatActivity {
    EditText editView;
    EditText side1;
    EditText side3;
    Button btn;
    TextView ans;
    Button abtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_prism);
        editView =findViewById(R.id.inputText);
        ans =findViewById(R.id.ansText);
        btn =findViewById(R.id.button);
        abtn=findViewById(R.id.button2);
        side1=findViewById(R.id.inputText2);
        side3=findViewById(R.id.inputText3);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String radious = editView.getText().toString();
                int r = Integer.parseInt(radious);
                String sidee1 = side1.getText().toString();
                int s1 = Integer.parseInt(sidee1);
                String sidee3 = side3.getText().toString();
                int s3 = Integer.parseInt(sidee3);
                double sol = s1*r*s3;
                ans.setText(""+sol+" m^3");

            }
        });
        abtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String radious = editView.getText().toString();
                int r = Integer.parseInt(radious);
                String sidee1 = side1.getText().toString();
                int s1 = Integer.parseInt(sidee1);
                String sidee3 = side3.getText().toString();
                int s3 = Integer.parseInt(sidee3);
                double area =2*(s1*s3 + s1*r + s3*r);
                ans.setText(""+area+" m^2");
            }
        });
    }
}