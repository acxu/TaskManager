package edu.tjhsst.taskmanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

// opens up the welcome screen with buttons that will go to the task or schedule page

public class WelcomeActivity extends AppCompatActivity {
    private Button mTaskButton;
    private Button mScheduleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasks);

        mTaskButton = (Button) findViewById(R.id.task_button);
        mTaskButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(WelcomeActivity.this, TasksActivity.class);
                startActivity(i);
            }
        });
        mScheduleButton = (Button) findViewById(R.id.schedule_button);
        mScheduleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(WelcomeActivity.this, ScheduleActivity.class);
                startActivity(i);
            }
        });
    }
}
