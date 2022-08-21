package com.example.recyclerviewexamle_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
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
        models.add(new RecyclerModel("Title1", "Desc1"));
        models.add(new RecyclerModel("Title2", "Desc2"));
        models.add(new RecyclerModel("Title3", "Desc3"));
        models.add(new RecyclerModel("Title4", "Desc4"));
        models.add(new RecyclerModel("Title5", "Desc5"));
        models.add(new RecyclerModel("Title6", "Desc6"));
        models.add(new RecyclerModel("Title7", "Desc7"));
        models.add(new RecyclerModel("Title8", "Desc8"));
        models.add(new RecyclerModel("Title9", "Desc9"));

        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        RecyclerAdapter adapter = new RecyclerAdapter();
        adapter.setList(models);
        GridLayoutManager ln = new GridLayoutManager(this, 3);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(ln);
    }
}