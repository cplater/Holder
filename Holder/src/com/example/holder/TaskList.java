/**
 * 
 */
package com.example.holder;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * @author cplater
 *
 */
public class TaskList {

    private static TaskList ref;
    private static List<Task> theTasks;
	
	/*
	 * Prevent Default constructor from being used
	 */
    private TaskList() {
	}

	public static synchronized TaskList getTaskList()
    {
      if (ref == null)
      {
          // it's ok, we can call this constructor
          ref = new TaskList();
          
          // Prepopulate the Tasklist
          
          theTasks = new ArrayList<Task>();
          
          Calendar c = Calendar.getInstance();
          
          c.clear();
          c.set(2014, Calendar.JANUARY, 20);
          theTasks.add( new Task("Task A", "The first task", "Pending", (Calendar) c.clone(),
        		  "Work", "Low"));
         
          c.set(2013, Calendar.MARCH, 16);
          theTasks.add( new Task("Task B", "The second task", "Completed", (Calendar) c.clone(),
        		  "Work", "Medium"));
         
          c.set(2014, Calendar.AUGUST, 5);
          theTasks.add( new Task("Task C", "The third task", "Pending", (Calendar) c.clone(),
        		  "Work", "High"));
         
      }
      return ref;
    }

     
    public Object clone() throws CloneNotSupportedException
	{
	    throw new CloneNotSupportedException(); 
	    // that'll teach 'em, no cloning the singleton
	}
    
    public Task[] getTasks()
    {
    	return (Task[]) theTasks.toArray();
    }
	
    /*
     * Test driver for this class
     */
    public static void main(String[] args)
    {
    	TaskList taskList = TaskList.getTaskList();
    	
    	for ( int i = 0; i < taskList.theTasks.size(); i++)
    	{
    		System.out.println( taskList.theTasks.get(i).toFullString());
    	}
    }
}


