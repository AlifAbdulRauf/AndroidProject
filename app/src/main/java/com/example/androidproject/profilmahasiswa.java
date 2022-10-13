package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class profilmahasiswa extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profilmahasiswa);

        Button btnNilai, btnEdit, btnHapus;

        btnNilai = findViewById(R.id.btnnilai1);
        btnEdit = findViewById(R.id.btnedit);
        btnHapus = findViewById(R.id.btnhapus);


        btnNilai.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), inputnilaita.class);
                startActivity(intent);
            }
        });

        btnEdit.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), editnilaita.class);
                startActivity(intent);
            }
        });


//        btnHapus.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public  void onClick(View view){
//                Intent intent = new Intent(getApplicationContext(), inputnilaita.class);
//                startActivity(intent);
//            }
//        });
    }
}