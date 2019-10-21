package com.example.batman_captamerica;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    boolean isBatmanVisible = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // чтобы анимации при нажатии менялись назад и вперед и крутились и смещались по осям
    public void eraseBatman(View view) {

        if (isBatmanVisible){
            ImageView batmanImageView = findViewById(R.id.batmanImageView2);
            batmanImageView.animate().alpha(0).rotation(batmanImageView.getRotation() + 3600)
                    .scaleY(0).scaleX(0).setDuration(3000);

            ImageView captanImageView = findViewById(R.id.captanImageView2);
            captanImageView.animate().alpha(1).rotation(captanImageView.getRotation() + 3600)
                    .scaleY(1).scaleX(1).setDuration(3000);

            isBatmanVisible = false;
        }else {
            ImageView batmanImageView = findViewById(R.id.batmanImageView2);
            batmanImageView.animate().alpha(1).rotation(batmanImageView.getRotation() + 3600)
                    .scaleY(1).scaleX(1).setDuration(3000);

            ImageView captanImageView = findViewById(R.id.captanImageView2);
            captanImageView.animate().alpha(0).rotation(captanImageView.getRotation() + 3600)
                    .scaleY(0).scaleX(0).setDuration(3000);

            isBatmanVisible = true;
        }
    }
}
