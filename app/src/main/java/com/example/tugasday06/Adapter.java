package com.example.tugasday06;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>  {

    private ArrayList <Model> arrayModel;
    private Context context;

    public Adapter(ArrayList<Model> arrayModel, Context context) {
        this.arrayModel = arrayModel;
        this.context = context;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    Model model;
    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        Model clickedItem = arrayModel.get(position);

        holder.namaWaifu.setText(clickedItem.getNamaWaifu());
        holder.tvJudul.setText(clickedItem.getTvJudul());
        holder.tvSkor.setText(clickedItem.getTvSkor());
        holder.tvGender.setText(clickedItem.getTvGender());
        holder.tvSeiyuu.setText(clickedItem.getTvSeiyuu());
        holder.tvDesk.setText(clickedItem.getTvDesk());
        holder.gambarView.setImageResource(clickedItem.getGambar());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("nama", clickedItem.getNamaWaifu());
                intent.putExtra("judul", clickedItem.getTvJudul());
                intent.putExtra("skor", clickedItem.getTvSkor());
                intent.putExtra("gender", clickedItem.getTvGender());
                intent.putExtra("seiyu", clickedItem.getTvSeiyuu());
                intent.putExtra("desk", clickedItem.getTvDesk());
                intent.putExtra("gambar", clickedItem.getGambar());
                context.startActivity(intent);
            }
        });
    }



    @Override
    public int getItemCount() {
        return arrayModel.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView namaWaifu, tvJudul, tvSkor, tvGender, tvSeiyuu, tvDesk;
        ImageView gambarView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            namaWaifu = itemView.findViewById(R.id.tvName);
            tvJudul = itemView.findViewById(R.id.tvTitle);
            tvSkor = itemView.findViewById(R.id.tvScore);
            tvGender = itemView.findViewById(R.id.tvGen);
            tvSeiyuu = itemView.findViewById(R.id.tvVA);
            tvDesk = itemView.findViewById(R.id.tvDesc);
            gambarView = itemView.findViewById(R.id.gambarView);
        }
    }
}
