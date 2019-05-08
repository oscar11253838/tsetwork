package com.example.tsetwork;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText input;
    TextView show;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = findViewById(R.id.editText);
        show = findViewById(R.id.textView);
        b1 = findViewById(R.id.clear);
        b2= findViewById(R.id.sizel);
        b3 = findViewById(R.id.ALL);
        b4 = findViewById(R.id.sizeu);
        b5 = findViewById(R.id.RED);
        b6 = findViewById(R.id.GREEN);
        b7 = findViewById(R.id.BLUE);
        b8 = findViewById(R.id.P);
        b9 = findViewById(R.id.B);
        b10 = findViewById(R.id.C);

        b11 = findViewById(R.id.jump);
        b11.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, Jump.class);
                startActivity(intent);
                MainActivity.this.finish();
            }
        });
    }
    int size = 15;
    public void misize(View v){
        show.setTextSize(--size);
    }

    public void maxsize(View v){
        show.setTextSize(++size);
    }

    public void input(View v){
       show.setText(input.getText());
       input.setText("");
    }

    public void cc(View v){
        show.setText("");
    }

    public void red(View v){
        show.setTextColor(Color.rgb(200,0,0));
    }

    public void green(View v){
        show.setTextColor(Color.rgb(0,200,0));
    }

    public void blue(View v){
        show.setTextColor(Color.rgb(0,0,200));
    }

    public void pink(View v){
        show.setBackgroundColor(Color.rgb(255,245,238));
    }

    public void black(View v){
        show.setBackgroundColor(Color.rgb(0,0,0));
    }

    public void cync(View v){
        show.setBackgroundColor(Color.rgb(151,255,255));
    }

}
