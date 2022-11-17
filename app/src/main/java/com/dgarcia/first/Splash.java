package com.dgarcia.first;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        openApp();



        ImageView foodier = findViewById(R.id.logofoodier);


        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.rotate_anim1);
        Animation myanim2 = AnimationUtils.loadAnimation(this, R.anim.rotate_anim2);
        Animation myanim3 = AnimationUtils.loadAnimation(this, R.anim.rotate_anim3);
        foodier.startAnimation(myanim);

        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                foodier.startAnimation(myanim2);
            }
        }, 500);

        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                foodier.startAnimation(myanim3);
            }
        }, 1200);

        ImageView mFood = findViewById(R.id.mFood);

        Glide.with(this)
                .load(R.drawable.cook)
                .transition(DrawableTransitionOptions.withCrossFade(100))
                .into(mFood);

    }

    private void openApp() {

        Handler handler = new Handler();
        handler.postDelayed(new Runnable()
        {
            @Override
            public void run() {
                Intent intent = new Intent(Splash
                        .this, LoginActivity.class);
                startActivity(intent);
            }
        }, 5000);


    }



}