package com.tweak.multipleviews;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tvfirst, tvway, second, way2, third, way3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvfirst=findViewById(R.id.first);
        tvway=findViewById(R.id.way1);

        second=findViewById(R.id.second);
        way2=findViewById(R.id.way2);
      second.setOnClickListener(this);
      way2.setOnClickListener(this);



        tvfirst=findViewById(R.id.first);
        tvway=findViewById(R.id.way1);
        tvfirst.setOnClickListener(new View.OnClickListener() {     //1st approach
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This is the first text", Toast.LENGTH_SHORT).show();
            }
        });

        tvway.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "It's first way", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public void onClick(View view) {      //2nd approach
        switch (view.getId()){
            case R.id.second:
                Toast.makeText(this, "This is the second text", Toast.LENGTH_SHORT).show();
                break;

            case R.id.way2:
                Toast.makeText(this, "It's second way", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    public void third(View view) {     //3rd approach (used onClick in xml)
        Toast.makeText(this, "This is the third text", Toast.LENGTH_SHORT).show();
    }

    public void way3(View view) {      //used onClick in xml
        Toast.makeText(this, "It's third way", Toast.LENGTH_SHORT).show();
    }
}