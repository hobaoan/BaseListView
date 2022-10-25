package com.example.btlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class listView extends AppCompatActivity {
    ListView listFood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Cơm trưa");

        ArrayList <food> arrayList = new ArrayList<>();
        AdapterFood adapter;

        listFood = findViewById(R.id.listViewFood );
        arrayList.add(new food("Món mặn","5 sản phẩm", "5 đang giảm giá", R.drawable.comtam));
        arrayList.add(new food("Món canh","10 sản phẩm", "10 đang giảm giá", R.drawable.moncanh));
        arrayList.add(new food("Món xào","10 sản phẩm", "10 đang giảm giá", R.drawable.monxao));

        adapter = new AdapterFood(listView.this, R.layout.foodlayout, arrayList);
        listFood.setAdapter(adapter);

        listFood.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (listFood.getPositionForView(view) == 0) {
                    Intent intentDT = new Intent();
                    intentDT.setClass(listView.this, activity_detail_view.class);
                    startActivity(intentDT);
                }
            }
        });

    }

}