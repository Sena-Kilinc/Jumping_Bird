package com.senakilinc.flappingbirdclone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView plyBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppConstants.initialization(this.getApplicationContext());
        plyBtn = findViewById(R.id.plyBtn);
        plyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"PLAY!",Toast.LENGTH_SHORT).show();
                Intent intent =new Intent(MainActivity.this,GameActivity.class);
                startActivity(intent);
            }
        });
    }
}