package com.example.girdview_link;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    GridView gv;
    ArrayList<HinhAnh> arrayList;
    HinhAnhAdapter hinhAnhAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gv = (GridView)findViewById(R.id.girdviewhinh);
        arrayList = new ArrayList<>();
        arrayList.add(new HinhAnh("https://www.facebook.com",R.drawable.fb));
        arrayList.add(new HinhAnh("https://www.instagram.com",R.drawable.in));
        arrayList.add(new HinhAnh("https://twitter.com",R.drawable.tw));
        arrayList.add(new HinhAnh("https://www.adidas.com",R.drawable.ad));
        arrayList.add(new HinhAnh("https://www.pepsi.com",R.drawable.ps));
        arrayList.add(new HinhAnh("https://www.cocacolavietnam.com",R.drawable.coca));
        arrayList.add(new HinhAnh("https://consumer.huawei.com  ",R.drawable.hua));
        arrayList.add(new HinhAnh("https://www.drinkies.vn",R.drawable.sting));
        arrayList.add(new HinhAnh("https://www.nokia.com",R.drawable.noki));

        hinhAnhAdapter = new HinhAnhAdapter(this,R.layout.dong_hinh_anh,arrayList);
        gv.setAdapter(hinhAnhAdapter);
        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this,arrayList.get(i).getUrl(),Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("link",arrayList.get(i).getUrl());
                startActivity(intent);
            }
        });
    }
}
