package com.example.socialmediaintegration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;

public class SplashPage extends AppCompatActivity {

    ImageView Logo;
    TextView appname,Name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_page);

        Logo = findViewById(R.id.Logo);
        appname = findViewById(R.id.App_name);
        Name = findViewById(R.id.Name);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                StartAnimation();

            }
        }, 2000);

        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {

                startActivity(new Intent(SplashPage.this,MainActivity.class));
                finish();


            }
        },5500);

    }

    private void StartAnimation()
    {
        //Animations
//        TopAnim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.logo_anim);
//        BottomAnim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.appname_anim);

        Logo.setAnimation(AnimationUtils.loadAnimation(SplashPage.this,R.anim.logo_anim));
        appname.setAnimation(AnimationUtils.loadAnimation(SplashPage.this,R.anim.logo_anim));
        Name.setAnimation(AnimationUtils.loadAnimation(SplashPage.this,R.anim.appname_anim));

        Logo.setVisibility(View.VISIBLE);
        appname.setVisibility(View.VISIBLE);
        Name.setVisibility(View.VISIBLE);

    }


}