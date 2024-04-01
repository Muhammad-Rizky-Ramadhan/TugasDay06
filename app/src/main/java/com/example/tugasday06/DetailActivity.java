package com.example.tugasday06;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    private String nama, judul, skor, gender, seiyu, desk;
    private int gambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        nama = getIntent().getStringExtra("nama");
        judul = getIntent().getStringExtra("judul");
        skor = getIntent().getStringExtra("skor");
        gender = getIntent().getStringExtra("gender");
        seiyu = getIntent().getStringExtra("seiyu");
        desk = getIntent().getStringExtra("desk");
        gambar = getIntent().getIntExtra("gambar", 0);

        ImageView gambarr = findViewById(R.id.imageView);
        TextView namaa = findViewById(R.id.namaView);
        TextView judull = findViewById(R.id.judulView);
        TextView skorr = findViewById(R.id.skorView);
        TextView genderr = findViewById(R.id.genderView);
        TextView seiyuu = findViewById(R.id.seiyuView);
        TextView deskk = findViewById(R.id.deskView);

        namaa.setText(nama);
        judull.setText(judul);
        skorr.setText(skor);
        genderr.setText(gender);
        seiyuu.setText(seiyu);
        deskk.setText(desk);
        gambarr.setImageResource(gambar);
    }
}