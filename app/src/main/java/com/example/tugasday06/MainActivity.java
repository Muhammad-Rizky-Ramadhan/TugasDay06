package com.example.tugasday06;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private Adapter adapter;
    private ArrayList<Model> arrayModell;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getData();

        recyclerView = findViewById(R.id.recycleview);
        adapter = new Adapter(arrayModell, this);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void getData() {
        arrayModell = new ArrayList<>();
        arrayModell.add(new Model("Frieren","anime : Sousou no Frieren", "skor : 9.39", "gender : Woman", "VA : Atsumi Tanezaki", getString(R.string.sou), R.drawable.frieren));
        arrayModell.add(new Model("Fern","anime : Sousou no Frieren", "skor : 9.39", "gender : Woman", "VA : Kana Ichinose", getString(R.string.sou), R.drawable.fern));
        arrayModell.add(new Model("Stark","anime : Sousou no Frieren", "skor : 9.39", "gender : Man", "VA : Chiaki Kobayashi", getString(R.string.sou), R.drawable.stark));
        arrayModell.add(new Model("Aura","anime : Sousou no Frieren", "skor : 9.39", "gender : Woman", "VA : Ayana Taketatsu", getString(R.string.sou) , R.drawable.aura));
        arrayModell.add(new Model("Denken","anime : Sousou no Frieren", "skor : 9.39", "gender : Man", "VA : Jirou Saitou", getString(R.string.sou), R.drawable.denken));
        arrayModell.add(new Model("Ubel","anime : Sousou no Frieren", "skor : 9.39", "gender : Woman", "VA : Ikumi Hasegawa", getString(R.string.sou), R.drawable.ubel));
        arrayModell.add(new Model("Himmel","anime : Sousou no Frieren", "skor : 9.39", "gender : Man", "VA : Nabuhiko Okamoto", getString(R.string.sou), R.drawable.himmel));
        arrayModell.add(new Model("Kaguya Shinomiya","anime : Kaguya-sama wa Kokuraseta", "skor : 9.02", "gender : Woman", "VA : Aoi Koga", getString(R.string.kaguya), R.drawable.kaguya));
        arrayModell.add(new Model("Miyuki Shirogane","anime : Kaguya-sama wa Kokurasetai", "skor : 9.02", "gender : Man", "VA : Makoto Furukawa", getString(R.string.kaguya), R.drawable.miyuki));
        arrayModell.add(new Model("Chika Fujiwara","anime : Kaguya-sama wa Kokurasetai", "skor : 9.02", "gender : Woman", "VA : Konomi Kohara", getString(R.string.kaguya), R.drawable.chika));
        arrayModell.add(new Model("Yuu Ishigami","anime : Kaguya-sama wa Kokurasetai", "skor : 9.02", "gender : Man", "VA : Ryouta Suzuki", getString(R.string.kaguya), R.drawable.yuu));
        arrayModell.add(new Model("Miko Iino","anime : Kaguya-sama wa Kokurasetai", "skor : 9.02", "gender : Woman", "VA : Miyu Tomita", getString(R.string.kaguya), R.drawable.iino));
        arrayModell.add(new Model("Maomao","anime : Kusuriya no Hitorigoto", "skor : 8.93", "gender : Woman", "VA : Aoi Yuuki", getString(R.string.mao), R.drawable.maomao));
        arrayModell.add(new Model("Jinshi","anime : Kusuriya no Hitorigoto", "skor : 8.93", "gender : Man", "VA : Takeo Ootsuka", getString(R.string.mao), R.drawable.jinshi));
        arrayModell.add(new Model("Gyokuyou","anime : Kusuriya no Hitorigoto", "skor : 8.93", "gender : Woman", "VA : Atsumi Tanezaki", getString(R.string.mao), R.drawable.gyokuyou));
    }
}