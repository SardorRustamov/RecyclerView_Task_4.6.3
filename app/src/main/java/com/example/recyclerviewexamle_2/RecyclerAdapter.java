package com.example.recyclerviewexamle_2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    List<RecyclerModel> list = new ArrayList<>();
    void setList(List<RecyclerModel> newList){
        list=newList;
        //notifyDataSetChanged();
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        RecyclerModel model = list.get(position);
        ((MyViewHolder)holder).bind(model);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    class MyViewHolder extends RecyclerView.ViewHolder{

        TextView tvTitle, tvDesc;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle=itemView.findViewById(R.id.title);
            tvDesc=itemView.findViewById(R.id.description);
        }
        void bind(RecyclerModel model){
            tvTitle.setText(model.title);
            tvDesc.setText(model.description);
        }
    }
}
