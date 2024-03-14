package com.example.recyclerviewapp;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class StudentViewHolder extends RecyclerView.ViewHolder {

    TextView txtViewName;
    TextView txtViewAge;
    ImageView image;

    public StudentViewHolder(@NonNull View itemView) {
        super(itemView);
        txtViewName = itemView.findViewById(R.id.textViewName);
        txtViewAge = itemView.findViewById(R.id.textViewAge);
        image=itemView.findViewById(R.id.Fimage);
    }
}
