package com.example.my_app_currency;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editFrom, editTo;
    double usd2vnd = 24840;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editFrom = findViewById(R.id.edit_from);
        editTo = findViewById(R.id.edit_to);

        findViewById(R.id.button_convert).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fromStr = editFrom.getText().toString();
                double from = Double.parseDouble(fromStr);
                double to = from * usd2vnd;
                editTo.setText(String.valueOf(to));
            }
        });

        findViewById(R.id.button_clear).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editFrom.setText("");
                editTo.setText("");
            }


            public void afterTextChange(Editable editable){
                String fromStr = editFrom.getText().toString();
                double from = Double.parseDouble(fromStr);
                double to = from * usd2vnd;
                editTo.setText(String.valueOf(to));
            }
        });
    }

}