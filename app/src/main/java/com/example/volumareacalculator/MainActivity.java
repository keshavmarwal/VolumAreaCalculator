package com.example.volumareacalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView gridView;

    ArrayList<Shape> shapess;

    MyCustomAdapter adepter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        gridView =findViewById(R.id.gridView);
        shapess = new ArrayList<>();

        Shape s1 =new Shape(R.drawable.cube,"Cube");
        Shape s2 =new Shape(R.drawable.cylinder,"Cylinder");
        Shape s3 =new Shape(R.drawable.prism,"Cuboid");
        Shape s4 =new Shape(R.drawable.sphere,"Sphere");

        shapess.add(s1);
        shapess.add(s2);
        shapess.add(s3);
        shapess.add(s4);
        adepter =new MyCustomAdapter(getApplicationContext(),shapess);
        gridView.setAdapter(adepter);
        gridView.setNumColumns(2);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String str=adepter.getItem(position).getText();
                if(str == "Cube"){
              Intent i =new Intent(getApplicationContext(),Cube.class);
              startActivity(i);}

                  if(str == "Sphere"){
                Intent i =new Intent(getApplicationContext(),Sphere.class);
                startActivity(i);}

        if(str == "Cylinder"){
            Intent i =new Intent(getApplicationContext(),Cylinder.class);
            startActivity(i);}
                if(str == "Cuboid"){
                    Intent i =new Intent(getApplicationContext(),Prism.class);
                    startActivity(i);}

    }
        });




    }
}