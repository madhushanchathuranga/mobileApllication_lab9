package com.example.Exercise01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.labsheet09.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button submitButton = findViewById(R.id.buttonSubmit);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = ((EditText) findViewById(R.id.editTextName)).getText().toString();
                String age = ((EditText) findViewById(R.id.editTextAge)).getText().toString();
                String gender = ((EditText) findViewById(R.id.editTextGender)).getText().toString();
                String city = ((EditText) findViewById(R.id.editTextCity)).getText().toString();
                String mobile = ((EditText) findViewById(R.id.editTextMobile)).getText().toString();
                String email = ((EditText) findViewById(R.id.editTextEmail)).getText().toString();
                String department = ((EditText) findViewById(R.id.editTextDepartment)).getText().toString();

                Toast.makeText(MainActivity.this, "Data entered successfully", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("name", name);
                intent.putExtra("age",age);
                intent.putExtra("gender",gender);
                intent.putExtra("city",city);
                intent.putExtra("mobile",mobile);
                intent.putExtra("email",email);
                intent.putExtra("department",department);

                startActivity(intent);
            }
        });
    }
}

