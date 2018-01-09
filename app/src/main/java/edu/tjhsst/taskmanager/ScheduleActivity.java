package edu.tjhsst.taskmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

// displays the schedule for the day, allows you to add a task to the list

public class ScheduleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasks);
    }
}