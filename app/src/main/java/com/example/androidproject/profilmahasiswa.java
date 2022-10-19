package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class profilmahasiswa extends AppCompatActivity {

    ImageButton btnBack;
    TextView nama2, nim2, alamat2, ttl2;
    Button btnNilai, btnEdit, btnHapus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profilmahasiswa);

        btnNilai = findViewById(R.id.btnnilai1);
        btnEdit = findViewById(R.id.btnedit);
        btnHapus = findViewById(R.id.btnhapus);

        String nama = getIntent().getExtras().getString("EXRA_NAMA");
        nama2 = findViewById(R.id.tvnama);
        nama2.setText(nama);

        String nim = getIntent().getExtras().getString("EXRA_NIM");
        nim2 = findViewById(R.id.tvnim);
        nim2.setText(nim);

        String alamat = getIntent().getExtras().getString("EXRA_ALAMAT");
        alamat2 = findViewById(R.id.tvalamat);
        alamat2.setText(alamat);

        String ttl = getIntent().getExtras().getString("EXRA_TTL");
        ttl2 = findViewById(R.id.tvttl);
        ttl2.setText(ttl);

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