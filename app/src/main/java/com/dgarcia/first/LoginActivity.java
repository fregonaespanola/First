package com.dgarcia.first;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;

public class LoginActivity extends AppCompatActivity {

    TextView accset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginactivity);

        accset=findViewById(R.id.accset);
        ImageView mGirl = findViewById(R.id.girl);
        ImageView foodier = findViewById(R.id.log);

        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.fadein_anim1);
        foodier.startAnimation(myanim);

        Glide.with(this)
                .load(R.drawable.girl)
                .transition(DrawableTransitionOptions.withCrossFade(100))
                .into(mGirl);

    }

    public void paginaSiguiente(View v){
        Intent intent= new Intent(this, SignUpActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);


    }

    public void openMain(View v) {
        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
        //intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        //intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);

    }

}