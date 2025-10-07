package com.example.factorializer;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText textVal;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textVal = findViewById(R.id.editTextText);
        btn = findViewById(R.id.button);
        btn.setOnClickListener(v->{
            String input=textVal.getText().toString().trim();
            if(input.isEmpty()){
                Toast.makeText(MainActivity.this,"Please enter a number",Toast.LENGTH_SHORT).show();
                return;
            }
            try{
                int num=Integer.parseInt(input);
                if(num<0){
                    Toast.makeText(this, "Enter a non-negative number", Toast.LENGTH_SHORT).show();
                    return;
                }
                Intent intent = new Intent(MainActivity.this,ResultActivity.class);
                intent.putExtra("number",num);
                startActivity(intent);
            } catch (NumberFormatException e) {
                Toast.makeText(this, "Invalid input", Toast.LENGTH_SHORT).show();
            }

        });
    }
}