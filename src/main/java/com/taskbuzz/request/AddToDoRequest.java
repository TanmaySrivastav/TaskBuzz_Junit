package com.taskbuzz.request;

import java.sql.Date;

import com.taskbuzz.entities.Priority;


public class AddToDoRequest {
	private String task;
	private Date dueDate;
	private Priority priority;
	private String category;


	public AddToDoRequest(String Task, Date dueDate, Priority priority, String category) {
		this.task = Task;
		this.dueDate = dueDate;
		this.priority = priority;
		this.category = category;
	}
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}


	public Priority getPriority() {
		return priority;
	}

	public void setPriority(Priority priority) {
		this.priority = priority;
	}

	public AddToDoRequest() {
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

}
