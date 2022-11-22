package com.example.imageslide;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class MainActivity extends AppCompatActivity {

    private  int images[];
    private  String text[];
    private SliderAdapterExample adapter;
    private SliderView sliderView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sliderView=findViewById(R.id.imageSlider);
        images= new int[]{R.drawable.test1, R.drawable.test5, R.drawable.test3, R.drawable.test4, R.drawable.test2,R.drawable.test6,R.drawable.test7,R.drawable.test8,R.drawable.test9, R.drawable.test10, R.drawable.test11,R.drawable.test13,R.drawable.test14,R.drawable.test15,R.drawable.test16,R.drawable.test17,R.drawable.test18,R.drawable.test19,R.drawable.test20,R.drawable.test21,R.drawable.test22};
        text=new String[]{"Picture of Romiz", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22"};
        adapter=new SliderAdapterExample(images,text);
        sliderView.setSliderAdapter(adapter);
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.SLIDE);
        sliderView.startAutoCycle();
    }
}