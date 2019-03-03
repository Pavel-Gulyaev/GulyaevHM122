package com.example.gulyaevhm122;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button leftButton = (Button) findViewById(R.id.leftButton);
        Button rightButton = (Button) findViewById(R.id.rightButton);
        TextView textView = (TextView) findViewById(R.id.textView);

        Random random = new Random();

        textView.setText("Изображение № " + random.nextInt(100));

        leftButton.setOnClickListener(this);
        rightButton.setOnClickListener(this);
    }

    public void onClick(View v){
        switch (v.getId()) {
            case R.id.rightButton: {
                Intent intent = new Intent(this, MainActivity.class);
                this.startActivity(intent);
                break;
            }
            case R.id.leftButton:{
                this.finish();
                break;
            }
        }
    }


}
