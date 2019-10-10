package com.example.oyohotelbookingclone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button searchbar;
    ImageView iv1, iv2, iv3, iv4, iv5, imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView=findViewById(R.id.imageView);
        searchbar=findViewById(R.id.searchBar);
        iv1= findViewById(R.id.iv1);
        iv2= findViewById(R.id.iv2);
        iv3= findViewById(R.id.iv3);
        iv4= findViewById(R.id.iv4);
        iv5= findViewById(R.id.iv5);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              startActivity(new Intent(MainActivity.this, SearchActivity.class));
            }
        });

        iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, HotelDescActivity.class));
            }
        });
    }
}
