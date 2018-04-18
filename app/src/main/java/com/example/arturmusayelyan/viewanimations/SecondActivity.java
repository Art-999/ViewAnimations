package com.example.arturmusayelyan.viewanimations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    private Button slideUpAnimationButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        slideUpAnimationButton=findViewById(R.id.slide_up_btn);

        Animation slideUpAnimation= AnimationUtils.loadAnimation(this,R.anim.slide_to_right_anim);
        slideUpAnimationButton.startAnimation(slideUpAnimation);
    }
}
