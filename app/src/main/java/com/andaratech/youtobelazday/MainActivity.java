package com.andaratech.youtobelazday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        String strTitle [] = {"Captain Marvel","Captain America: Civil War","Thor: Ragnarok","Black Panther"};
        String strKeys [] = {"mbyd2kvRPnw","dKrVegVI0Us","ue80QwXMRHg","xjDjIWPwcPU"};
        List<MainModel> models = new ArrayList<>();

        for (int i = 0 ; i < strTitle.length; i++){
            MainModel model = new MainModel();
            model.setTitle(strTitle[i]);
            model.setKey(strKeys[i]);
            models.add(model);
            }
    MainAdapter adapter = new MainAdapter(models,this);
        recyclerView.setAdapter(adapter);

    }
}
