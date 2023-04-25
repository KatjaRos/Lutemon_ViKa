package com.example.lutemon_vika;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void switchToAddUserInfo(View view) {
        Intent intent = new Intent(this, CreateNewLutemon.class);
        startActivity(intent);
    }
    public void switchToListUsersActivity(View view) {
        Intent intent = new Intent(this, ListLutemonsActivity.class);
        startActivity(intent);
    }
    public void switchToTrainLutemon(View view) {
        Intent intent = new Intent(this, TrainLutemonsActivity.class);
        startActivity(intent);
    }
    public void switchToFigthLutemons(View view) {
        Intent intent = new Intent(this, FigthLutemonsActivity.class);
        startActivity(intent);
    }


}