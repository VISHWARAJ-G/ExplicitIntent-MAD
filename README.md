# Ex.No:4 To create a two screens , first screen will take one number input from user. After click on Factorial button, second screen will open and it should display factorial of the same number using Explicit Intents.


## AIM:

To create a two screens , first screen will take one number input from user. After click on Factorial button, second screen will open and it should display factorial of the same number using Explicit Intents.


## EQUIPMENTS REQUIRED:

Latest Version Android Studio

## ALGORITHM:
1. Start the application with MainActivity as the launcher activity.

2. Display a button in MainActivity to navigate forward.

3. On button click, create an explicit intent from MainActivity to MainActivity2.

4. Start MainActivity2 using the created explicit intent.

5. Display a button in MainActivity2 to navigate forward.

6. On button click, create and start an explicit intent from MainActivity2 to MainActivity3.

7. Register all three activities in the Android Manifest file.


## PROGRAM:
* Developed by : VISHWARAJ G
* Registeration Number : 212223220125
#### 1. MainActivity.java
```
package com.example.explicit_intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(i);
            }
        });
    }
}
```
#### 2. MainActivity2.java
```
package com.example.explicit_intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button button = findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity3.class);
                startActivity(i);
            }
        });
    }
}
```
#### 3. MainActivity3.java
```
package com.example.explicit_intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_main3);
        Button button = findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
    }
}
```

## OUTPUT

#### Coding Part
![alt text](Output_Images/Coding_Part.png)

#### Design_Part
![alt text](Output_Images/Design_Part.png)

#### Task1
<img src="./Output_Images/Task1_Image.jpg" height=400>

#### Task2
<img src="./Output_Images/Task2_Image.jpg" height=400>

#### Task3
<img src="./Output_Images/Task3_Image.jpg" height=400>

## RESULT
Thus a Simple Android Application create a Explicit Intents using Android Studio is developed and executed successfully.


