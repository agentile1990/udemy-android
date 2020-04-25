package com.agentile1990.imageswitcher;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Drawable image1;
    private Drawable image2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.image1 = getResources().getDrawable(R.drawable.wavelength_icon, null);
        this.image2 = getResources().getDrawable(R.drawable.songs_icon, null);
    }

    public void switchImage(View view) {
        ImageView imageView = (ImageView) findViewById(R.id.imageView);

        Drawable currentDrawable = imageView.getDrawable();
        if (currentDrawable == image1) {
            imageView.setImageDrawable(this.image2);
        } else {
            imageView.setImageDrawable(this.image1);
        }
    }
}
