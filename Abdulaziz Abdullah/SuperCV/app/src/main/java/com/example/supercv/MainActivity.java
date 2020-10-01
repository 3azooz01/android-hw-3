package com.example.supercv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
        Button applyBtn;
        Button contactUsBtn;
        Button aboutUsBtn;
        ImageView apple;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        applyBtn = (Button) findViewById(R.id.applyBtn);
        contactUsBtn = (Button) findViewById(R.id.contactUsBtn);
        aboutUsBtn = (Button) findViewById(R.id.aboutUsBtn);
        apple = (ImageView) findViewById(R.id.appleImg);


        applyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                applyPage();
            }
        });

        contactUsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contactPage();
            }
        });

        aboutUsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                aboutPage();
            }
        });

        apple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog();
            }
        });



    }


    public void applyPage(){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

    public void contactPage(){
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }

    public void aboutPage(){
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }

    public void openDialog(){
        AppleLogo question = new AppleLogo();
        question.show(getSupportFragmentManager(),"");

    }
}