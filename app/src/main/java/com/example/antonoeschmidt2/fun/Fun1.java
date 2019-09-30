package com.example.antonoeschmidt2.fun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Fun1 extends AppCompatActivity implements View.OnClickListener {
    Button indButton;
    Button webButton;
    Button andetButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun1);
        indButton = findViewById(R.id.indButton);
        webButton = findViewById(R.id.webButton);
        andetButton = findViewById(R.id.andetButton);
        indButton.setOnClickListener(this);
        webButton.setOnClickListener(this);
        andetButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.indButton:
                Toast.makeText(this,"Coming soon. Try Web",Toast.LENGTH_SHORT).show();
                break;

            case R.id.webButton:
                Toast.makeText(this,"Web",Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(this,WebActivity.class);
                startActivity(intent1);
                break;

            case R.id.andetButton:
                Toast.makeText(this,"Also coming soon.. Try Web",Toast.LENGTH_SHORT).show();
                break;

            default:
                break;
        }

    }
}

