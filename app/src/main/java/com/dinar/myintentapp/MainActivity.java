package com.dinar.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMoveActivity = findViewById(R.id.btnMoveActivity);
        btnMoveActivity.setOnClickListener(this);
    }
     public void onClick(View view){
        switch (view.getId()){
            case R.id.btnMoveActivity:
                Intent moveIntent = new Intent(MainActivity.this,MoveActivity.class);
                startActivity(moveIntent);
            break;
        }
     }

}
