package com.sandbox.search;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {
    Context context;
    ArrayList<Deal> list;

    public Adapter(Context c,ArrayList<Deal> d)
    {
        context=c;
        list=d;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.card_holder,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
     holder.D.setText(list.get(position).getDiseases());
     holder.tb.setText(list.get(position).getTabname());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder
    {
         TextView D,tb;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            D=(TextView) itemView.findViewById(R.id.med);
            tb=(TextView) itemView.findViewById(R.id.description);
        }
    }

}
