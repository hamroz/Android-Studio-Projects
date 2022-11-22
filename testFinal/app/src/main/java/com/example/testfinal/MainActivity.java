package com.example.testfinal;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.example.testfinal.R;
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
        images= new int[]{R.drawable.test4, R.drawable.test3, R.drawable.test2, R.drawable.test1, R.drawable.fifth, R.drawable.sixth, R.drawable.seven, R.drawable.eight, R.drawable.nine, R.drawable.ten, R.drawable.eleven,R.drawable.twelve,R.drawable.thirteen,R.drawable.fourteen,R.drawable.sixteen,R.drawable.eighteen,R.drawable.ninteen, R.drawable.fourth,R.drawable.third,R.drawable.second,R.drawable.first};
        text=new String[]{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21"};
        adapter=new SliderAdapterExample(images,text);
        sliderView.setSliderAdapter(adapter);
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.SLIDE);
        sliderView.startAutoCycle();
    }
}