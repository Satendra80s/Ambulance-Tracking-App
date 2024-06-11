package com.example.medical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class pharmcye extends AppCompatActivity {
WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pharmcye);
        webView = findViewById(R.id.webview);
        webView.loadUrl("https://www.epharmacy.com.au/");
        webView.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                return super.shouldOverrideUrlLoading(view, request);
            }
        });
    }
}