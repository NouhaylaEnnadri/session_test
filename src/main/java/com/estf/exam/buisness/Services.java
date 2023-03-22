package com.estf.exam.buisness;

import java.util.List;

import com.estf.exam.beans.Task;


public interface Services {
	
	Task createTask(Task task );

	Task getTaskById(int id);


	List<Task> getAllTasks();

	Task updateTask(Task task);

	void deleteTask(Task task);

}
