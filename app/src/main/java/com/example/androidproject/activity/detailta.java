package com.example.androidproject.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.converter.gson.GsonConverterFactory;

import com.example.androidproject.R;
import com.example.androidproject.model.UserApi;
import com.example.example.DetailTAResponse;

import retrofit2.Retrofit;

public class detailta extends AppCompatActivity {

    Button btnDetailSeminar, btnDetailSidang, btnListLogBook, btnPembatalanTA;
    ImageButton btnBack;
    ImageButton ibProfil;
    TextView tvNamaDosen, tvNipDosen, tvNamaMahasiswa, tvNimMahasiswa, tvJudulTA, tvGrade, tvAbstrak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailta);


        btnBack = findViewById(R.id.BackButton);
        tvNamaDosen = findViewById(R.id.namadosen);
        tvNipDosen = findViewById(R.id.nipdosen);
        tvNamaMahasiswa = findViewById(R.id.namamahasiswa2);
        tvNimMahasiswa = findViewById(R.id.nimmahasiwa2);
        tvJudulTA = findViewById(R.id.judultamahasiswa2);
        tvGrade = findViewById(R.id.grade3);
        tvAbstrak = findViewById(R.id.detaita3);
        getData();

        btnBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), ProfilDanListActivity.class);
                startActivity(intent);
            }
        });

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

    public void getData(){

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://ptb-api.husnilkamil.my.id/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJodHRwOi8vcHRiLWFwaS5odXNuaWxrYW1pbC5teS5pZC9hcGkvbG9naW4iLCJpYXQiOjE2NzI5NDE2NjAsImV4cCI6MTY3Mjk0NTI2MCwibmJmIjoxNjcyOTQxNjYwLCJqdGkiOiJ2R0lKd1d1cW1qN050YkZmIiwic3ViIjoiMiIsInBydiI6IjIzYmQ1Yzg5NDlmNjAwYWRiMzllNzAxYzQwMDg3MmRiN2E1OTc2ZjcifQ.xBBEHwzXgIZ38UWEyeZu4zvLst8t4bwh9QhdwS0JMOI";
        Call<DetailTAResponse> call = retrofit.create(UserApi.class).detailTA("Bearer "+ token);
        call.enqueue(new Callback<DetailTAResponse>() {
            @Override
            public void onResponse(Call<DetailTAResponse> call, Response<DetailTAResponse> response) {
               DetailTAResponse detailTAResponse=response.body();
                System.out.println("respon data : "+detailTAResponse);
               tvNamaDosen.setText(detailTAResponse.getSupervisors().get(0).getName());
               tvNipDosen.setText(detailTAResponse.getSupervisors().get(0).getNip());
               tvNamaMahasiswa.setText(detailTAResponse.getStudent().getName());
               tvNimMahasiswa.setText(detailTAResponse.getStudent().getNim());
               tvJudulTA.setText(detailTAResponse.getTitle());
               tvGrade.setText(detailTAResponse.getGrade());
               tvAbstrak.setText(detailTAResponse.getAbstract());
            }

            @Override
            public void onFailure(Call<DetailTAResponse> call, Throwable t) {
                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

}