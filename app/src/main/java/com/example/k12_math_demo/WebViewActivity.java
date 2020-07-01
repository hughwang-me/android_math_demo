package com.example.k12_math_demo;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.Nullable;

public class WebViewActivity extends Activity {

    WebView webView;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview_layout);
        webView = (WebView)findViewById(R.id.webview);

        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setAppCachePath(getCacheDir().getAbsolutePath());
        webView. getSettings().setAppCacheEnabled(true);
        webView.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);

        // disable click
        webView.setClickable(false);
        webView.setLongClickable(false);
        webView.getSettings().setUseWideViewPort(true);
        //替换img属性
        String varjs = "<script type='text/javascript'> \nwindow.onload = function()\n{var $img = document.getElementsByTagName('img');for(var p in  $img){$img[p].style.width = '100%'; $img[p].style.height ='auto'}}</script>";


        String s = " <span id=\"wh\">王欢</span> ";

        String linkCss="<style type=text/css>" +
                "\t\tbody img{width:100%!important;height: auto!important;padding-top: 50px!important;padding-bottom: 50px!important;}\n\n" +
                "\t\tbody {font-size:25!important;}\n" +
                "\t\tbody span{font-size: 25!important;}\n" +
                "\t\tbody p{font-size: 25!important;}\t\t\t\t\n" +
                "\t\t</style>\n";

//        s = s.replaceAll("#\\{(http[\\s\\S]*?\\.(jpe?g|bmp|png))\\}", "<img src=\"$1\"/>");

        String html = Html.fromHtml(s).toString();
        Log.w("uwjx" , s);
//        webView.loadData(html , "text/html", "UTF-8");
        webView.loadUrl("file:///android_asset/html.html");

        final String lu = "$0\\le x\\le 2\\Rightarrow $$f(x)$的定义域为$\\left[ 1,3 \\right]$$\\Rightarrow 1\\le {{x}^{2}}-2\\le 3\\Rightarrow x\\in \\left[ -\\sqrt{5},-\\sqrt{3} \\right]\\cup \\left[ \\sqrt{3},\\sqrt{5} \\right]$$0\\le x\\le 2\\Rightarrow $$f(x)$的定义域为$\\left[ 1,3 \\right]$$\\Rightarrow 1\\le {{x}^{2}}-2\\le 3\\Rightarrow x\\in \\left[ -\\sqrt{5},-\\sqrt{3} \\right]\\cup \\left[ \\sqrt{3},\\sqrt{5} \\right]$"
                ;

        final String aaa = "<em><span style=\"color:#07a9fe\">当</span></em>$n\\ge 4$<u><em><strong><span style=\"color:#d35400\">时</span></strong></em></u>";
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.w("uwjx" , "wanghuan");
//                webView.loadUrl("javascript:(function(){" +
//                        "var x = document.getElementById(\"text\");"+
//                        "x.innerHTML = \"sadads\";"+
//                        "})()");
//                webView.loadUrl("javascript:setText("+aaa+")");
                webView.loadUrl("javascript:setText(\"" + aaa + "\"  )");
            }
        });

        webView.setWebViewClient(new WebViewClient(){
            @Override
            public void onPageFinished(WebView view, String url) {
                Log.w("uwjx" , "onPageFinished");
                webView.loadUrl("javascript:(function(){" +
                        "var x = document.getElementById(\"wh\");"+
                        "x.innerHTML = \"sadads\";"+
                        "})");

                super.onPageFinished(view, url);
            }
        });
    }
}
