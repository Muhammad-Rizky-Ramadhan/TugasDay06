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
        arrayModell.add(new Model("Frieren","Sousou no Frieren", "9.39", "Woman", "Atsumi Tanezaki", "", R.drawable.jjk));
        arrayModell.add(new Model("Fern","Sousou no Frieren", "9.39", "Woman", "Kana Ichinose", "", R.drawable.jjk));
        arrayModell.add(new Model("Stark","Sousou no Frieren", "9.39", "Man", "Chiaki Kobayashi", "", R.drawable.jjk));
        arrayModell.add(new Model("Aura","Sousou no Frieren", "9.39", "Woman", "Ayana Taketatsu", getString(R.string.frieren) , R.drawable.jjk));
        arrayModell.add(new Model("Denken","Sousou no Frieren", "9.39", "Man", "Jirou Saitou", "", R.drawable.jjk));
        arrayModell.add(new Model("Ubel","Sousou no Frieren", "9.39", "Woman", "Ikumi Hasegawa", "", R.drawable.jjk));
        arrayModell.add(new Model("Himmel","Sousou no Frieren", "9.39", "Man", "Nabuhiko Okamoto", "", R.drawable.jjk));
        arrayModell.add(new Model("Kaguya Shinomiya","Kaguya-sama wa Kokuraseta", "9.02", "Woman", "Aoi Koga", "", R.drawable.jjk));
        arrayModell.add(new Model("Miyuki Shirogane","Kaguya-sama wa Kokurasetai", "9.02", "Man", "Makoto Furukawa", "", R.drawable.jjk));
        arrayModell.add(new Model("Chika Fujiwara","Kaguya-sama wa Kokurasetai", "9.02", "Woman", "Konomi Kohara", "", R.drawable.jjk));
        arrayModell.add(new Model("Yuu Ishigami","Kaguya-sama wa Kokurasetai", "9.02", "Man", "Ryouta Suzuki", "", R.drawable.jjk));
        arrayModell.add(new Model("Miko Iino","Kaguya-sama wa Kokurasetai", "9.02", "Woman", "Miyu Tomita", "", R.drawable.jjk));
        arrayModell.add(new Model("Maomao","Kusuriya no Hitorigoto", "8.93", "Woman", "Aoi Yuuki", "", R.drawable.jjk));
        arrayModell.add(new Model("Jinshi","Kusuriya no Hitorigoto", "8.93", "Man", "Takeo Ootsuka", "", R.drawable.jjk));
        arrayModell.add(new Model("Gyokuyou","Kusuriya no Hitorigoto", "8.93", "Woman", "Atsumi Tanezaki", "", R.drawable.jjk));
    }
}