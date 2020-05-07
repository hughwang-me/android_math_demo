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
        Tokenizer.setImageLabels("[img height=\\h width=\\w]\\u>[/img]" , "[img]\\u[/img]");
//        Tokenizer.setImageLabels("#{\\u}");
        Tokenizer.setColorStartLabel("<span style=\"color:\\s\">");
        Tokenizer.setColorEndLabels("</span>");
        Tokenizer.setBoldStartLabels("<strong>", "[strong]");
        Tokenizer.setBoldEndLabels("</strong>", "[/strong]");
        Tokenizer.setTitleStartLabels("<p>" , "<u>" , "<em>");
        Tokenizer.setTitleEndLabels("</p>" ,"</p >" , "</u>" , "</em>");

//        textView.setText("已知函数$f(x)=\\left\\{ \\begin{align}  & {{x}^{2}}+\\sin x{{,}_{{}}}x\\ge 0 \\\\  & -{{x}^{2}}+\\cos (x+\\alpha ){{,}_{{}}}x<0 \\\\ \\end{align} \\right.$$(\\alpha \\in [0,2\\pi ))$是奇函数，则$\\alpha =$（    ）（10分）");

//        textView.setText("已知函数$f(x)=\\left\\{ \\begin{align}  & {{x}^{2}}+\\sin x{{,}_{{}}}x\\ge 0 \\\\  & -{{x}^{2}}+\\cos (x+\\alpha ){{,}_{{}}}x<0 \\\\ \\end{align} \\right.$ 是奇函数，则$\\alpha =$（    ）（10分）");

//        textView.setText("<p>（崇明区2017二模1）<strong><span style=\"color:#f32784\">函数</span></strong>$y=1-2{{\\sin }^{2}}(2x)$的<strong>最小正周期是</strong>．</p >（4分）");
//        textView.setText("#{https://uwjx-dev.oss-cn-hangzhou.aliyuncs.com/tskj/0039d51f-fe50-4082-a593-e42112956158.jpg} 比较大小：\\[{{x}^{2}}\\]+4x-3       6x-4 <p><strong><span style=\"color:#f32784\">hello2 world</span></strong></p>");
//        flexibleRichTextView.setText("已知集合\\(A=\\{-1,1\\}\\)，\\(B=\\{x|mx=1\\}\\)，且\\(A\\cup B=A\\)，则\\(m\\)的值为________");

//        t1();
//        t2();
//        t3();
        t4();
    }

    public void t4(){
        String text = "$0\\le x\\le 2\\Rightarrow $$f(x)$的定义域为$\\left[ 1,3 \\right]$$\\Rightarrow 1\\le {{x}^{2}}-2\\le 3\\Rightarrow x\\in \\left[ -\\sqrt{5},-\\sqrt{3} \\right]\\cup \\left[ \\sqrt{3},\\sqrt{5} \\right]$$0\\le x\\le 2\\Rightarrow $$f(x)$的定义域为$\\left[ 1,3 \\right]$$\\Rightarrow 1\\le {{x}^{2}}-2\\le 3\\Rightarrow x\\in \\left[ -\\sqrt{5},-\\sqrt{3} \\right]\\cup \\left[ \\sqrt{3},\\sqrt{5} \\right]$";
//        text = text.replaceAll("\\\\left" , "");
//        text = text.replaceAll("\\\\right" , "");
//
//        text = "$0\\le x\\le 2\\Rightarrow $$f(x)$的定义域为$\\left[ 1,3 \\right]$$\\Rightarrow 1\\le {{x}^{2}}-2\\le 3\\Rightarrow x\\in \\left[ -\\sqrt{5},-\\sqrt{3} \\right]\\cup \\left[ \\sqrt{3},\\sqrt{5} \\right]$";
        textView.setText(text);
    }

    public void t3(){
        String text = "<p>(1)${{a}_{n}}=2+3n$(2)${{S}_{n}}=3\\times {{2}^{n+1}}+2n-6$(3)当$n=1,2,3$<u>时</u>，${{S}_{n}}&lt;{{G}_{n}}$；<em><span style=\"color:#07a9fe\">当</span></em>$n\\ge 4$<u><em><strong><span style=\"color:#d35400\">时</span></strong></em></u>，${{S}_{n}}&gt;{{G}_{n}}$。#{https://uwjx-dev.oss-cn-hangzhou.aliyuncs.com/tskj/0039d51f-fe50-4082-a593-e42112956158.jpg}</p >";
        text = text.replaceAll("#\\{(http[\\s\\S]*?\\.(jpe?g|bmp|png))\\}", "[img]$1[/img]");
        textView.setText(text);
    }

    public void t2(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("已知函数");
        stringBuilder.append("$f(x)=\\left\\{ \\begin{align}  & {{x}^{2}}+\\sin x{{,}_{{}}}x\\ge 0 \\\\  & -{{x}^{2}}+\\cos (x+\\alpha ){{,}_{{}}}x<0 \\\\ \\end{align} \\right.$$(\\alpha \\in [0,2\\pi ))$" );
        stringBuilder.append("是奇函数，则$\\alpha =$（    ）（10分）");
        textView.setText(stringBuilder.toString());
    }

    public void t1(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("$$\\sum_{i=1}^n a_i=0$$,");
        stringBuilder.append("\r\n");
        stringBuilder.append("$$f(x)=x^{x^x}$$");
        stringBuilder.append("\r\n");
        stringBuilder.append("$$f(x_1,x_x,\\ldots,x_n) = x_1^2 + x_2^2 + \\cdots + x_n^2 $$");
        stringBuilder.append("\r\n");
        stringBuilder.append("$$\\left. \\frac{du}{dx} \\right|_{x=0}.$$");
        stringBuilder.append("\r\n");
        stringBuilder.append("f(n) = \\begin{cases} \\frac{n}{2}, & \\text{if } n\\text{ is even} \\\\ 3n+1, & " +
                "\\text{if } n\\text{ is odd} \\end{cases}");
        stringBuilder.append("\r\n");
        stringBuilder.append("$$\\mbox{对任意的$x>0$}, \\mbox{有 }f(x)>0. $$");
        stringBuilder.append("\r\n");
        stringBuilder.append("$$\\sqrt[n]{x_r_r_r} $$");
        stringBuilder.append("\r\n");
        stringBuilder.append("$$ \\frac{x+2}{x} \\sqrt{x} $$");
        stringBuilder.append("\r\n");
        stringBuilder.append("$$ \\[f(x,y,z) = 3y^2 z \\left( 3 + \\frac{7x+5}{1 + y^2} \\right).\\] $$");
        stringBuilder.append("\r\n");
        stringBuilder.append("$$ P(x|c)=\\frac{P(c|x)\\cdot P(x)}{P(x)} $$");
        stringBuilder.append("\r\n");
        stringBuilder.append("$$ \\Large x=\\frac{-b\\pm\\sqrt{b^2-4ac}}{2a} $$");
        stringBuilder.append("\r\n");
        stringBuilder.append("$$ \\sum_{i=1}^n i = \\frac{n(n+1)}2 $$");
        stringBuilder.append("\r\n");
        stringBuilder.append("$$ f(x)=\\int_{-\\infty}^x e^{-t^2}dt $$ 这道公式我也不知道怎么做");
        stringBuilder.append("\r\n");
        stringBuilder.append("$$ \\cos 2\\theta  = \\cos^2 \\theta - \\sin^2 \\theta = 2 \\cos^2 \\theta - 1. $$");
        stringBuilder.append("\r\n");
        stringBuilder.append("$$ \\displaystyle= \\frac{k(k+1)}{2}+k+1 $$");
        stringBuilder.append("\r\n");
        stringBuilder.append("$$ \\frac{x}{2}-3=0 $$");
        stringBuilder.append("\r\n");
        stringBuilder.append("$$ x=\\frac{3}{2} $$");
        stringBuilder.append("\r\n");
        stringBuilder.append("$$ \\[ \\sum_{k=1}^n k^2 = \\frac{1}{2} n (n+1).\\] $$");
        textView.setText(stringBuilder.toString());
    }
}
