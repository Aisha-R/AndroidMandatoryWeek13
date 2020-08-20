package com.aisharooble.recyclerviewmandatory;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.aisharooble.recyclerviewmandatory.adapter.MyAdapter;
import com.aisharooble.recyclerviewmandatory.storage.NoteStorage;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    private MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        myAdapter = new MyAdapter(new NoteStorage());
        recyclerView.setAdapter(myAdapter);

    }
}
