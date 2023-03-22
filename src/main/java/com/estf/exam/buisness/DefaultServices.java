package com.estf.exam.buisness;

import java.util.ArrayList;
import java.util.List;

import com.estf.exam.beans.Task;
import com.estf.exam.dao.TaskDao;
import com.estf.exam.dao.TaskDaoMemory;


public class DefaultServices implements Services {
	
	private List<Task> taskList;
	private int nextTaskId;
	private  TaskDao taskDao ; 

	private static DefaultServices instance = null;
	public static DefaultServices getInstance() {
		if(instance==null)
			instance=new DefaultServices(new TaskDaoMemory());
		return instance;
	}

	public DefaultServices(TaskDao taskDao) {
		this.taskDao = taskDao;
	}
	public DefaultServices() {
		taskList = new ArrayList<>();
		nextTaskId = 1;
	}

	@Override
	public Task createTask(Task task) {
		task.setId(nextTaskId++);
		taskList.add(task);
		return task;
	}

	@Override
	public Task getTaskById(int id) {
		for (Task task : taskList) {
			if (task.getId() == id) {
				return task;
			}
		}
		return null;
	}

	@Override
	public List<Task> getAllTasks() {
		return new ArrayList<>(taskList);
	}

	@Override
	public Task updateTask(Task task) {
		for (int i = 0; i < taskList.size(); i++) {
			Task t = taskList.get(i);
			if (t.getId() == task.getId()) {
				taskList.set(i, task);
				return task;
			}
		}
		return null;
	}

	@Override
	public void deleteTask(Task task) {
		taskList.removeIf(t -> t.getId() == task.getId());
	}

}
