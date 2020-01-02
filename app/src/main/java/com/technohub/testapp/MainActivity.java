package com.technohub.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
Animation animation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.testlayout);

// Start animating the image
        final RelativeLayout splash = (RelativeLayout) findViewById(R.id.splash);
        animation = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.bounce_animation);
splash.setAnimation(animation);
// Later.. stop the animation

    }
}
