package com.example.supercv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);



        TextView apply = findViewById(R.id.textView);
        TextView apply2 = findViewById(R.id.textView2);
        TextView apply3 = findViewById(R.id.textView3);
        TextView apply4 = findViewById(R.id.textView4);
        TextView apply5 = findViewById(R.id.textView5);
        TextView apply6 = findViewById(R.id.textView6);
        TextView apply7 = findViewById(R.id.textView7);

        Bundle applyInformation = getIntent().getExtras();

        String name = applyInformation.getString("name");
        String age = applyInformation.getString("age");
        String civil = applyInformation.getString("civil_id");
        String school = applyInformation.getString("school");
        String email = applyInformation.getString("email");
        String phone = applyInformation.getString("phone");
        String major = applyInformation.getString("major");

        apply.setText(name);
        apply2.setText(age);
        apply3.setText(civil);
        apply4.setText(school);
        apply5.setText(email);
        apply6.setText(phone);
        apply7.setText(major);







    }
}