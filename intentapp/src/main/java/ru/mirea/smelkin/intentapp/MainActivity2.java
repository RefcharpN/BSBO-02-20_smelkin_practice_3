package ru.mirea.smelkin.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        String text = (String) getIntent().getSerializableExtra("key");

        TextView view = (TextView) findViewById(R.id.textView);
        view.setText(String.format("КВАДРАТ ЗНАЧЕНИЯ МОЕГО НОМЕРА ПО СПИСКУ В ГРУППЕ СОСТАВЛЯЕТ %s, а текущее время %s", 24*24, text));
    }
}