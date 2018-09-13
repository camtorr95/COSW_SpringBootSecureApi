package com.eci.cosw.springbootsecureapi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eci.cosw.springbootsecureapi.model.Todo;

@Service
public class TodoServiceImpl implements TodoService {
	
	private ArrayList<Todo> todoList = new ArrayList<>();
	
	@Autowired
	public TodoServiceImpl() {
		
	}

	@Override
	public List<Todo> getTodoList() {
		return todoList;
	}

	@Override
	public Todo addTodo(Todo todo) {
		todoList.add(todo);
		return todo;
	}

}
