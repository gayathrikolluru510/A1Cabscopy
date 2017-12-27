package com.example.test.a1cabs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutUsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        WebView myWebView = (WebView) findViewById(R.id.webviewaboutus);
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.loadUrl("http://a1-cabs.blogspot.in");
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
