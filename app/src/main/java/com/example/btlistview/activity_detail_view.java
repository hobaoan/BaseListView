package com.example.btlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class activity_detail_view extends AppCompatActivity {
    ListView listFoodDT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_view);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Thông tin chi tiết");
        getSupportActionBar();

        ArrayList<detail> arrayListdetail = new ArrayList<>();
        AdapterDetailFood adapterdt;

        listFoodDT = findViewById(R.id.listViewDetailFood );

        arrayListdetail.add(new detail("Sường nướng", "12.000đ", "15.000", "1 sao", R.drawable.suon));
        arrayListdetail.add(new detail("Gà kho", "15.000đ", "17.000", "4 sao", R.drawable.gakho));
        arrayListdetail.add(new detail("Thịt kho trứng", "12.000đ", "15.000", "3 sao", R.drawable.thittrung));
        arrayListdetail.add(new detail("Nem nướng", "15.000đ", "20.000", "5 sao", R.drawable.nemnuong));
        arrayListdetail.add(new detail("Bò", "20.000đ", "25.000", "5 sao", R.drawable.suon));

        adapterdt = new AdapterDetailFood(activity_detail_view.this, R.layout.detaillayout, arrayListdetail);
        listFoodDT.setAdapter(adapterdt);
    }
}