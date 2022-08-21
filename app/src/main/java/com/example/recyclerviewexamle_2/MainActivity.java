package com.example.recyclerviewexamle_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<RecyclerModel> models = new ArrayList<>();
        models.add(new RecyclerModel("Title1", "Description1"));
        models.add(new RecyclerModel("Title2", "Description2"));
        models.add(new RecyclerModel("Title3", "Description3"));
        models.add(new RecyclerModel("Title4", "Description4"));
        models.add(new RecyclerModel("Title5", "Description5"));
        models.add(new RecyclerModel("Title6", "Description6"));
        models.add(new RecyclerModel("Title7", "Description7"));
        models.add(new RecyclerModel("Title8", "Description8"));
        models.add(new RecyclerModel("Title9", "Description9"));
        models.add(new RecyclerModel("Title10", "Description10"));
        models.add(new RecyclerModel("Title11", "Description11"));
        models.add(new RecyclerModel("Title12", "Description12"));
        models.add(new RecyclerModel("Title13", "Description13"));
        models.add(new RecyclerModel("Title14", "Description14"));
        models.add(new RecyclerModel("Title15", "Description15"));
        models.add(new RecyclerModel("Title16", "Description16"));
        models.add(new RecyclerModel("Title17", "Description17"));
        models.add(new RecyclerModel("Title18", "Description18"));
        models.add(new RecyclerModel("Title19", "Description19"));

        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        RecyclerAdapter adapter = new RecyclerAdapter();
        adapter.setList(models);
        LinearLayoutManager ln = new LinearLayoutManager(this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(ln);

        recyclerView.setNestedScrollingEnabled(false);
    }
}