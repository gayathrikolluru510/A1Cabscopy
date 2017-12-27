package com.example.test.a1cabs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class PrivacyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy);
        WebView myWebView = (WebView) findViewById(R.id.webviewprivacy);
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.loadUrl("http://a1-cabs.blogspot.in/2013/12/a1-cabs-in-indore-to-book-indica-indigo.html");
        //force links to  open in app only
        myWebView.setWebViewClient(new WebViewClient(){

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url){
                view.loadUrl(url);
                return true;
            }
        });
    }
}
