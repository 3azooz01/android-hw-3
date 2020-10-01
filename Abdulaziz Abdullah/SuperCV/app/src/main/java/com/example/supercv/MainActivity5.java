package com.example.supercv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        final EditText name = findViewById(R.id.nameEdit);
        final EditText age = findViewById(R.id.editTextNumber);
        final EditText civil_id = findViewById(R.id.civil_Id);
        final EditText school = findViewById(R.id.schoolEdit);
        final EditText email = findViewById(R.id.emailEdit);
        final EditText phone = findViewById(R.id.phoneEdit);
        final EditText major = findViewById(R.id.majorEdit);
        final Button next = findViewById(R.id.nexrBtn);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                age.getText().toString();
                civil_id.getText().toString();
                phone.getText().toString();
                email.getText().toString();


                Intent x = new Intent(MainActivity5.this, MainActivity6.class);

                x.putExtra("name", name.getText().toString());
                x.putExtra("age", age.getText().toString());
                x.putExtra("civil_id", civil_id.getText().toString());
                x.putExtra("school", school.getText().toString());
                x.putExtra("email", email.getText().toString());
                x.putExtra("phone", phone.getText().toString());
                x.putExtra("major", major.getText().toString());

                startActivity(x);




            }
        });

    }

}