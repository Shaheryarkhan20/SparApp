package com.example.user.spar;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
//import com.daimajia.androidanimations.library.Techniques;
//import com.viksaa.sssplash.lib.activity.AwesomeSplash;
//import com.viksaa.sssplash.lib.cnst.Flags;
//
//import com.viksaa.sssplash.lib.model.ConfigSplash;

public class MainActivity extends AppCompatActivity {


    ImageView logo;
    private final int SPLASH_DISPLAY_TIMER = 4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logo=(ImageView)findViewById(R.id.logo);

        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.mysplashanimation);
        logo.startAnimation(myanim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(MainActivity.this, Home.class);
                startActivity(i);
                finish();

            }
        },SPLASH_DISPLAY_TIMER);


   }


//    @Override
//    public void initSplash(ConfigSplash configSplash) {
//
//        /* you don't have to override every property */
//
//        //Customize Circular Reveal
//        configSplash.setBackgroundColor(R.color.BgColor); //any color you want form colors.xml
//        configSplash.setAnimCircularRevealDuration(2000); //int ms
//        configSplash.setRevealFlagX(Flags.REVEAL_RIGHT);  //or Flags.REVEAL_LEFT
//        configSplash.setRevealFlagY(Flags.REVEAL_BOTTOM); //or Flags.REVEAL_TOP
//
//        //Choose LOGO OR PATH; if you don't provide String value for path it's logo by default
//
//        //Customize Logo
//        configSplash.setLogoSplash(R.drawable.logo); //or any other drawable
//        configSplash.setAnimLogoSplashDuration(2000); //int ms
//        configSplash.setAnimLogoSplashTechnique(Techniques.Bounce); //choose one form Techniques (ref: https://github.com/daimajia/AndroidViewAnimations)
//
//
//        //Customize Path
//        //configSplash.setPathSplash(Constants.DROID_LOGO); //set path String
//        configSplash.setOriginalHeight(400); //in relation to your svg (path) resource
//        configSplash.setOriginalWidth(400); //in relation to your svg (path) resource
//        configSplash.setAnimPathStrokeDrawingDuration(3000);
//        configSplash.setPathSplashStrokeSize(3); //I advise value be <5
//        configSplash.setPathSplashStrokeColor(R.color.white); //any color you want form colors.xml
//        configSplash.setAnimPathFillingDuration(3000);
//        configSplash.setPathSplashFillColor(R.color.white); //path object filling color
//
//
//        //Customize Title
//        configSplash.setTitleSplash("My Awesome App");
//        configSplash.setTitleTextColor(R.color.white);
//        configSplash.setTitleTextSize(30f); //float value
//        configSplash.setAnimTitleDuration(3000);
//        configSplash.setAnimTitleTechnique(Techniques.FlipInX);
//        configSplash.setTitleFont("fonts/myfont.ttf"); //provide string to your font located in assets/fonts/
//
//    }
//
//    @Override
//    public void animationsFinished() {
//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//               Intent i = new Intent(MainActivity.this, Home.class);
//               startActivity(i);
//               finish();
//
//            }
//        },SPLASH_DISPLAY_TIMER);
//
//    }
}
