package com.example.avehijup;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Web extends AppCompatActivity {
    WebView web;
    ProgressDialog pd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        web = (WebView)findViewById(R.id.web);
        pd = new ProgressDialog(Web.this);

        pd.setMessage("Load My Application...");
        pd.setCancelable(false);
        pd.show();

        web.loadUrl("https://avehijup.mif-project.com/");
        WebSettings webSettings = web.getSettings();
        webSettings.setJavaScriptEnabled(true);

        web.setWebViewClient(new MyWebClient());

//        WebView myWebView = new WebView(Web.this);
//        setContentView(myWebView);

    }

    private class MyWebClient extends WebViewClient {
        public boolean shouldOverrideUrlLoading(WebView view, String url){
            return false;
        }
        @Override
        public void onPageFinished(WebView view, String url){
            pd.cancel();
            web = view;
        }
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && web.canGoBack()) {
            web.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
