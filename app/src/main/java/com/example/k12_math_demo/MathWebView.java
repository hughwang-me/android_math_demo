package com.example.k12_math_demo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.zanvent.mathview.MathView;

public class MathWebView extends WebView {


    public void setText(String text) {
        loadUrl("javascript:setText(11111)");
    }

    public MathWebView(Context context) {
        super(context);
        init();
    }

    public MathWebView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MathWebView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        Log.w("uwjx", "初始化webview");
        setBackgroundColor(Color.TRANSPARENT);
        // enable javascript
        getSettings().setLoadWithOverviewMode(true);
        getSettings().setJavaScriptEnabled(true);

        getSettings().setAppCachePath(getContext().getCacheDir().getAbsolutePath());
        getSettings().setAppCacheEnabled(true);
        getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);

        // disable click
        setClickable(false);
        setLongClickable(false);
        getSettings().setUseWideViewPort(true);
        loadUrl("file:///android_asset/mathscribe/view.html");
        setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                Log.w("uwjx" , "onPageFinished -- ");
            }
        });
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
    }
}
