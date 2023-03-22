package com.estf.exam.beans;


public class Task {
	
	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Task(int id, String task) {
		super();
		this.id = id;
		this.task = task;
	}
	private int id;
    private String task;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
}
