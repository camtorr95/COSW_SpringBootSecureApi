package com.eci.cosw.springbootsecureapi.model;

import java.util.Date;

public class Todo {
	
	private String text;
	
	private int priority;
	
	private Date dueDate;
	
	public Todo() {
		
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	public String getText() {
		return text;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date date) {
		this.dueDate = date;
	}
	
}
