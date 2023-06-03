package com.example.taskmaster;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.taskmaster.UI.AddTaskActivity;
import com.example.taskmaster.UI.AllTasksActivity;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private final View.OnClickListener mClickMeButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            mGreetingText.setText("onClick");
            mGreetingText.setAllCaps(true);

        }
    };
    private TextView mGreetingText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // this is a good place to do initial
        // set up like click listeners etc
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate: Called");


        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button btnAddTask = findViewById(R.id.btn_add_task);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button btnAllTask = findViewById(R.id.btn_all_task);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button btnSubmitTask = findViewById(R.id.btn_submit_task);

        btnSubmitTask.setOnClickListener(view -> {
            Log.i(TAG, "submit button clicked");
            navigateAddTaskDetails();
            Toast.makeText(this, "submitted!", Toast.LENGTH_SHORT).show();

        });

        btnAddTask.setOnClickListener(view -> {
            Log.i(TAG, "submit button clicked add task");
            navigateAddTaskDetails();
            Toast.makeText(this, "Copyright 2022", Toast.LENGTH_SHORT).show();

        });
        btnAllTask.setOnClickListener(view -> {
            Log.i(TAG, "submit button clicked");
            navigateAllTaskDetails();
        });

    }


    private void navigateAddTaskDetails() {
        Intent AddTaskDetailsIntent = new Intent(this, AddTaskActivity.class);
        startActivity(AddTaskDetailsIntent);
    }
    private void navigateAllTaskDetails() {
        Intent AllTaskDetailsIntent = new Intent(this, AllTasksActivity.class);
        startActivity(AllTaskDetailsIntent);
    }



    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart: called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart: called");
    }

    @Override
    protected void onResume() {
        Log.i(TAG, "onResume: called - The App is VISIBLE");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.i(TAG, "onPause: called");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.i(TAG, "onStop: called");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.i(TAG, "onDestroy: called");
        super.onDestroy();
    }
}