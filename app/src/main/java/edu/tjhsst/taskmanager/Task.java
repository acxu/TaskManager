package edu.tjhsst.taskmanager;

/**
 * Created by 2019axu on 12/14/2017.
 */

// Task class, stores all the info you need to know about the task

public class Task {
    int time;
    String title;

    protected static final String NAME_PREFIX = "Task: ";
    protected static final String SURNAME_PREFIX = "Time: ";

    public Task(int time, String title){
        this.time = time;
        this.title = title;
    }
    public int getTime(){
        return time;
    }
    public String getTitle(){
        return title;
    }

}
