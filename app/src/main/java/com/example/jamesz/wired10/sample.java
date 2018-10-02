package com.example.jamesz.wired10;

import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.baoyachi.stepview.HorizontalStepView;
import com.baoyachi.stepview.VerticalStepView;
import com.baoyachi.stepview.bean.StepBean;

import java.util.ArrayList;
import java.util.List;

public class sample extends AppCompatActivity {
    HorizontalStepView horizontalStepView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);

        horizontalStepView = (HorizontalStepView) findViewById(R.id.samplestep);


        List <StepBean> Sources= new ArrayList<>();
        Sources.add(new StepBean("chooseP",1));
        Sources.add(new StepBean("DefineP",1));
        Sources.add(new StepBean("DefineL",1));
        Sources.add(new StepBean("IrrigP",0));

        horizontalStepView.setStepViewTexts(Sources).setTextSize(14)
                .setStepsViewIndicatorCompletedLineColor(ContextCompat.getColor(this,R.color.colorAccent))
                .setStepsViewIndicatorUnCompletedLineColor(ContextCompat.getColor(this,R.color.uncompleted_text_color))
                .setStepViewComplectedTextColor(ContextCompat.getColor(this,R.color.colorPrimary))
                .setStepViewUnComplectedTextColor(ContextCompat.getColor(this,R.color.uncompleted_text_color))
                .setStepsViewIndicatorCompleteIcon(ContextCompat.getDrawable(this,R.drawable.complted))
                .setStepsViewIndicatorDefaultIcon(ContextCompat.getDrawable(this,R.drawable.default_icon))
                .setStepsViewIndicatorAttentionIcon(ContextCompat.getDrawable(this,R.drawable.attention));
//                .setStepViewUnComplectedTextColor(ContextCompat.getColor(this,R.color.uncompleted_text_color))
//                .setStepsViewIndicatorUnCompletedLineColor(Color.parseColor("#FFFFFF"))
//                .setStepsViewIndicatorCompleteIcon(ContextCompat.getDrawable(this,R.drawable.complted))
//                .setStepsViewIndicatorAttentionIcon(ContextCompat.getDrawable(this,R.drawable.attention))
//                .setStepsViewIndicatorDefaultIcon(ContextCompat.getDrawable(this,R.drawable.default_icon));



    }
}
