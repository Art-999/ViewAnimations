package com.example.arturmusayelyan.viewanimations;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button alphaAnimateBtn, startAnim, stopAnim;
    private Animation alphaAnimation;
    private ImageView imageSunny;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        alphaAnimateBtn = findViewById(R.id.alpha_animate_btn);
        imageSunny = findViewById(R.id.image_sunny);
        startAnim = findViewById(R.id.start_anim_btn);
        stopAnim = findViewById(R.id.end_anim_btn);
        alphaAnimation = AnimationUtils.loadAnimation(this, R.anim.toghether_anim);
        //alphaAnimateBtn.startAnimation(alphaAnimation);
        startAnim.setOnClickListener(this);
        stopAnim.setOnClickListener(this);
    }

    private void startAnim() {
        imageSunny.startAnimation(alphaAnimation);
    }

    private void endAnim() {
        imageSunny.clearAnimation();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.start_anim_btn:
                startAnim();
                break;
            case R.id.end_anim_btn:
                endAnim();
                break;
        }
    }

    public void goToNextActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}
