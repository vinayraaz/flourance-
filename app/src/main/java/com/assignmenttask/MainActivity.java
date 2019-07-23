package com.assignmenttask;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.assignmenttask.adapter.TransactionAdapter;
import com.assignmenttask.model.DetailsModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<DetailsModel> detailsModels = new ArrayList<>();
    TransactionAdapter transactionAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView)findViewById(R.id.recyclerview);
        for (int i=0;i<10;i++){
            detailsModels.add(new DetailsModel("19 July 2019","Funds Withdrawn","98745632145","2000.00"));
        }
        loadData(detailsModels);

    }

    private void loadData(List<DetailsModel> detailsModels) {
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        transactionAdapter = new TransactionAdapter(this, detailsModels);
        recyclerView.setAdapter(transactionAdapter);
    }
}
