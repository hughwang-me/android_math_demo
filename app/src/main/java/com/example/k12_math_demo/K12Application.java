package com.example.k12_math_demo;

import android.app.Application;
import android.content.Context;
import org.scilab.forge.jlatexmath.core.AjLatexMath;

import io.github.kbiakov.codeview.classifier.CodeProcessor;

/**
 * 自定义应用-Application
 */
public class K12Application extends Application {

    public static Context appContext;

    @Override
    public void onCreate() {
        super.onCreate();
        appContext = this;


        //init flexiblerichtextview
        AjLatexMath.init(this);
//        AjLatexMath.
        //code highlight
//        CodeProcessor.init(this);
    }

}