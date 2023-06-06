package com.example.taskmaster.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.taskmaster.R;

public class AddTaskActivity extends AppCompatActivity {
    private static final String TAG = "AddTaskActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button btnSubmitTask = findViewById(R.id.btn_submit_task);


            TextView taskTitle = findViewById(R.id.pt_task_title);
            TextView taskDescription = findViewById(R.id.pt_task_desc);

            // get the intent which was passed
            Intent passedIntent = getIntent();

            String greeting = passedIntent.getStringExtra("greeting");

            String description = passedIntent.getStringExtra("description");


            taskTitle.setText(greeting);
            taskDescription.setText(description);



        btnSubmitTask.setOnClickListener(view -> {
            Log.i(TAG, "submit button clicked");
            Toast.makeText(this, "submitted!", Toast.LENGTH_SHORT).show();

        });
    }
}