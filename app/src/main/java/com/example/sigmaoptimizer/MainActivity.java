package com.example.sigmaoptimizer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.sigmaoptimizer.workout.BackWorkout;
import com.example.sigmaoptimizer.workout.BicepsWorkout;
import com.example.sigmaoptimizer.workout.ChestWorkout;
import com.example.sigmaoptimizer.workout.ForearmsWorkout;
import com.example.sigmaoptimizer.workout.LegsWorkout;
import com.example.sigmaoptimizer.workout.ShouldersWorkout;
import com.example.sigmaoptimizer.workout.TricepsWorkout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
    }

    public void chest(View view) {
        Intent intent = new Intent(MainActivity.this, ChestWorkout.class);
        startActivity(intent);
    }

    public void back(View view) {
        Intent intent = new Intent(MainActivity.this, BackWorkout.class);
        startActivity(intent);
    }

    public void biceps(View view) {
        Intent intent = new Intent(MainActivity.this, BicepsWorkout.class);
        startActivity(intent);
    }

    public void triceps(View view) {
        Intent intent = new Intent(MainActivity.this, TricepsWorkout.class);
        startActivity(intent);
    }

    public void shoulders(View view) {
        Intent intent = new Intent(MainActivity.this, ShouldersWorkout.class);
        startActivity(intent);
    }

    public void forearm(View view) {
        Intent intent = new Intent(MainActivity.this, ForearmsWorkout.class);
        startActivity(intent);
    }

    public void legs(View view) {
        Intent intent = new Intent(MainActivity.this, LegsWorkout.class);
        startActivity(intent);
    }
}