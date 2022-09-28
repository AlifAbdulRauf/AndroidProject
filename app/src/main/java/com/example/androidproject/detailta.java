package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.net.Uri;

public class detailta extends AppCompatActivity {

    Button btnDetailSeminar, btnDetailSidang, btnListLogBook, btnPembatalanTA;
    ImageButton ibProfil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailta);



        btnDetailSeminar = findViewById(R.id.btnDetSeminar);
        btnDetailSidang = findViewById(R.id.btnDetSidang);
        btnListLogBook = findViewById(R.id.btnListLogBook);
        btnPembatalanTA = findViewById(R.id.btnPembatalanTA);
        ibProfil = findViewById(R.id.ibProfilMahasiswa);

        btnDetailSeminar.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), DetailSeminar.class);
                startActivity(intent);
            }
        });

        btnListLogBook.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), ListLogBook.class);
                startActivity(intent);
            }
        });

        btnDetailSidang.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), DetailSidang.class);
                startActivity(intent);
            }
        });

        btnPembatalanTA.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), FormPembatalan.class);
                startActivity(intent);
            }
        });

        ibProfil.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), profilmahasiswa.class);
                startActivity(intent);
            }
        });

    }
}