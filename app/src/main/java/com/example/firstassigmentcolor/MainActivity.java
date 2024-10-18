package com.example.firstassigmentcolor;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    TextView txtFirstName, txtSecondName, txtThirdName;
    EditText numberEdit;
    Button btnSubmit;
    @SuppressLint("ResourceAscolor")

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeViews();
        initializeListeners();


    }
    private void initializeViews(){
        txtFirstName= findViewById(R.id.txtFirstName);
        txtSecondName=findViewById(R.id.txtSecondName);
        txtThirdName =findViewById(R.id.txtThirdName);
        numberEdit = findViewById(R.id.numberEdit);
        btnSubmit = findViewById(R.id.btnSubmit);

    }
    private void initializeListeners(){
        btnSubmit.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String colour = numberEdit.getText().toString();
                        if(colour.equals("one")){
                            txtFirstName.setBackgroundColor(getColor(R.color.red));
                            txtSecondName.setBackgroundColor(getColor(R.color.blue));
                            txtThirdName.setBackgroundColor(getColor(R.color.blue));
                        }
                        else if(colour.equals("two")){
                            txtFirstName.setBackgroundColor(getColor(R.color.blue));
                            txtSecondName.setBackgroundColor(getColor(R.color.red));
                            txtThirdName.setBackgroundColor(getColor(R.color.blue));
                        } else if (colour.equals("three")) {
                            txtFirstName.setBackgroundColor(getColor(R.color.blue));
                            txtSecondName.setBackgroundColor(getColor(R.color.blue));
                            txtThirdName.setBackgroundColor(getColor(R.color.red));
                        }


                    }
                }
        );
    }
}