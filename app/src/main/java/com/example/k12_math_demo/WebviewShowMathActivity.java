package com.example.k12_math_demo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;

import androidx.annotation.Nullable;

import com.zanvent.mathview.MathView;

public class WebviewShowMathActivity extends Activity {

    MathWebView webView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview_layout);
        webView = (MathWebView)findViewById(R.id.mathview);

        String s = "显示图片：<img src=\\\"https://wx3.sinaimg.cn/mw690/6c71590dly1genj2ebdqhj23402c0hdv.jpg\\\"  width=\\\"165\\\" height=\\\"60\\\" /><span style=\\\"color:#f32784\\\">比</span><b>较</b>大小：${{x}^{2}}$+4x-3 ";
//        s = s.replaceAll("#\\{(http[\\s\\S]*?\\.(jpe?g|bmp|png))\\}", "<img src=\"$1\"/>");

        webView.loadUrl("file:///android_asset/html.html");
        webView.setText("王欢");

        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.w("uwjx" , "wanghuan");
                webView.setText("sadad");
            }
        });
    }
}
