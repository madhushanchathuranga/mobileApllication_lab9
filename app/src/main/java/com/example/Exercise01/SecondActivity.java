package com.example.Exercise01;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String age = intent.getStringExtra("age");
        String gender = intent.getStringExtra("gender");
        String city = intent.getStringExtra("city");
        String mobile = intent.getStringExtra("mobile");
        String email = intent.getStringExtra("email");
        String department = intent.getStringExtra("department");


        TextView nameTextView = findViewById(R.id.textViewName);
        TextView ageTextView = findViewById(R.id.textViewAge);
        TextView genderTextView = findViewById(R.id.textViewGender);
        TextView cityTextView = findViewById(R.id.textViewCit);
        TextView mobileTextView = findViewById(R.id.textViewMobile);
        TextView emailTextView = findViewById(R.id.textViewEmail);
        TextView departmentTextView = findViewById(R.id.textViewDep);


        nameTextView.setText("Name: " + name);
        ageTextView.setText("Age: " + age);
        genderTextView.setText("Gender" + gender);
        cityTextView.setText("City" + city);
        mobileTextView.setText("Mobile" + mobile);
        emailTextView.setText("Email" + email);
        departmentTextView.setText("Department" + department);


        emailTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email = intent.getStringExtra("email");
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
                emailIntent.setData(Uri.parse("mailto:" + email));
                startActivity(emailIntent);
            }
        });

        mobileTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String mobile = intent.getStringExtra("mobile");
                Intent dialIntent = new Intent(Intent.ACTION_DIAL);
                dialIntent.setData(Uri.parse("tel:" + mobile));
                startActivity(dialIntent);
            }
        });
    }
}
