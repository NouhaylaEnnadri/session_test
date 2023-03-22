package com.estf.exam.dao;

import java.util.ArrayList;
import java.util.List;

import com.estf.exam.beans.Task;

public class TaskDaoMemory implements TaskDao {

    private List<Task> tasks = new ArrayList<>();

    @Override
    public Task saveTask(Task task) {
    	 if (tasks == null) {
 	        tasks = new ArrayList<Task>();
 	    }
    	 else 
 	    tasks.add(task);
        return task;
    }

    
    @Override
    public Task updateTask(Task task) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getId() == task.getId()) {
                tasks.set(i, task);
                return task;
            }
        }
        return null;
    }

    @Override
    public Task deleteTask(Task task) {
        boolean removed = tasks.remove(task);
        return removed ? task : null;
    }

    @Override
    public List<Task> getAllTasks() {
        return new ArrayList<>(tasks);
    }

	@Override
	public Task getTaskById(int id) {
		 for (Task task : tasks) {
	            if (task.getId() == id) {
	                return task;
	            }
	        }
	        return null;
	}
}
