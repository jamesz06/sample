package com.example.jamesz.wired10;

import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.baoyachi.stepview.HorizontalStepView;
import com.baoyachi.stepview.VerticalStepView;

import java.util.ArrayList;
import java.util.List;

public class popupactivity extends AppCompatActivity {

    VerticalStepView verticalStepView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popupactivity);

        verticalStepView = (VerticalStepView) findViewById(R.id.verticalStepView);

        List<String> sources = new ArrayList<>();
        sources.add("1st");
        sources.add("2nd");
        sources.add("3rd");
        sources.add("4th");
        sources.add("5th");


        verticalStepView.setStepsViewIndicatorCompletedLineColor(sources.size() - 2)
                .reverseDraw(false)
                .setStepViewTexts(sources)
                .setLinePaddingProportion(0.85f)
                .setStepsViewIndicatorCompletedLineColor(Color.parseColor("#FFFF00"))


               .setStepViewUnComplectedTextColor(ContextCompat.getColor(this,R.color.uncompleted_text_color))
               .setStepsViewIndicatorUnCompletedLineColor(Color.parseColor("#FFFFFF"))
                .setStepsViewIndicatorCompleteIcon(ContextCompat.getDrawable(this,R.drawable.complted))
                .setStepsViewIndicatorAttentionIcon(ContextCompat.getDrawable(this,R.drawable.attention))
                .setStepsViewIndicatorDefaultIcon(ContextCompat.getDrawable(this,R.drawable.default_icon));



    }
}
