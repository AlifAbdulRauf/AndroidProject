package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class profilmahasiswa extends AppCompatActivity {

    ImageButton btnBack;
    Button btnNilai, btnEdit, btnHapus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profilmahasiswa);

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

        btnBack = findViewById(R.id.BackButton);

        btnBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), detailta.class);
                startActivity(intent);
                finish();
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