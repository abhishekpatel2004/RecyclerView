package com.example.recyclerviewapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class StudentAdapter extends RecyclerView.Adapter<StudentViewHolder> {

    ArrayList<Student> persons;

    public StudentAdapter(ArrayList persons) {
        this.persons = persons;
    }


    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_holder, parent, false);
        return new StudentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {
        Student person = persons.get(position);

        holder.txtViewName.setText(person.name);
        holder.txtViewAge.setText(person.age + " years");
        holder.image.setImageResource(person.image);
    }


    @Override
    public int getItemCount() {
        return persons.size();
    }
}
