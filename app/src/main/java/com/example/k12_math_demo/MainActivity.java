package com.example.k12_math_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.daquexian.flexiblerichtextview.FlexibleRichTextView;
import com.daquexian.flexiblerichtextview.Tokenizer;

public class MainActivity extends AppCompatActivity {

    FlexibleRichTextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.id_rich_tv);
        show();
    }

    @SuppressLint("SetJavaScriptEnabled")
    public  void show(){
        Tokenizer.setImageLabels("<img height=\\h width=\\w>\\u</img>");
        Tokenizer.setColorStartLabel("<span style=\"color:\\s\">");
        Tokenizer.setColorEndLabels("</span>");
        Tokenizer.setBoldStartLabels("<strong>", "[strong]");
        Tokenizer.setBoldEndLabels("</strong>", "[/strong]");
        Tokenizer.setTitleStartLabels("<p>");
        Tokenizer.setTitleEndLabels("</p>" ,"</p >");

        textView.setText("<p>（崇明区2017二模1）<strong><span style=\"color:#f32784\">函数</span></strong>$y=1-2{{\\sin }^{2}}(2x)$的<strong>最小正周期是</strong>．</p >（4分）");
//        textView.setText("<img height=200 width=100>https://wx4.sinaimg.cn/mw690/6204ece1ly1gdrycnc8ppj204x06wt8k.jpg</img> 比较大小：\\[{{x}^{2}}\\]+4x-3       6x-4 <p><strong><span style=\"color:#f32784\">hello2 world</span></strong></p>");
//        flexibleRichTextView.setText("已知集合\\(A=\\{-1,1\\}\\)，\\(B=\\{x|mx=1\\}\\)，且\\(A\\cup B=A\\)，则\\(m\\)的值为________");

    }
}
