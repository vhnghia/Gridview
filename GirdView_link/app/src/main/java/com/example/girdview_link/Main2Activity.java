package com.example.girdview_link;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String url = intent.getStringExtra("link");
        System.out.println(url);
        WebView webView = (WebView)findViewById(R.id.webview1);
        webView.loadUrl(url);
        webView.getSettings().setJavaScriptEnabled(true);
    }
}
