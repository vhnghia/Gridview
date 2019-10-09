package com.example.girdview_link;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.List;

public class HinhAnhAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<HinhAnh> listHinhAnh;

    public HinhAnhAdapter(Context context, int layout, List<HinhAnh> listHinhAnh) {
        this.context = context;
        this.layout = layout;
        this.listHinhAnh = listHinhAnh;
    }

    @Override
    public int getCount() {
        return listHinhAnh.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class ViewHolder{
        ImageView imgHinh;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if(view == null){
            viewHolder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout,null);
            viewHolder.imgHinh = (ImageView) view.findViewById(R.id.imgHinhAnh);
            view.setTag(viewHolder);
        }else
        {
           viewHolder =  (ViewHolder) view.getTag();
        }
        HinhAnh hinhAnh = listHinhAnh.get(i);
        viewHolder.imgHinh.setImageResource(hinhAnh.getHinhAnh());
        return view;
    }
}
