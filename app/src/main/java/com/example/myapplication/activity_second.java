package com.example.myapplication;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class activity_second extends AppCompatActivity {

    Button btn_design,btn_freelance,btn_digital,btn_creative,btn_seo, ben_eco;
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btn_freelance = (Button) findViewById(R.id.buttonfreelance);
        btn_design = (Button) findViewById(R.id.buttongraphic);
        btn_digital = (Button) findViewById(R.id.buttondm);
        btn_creative = (Button) findViewById(R.id.buttoncreative);
        btn_seo = (Button) findViewById(R.id.buttonceo);
        ben_eco = (Button) findViewById(R.id.buttonecomm);

        btn_freelance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(activity_second.this, "freelancing clicked!", Toast.LENGTH_SHORT).show();
              Intent intent = new Intent(activity_second.this, activity_freelance.class);
                startActivity(intent);
            }
        });

        btn_design.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(activity_second.this, "Graphic Design clicked!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(activity_second.this, activity_graphic.class);
                startActivity(intent);
            }
        });

        btn_digital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(activity_second.this, "Digital Marketing clicked!", Toast.LENGTH_SHORT).show();
               Intent intent = new Intent(activity_second.this, activity_dm.class);
                startActivity(intent);
            }
        });
        btn_creative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(activity_second.this, "Creative Writing clicked!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(activity_second.this, activity_creative.class);
                startActivity(intent);
            }
        });
        btn_seo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(activity_second.this, "SEO clicked!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(activity_second.this, activity_seo.class);
                startActivity(intent);
            }
        });
        ben_eco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(activity_second.this, "E Commerce clicked!", Toast.LENGTH_SHORT).show();
               Intent intent = new Intent(activity_second.this, activity_ecomm.class);
                startActivity(intent);
            }
        });

    }



}
