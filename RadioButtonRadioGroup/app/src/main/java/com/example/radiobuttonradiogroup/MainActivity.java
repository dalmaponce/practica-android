package com.example.radiobuttonradiogroup;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText et1, et2;
    private TextView tv1;
    private RadioButton rb1, rb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);

        tv1 = findViewById(R.id.tv1);

        rb1 = findViewById(R.id.rb1);
        rb2 = findViewById(R.id.rb2);

    }

    public void operar(View v){

        String v1 = et1.getText().toString();
        String v2 = et2.getText().toString();

        int et1 = Integer.parseInt(v1);
        int et2 = Integer.parseInt(v2);
        int resultado = 0;

        if(rb1.isChecked()){

            resultado = et1 + et2;

        } else if (rb2.isChecked()) {

            resultado = et1 - et2;

        }

        tv1.setText("El resultado es: " + resultado);

    }

}