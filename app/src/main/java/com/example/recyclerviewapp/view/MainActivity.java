package com.example.recyclerviewapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.rvStudents);
        StudentAdapter adapter = new StudentAdapter(getPerson());
        LinearLayoutManager manager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        manager.setOrientation(RecyclerView.HORIZONTAL);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(manager);
    }

    public ArrayList getPerson() {
        ArrayList persons = new ArrayList<Student>();
        persons.add(new Student("Aaryan", 25,R.drawable.image));
        persons.add(new Student("Raz", 26,R.drawable.image));
        persons.add(new Student("Ram", 25,R.drawable.image));
        persons.add(new Student("Aaryan", 25,R.drawable.image));
        persons.add(new Student("Raz", 26,R.drawable.image));
        persons.add(new Student("Ram", 25,R.drawable.image));

        return persons;
    }
}