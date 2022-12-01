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
        }, 1000);

        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                foodier.startAnimation(myanim3);
            }
        }, 2100);

        ImageView mFood = findViewById(R.id.mFood);

        Glide.with(this)
                .load(R.drawable.cook)
                .transition(DrawableTransitionOptions.withCrossFade(100))
                .into(mFood);
        /*
        Glide.with(this)
                .load("https://images.unsplash.com/photo-1565214975484-3cfa9e56f914?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1482&q=80")
//                .load(R.drawable.girl)
                .transition(DrawableTransitionOptions.withCrossFade(100))
                .centerCrop()
//                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(new ColorDrawable(this.getResources().getColor(R.color.teal_200)))
//                .circleCrop()
                .into(mSea);
        */
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