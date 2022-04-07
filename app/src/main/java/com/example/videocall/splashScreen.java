package com.example.videocall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class splashScreen extends AppCompatActivity {
    ImageView img;
    Animation animation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        img=findViewById(R.id.imageView);
        animation=AnimationUtils.loadAnimation(splashScreen.this,R.anim.catalyst_push_up_in);
        img.setAnimation(animation);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(splashScreen.this,MainActivity.class));
            }
        },3000);
    }
}