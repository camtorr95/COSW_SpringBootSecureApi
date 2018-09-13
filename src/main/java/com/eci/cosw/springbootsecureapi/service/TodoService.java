package com.eci.cosw.springbootsecureapi.service;

import java.util.List;

import com.eci.cosw.springbootsecureapi.model.Todo;

public interface TodoService {
	
	public List<Todo> getTodoList();
	
	public Todo addTodo(Todo todo);
}
