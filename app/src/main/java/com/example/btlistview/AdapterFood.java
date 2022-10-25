package com.example.btlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterFood extends BaseAdapter {
    private Context context;
    private int layout;
    private List<food> arraylist;

    public AdapterFood(Context context, int layout, List<food> arraylist) {
        this.context = context;
        this.layout = layout;
        this.arraylist = arraylist;
    }

    @Override
    public int getCount() {
        return arraylist.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View viewFood;
        if(view == null)
            viewFood = View.inflate(viewGroup.getContext(), this.layout,null);
        else {
            viewFood = view;
        }

        food food = this.arraylist.get(i);

        //ánh xạ id vào biến
        TextView tenMon = viewFood.findViewById(R.id.foodName);
        TextView soMon = viewFood.findViewById(R.id.numbFood);
        TextView soGiam = viewFood.findViewById(R.id.numbSale);
        ImageView hinhMon = viewFood.findViewById(R.id.imageFood);

        tenMon.setText(food.getNameFood());
        soMon.setText(food.getNumbFood());
        soGiam.setText(food.getNumbSales());
        hinhMon.setImageResource(food.getHinh());

        return viewFood;
    }
}
