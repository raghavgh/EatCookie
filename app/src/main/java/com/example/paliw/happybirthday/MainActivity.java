package com.example.paliw.happybirthday;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       /* TextView textView = new TextView(this);
        textView.setText("Wow! Hy My name is Raghav Paliwal How are you all");
        textView.getCurrentTextColor();
        textView.setTextColor(Color.BLACK);
        textView.setTextSize(40);
        textView.setMaxLines(2);
        setContentView(textView);*/
    }
    public void eatCookie(View view) {
        // TODO: Find a reference to the ImageView in the layout. Change the image.
        ImageView imageView = (ImageView)findViewById(R.id.android_cookie_image_view);
        imageView.setImageResource(R.drawable.after_cookie);
        // TODO: Find a reference to the TextView in the layout. Change the text.
            TextView te = (TextView) findViewById(R.id.status_text_view);
            te.setText("I'm so Full");

    }
}
