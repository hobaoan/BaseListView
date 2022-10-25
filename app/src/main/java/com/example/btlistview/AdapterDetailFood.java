package com.example.btlistview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterDetailFood extends BaseAdapter {
    private Context context;
    private int layout;
    private List<detail> arraylistdt;

    public AdapterDetailFood(Context context, int layout, List<detail> arraylistdt) {
        this.context = context;
        this.layout = layout;
        this.arraylistdt = arraylistdt;
    }

    @Override
    public int getCount() {
        return arraylistdt.size();
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
        View viewDetail;
        if(view ==null)
            viewDetail = View.inflate(viewGroup.getContext(), this.layout,null);
        else {
            viewDetail = view;
        }

        detail detail = this.arraylistdt.get(i);

        //ánh xạ id vào biến
        TextView tMon = viewDetail.findViewById(R.id.foodNameDT);
        TextView giaGiam = viewDetail.findViewById(R.id.priceSale);
        TextView gia = viewDetail.findViewById(R.id.price);
        TextView sao = viewDetail.findViewById(R.id.star);
        ImageView hinhdt = viewDetail.findViewById(R.id.imageFoodDT);

        tMon.setText(detail.getNameFoodDT());
        giaGiam.setText(detail.getPriceSale());
        gia.setText(detail.getPrice());
        sao.setText(detail.getStar());
        hinhdt.setImageResource(detail.getHinhDT());

        return viewDetail;
    }
}
