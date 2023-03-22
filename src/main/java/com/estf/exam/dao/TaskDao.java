package com.estf.exam.dao;

import java.util.List;

import com.estf.exam.beans.Task;


public interface TaskDao {

	    Task saveTask(Task task);
	    Task getTaskById(int id);
	    Task updateTask(Task task);
	    Task deleteTask(Task task);
	    List<Task> getAllTasks();
	    
}
