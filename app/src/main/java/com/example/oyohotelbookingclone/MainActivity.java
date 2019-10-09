package com.example.oyohotelbookingclone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button searchbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchbar=findViewById(R.id.searchBar);
        searchbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment=new HomeFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer,fragment).commit();
            }
        });
    }
}
