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

public class Cube extends AppCompatActivity {

    EditText editView;
    Button btn;
    TextView ans;
    Button abtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cube);
        editView =findViewById(R.id.cubeinputText);
        ans =findViewById(R.id.cubeansText);
        btn =findViewById(R.id.cubebutton);
        abtn=findViewById(R.id.cubebutton2);

        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String radious = editView.getText().toString();
                int r = Integer.parseInt(radious);

                double sol = r*r*r;
                ans.setText(""+sol+" m^3");

            }
        });
        abtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String radious = editView.getText().toString();
                int r = Integer.parseInt(radious);
                double area =6*r*r;
                ans.setText(""+area+" m^2");
            }
        });
    }
}