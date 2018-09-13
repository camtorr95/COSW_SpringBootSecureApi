package com.eci.cosw.springbootsecureapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eci.cosw.springbootsecureapi.model.Todo;
import com.eci.cosw.springbootsecureapi.service.TodoService;

@RestController
@RequestMapping( "api" )
public class TodoController {
	
	@Autowired
	private TodoService todoService;
	
	@CrossOrigin (origins = "http://localhost:3000")
	@RequestMapping (value = "/", method = RequestMethod.GET)
	public List<Todo> getTodoList() {
		return todoService.getTodoList();
	}
	
	@CrossOrigin (origins = "http://localhost:3000")
	@RequestMapping (value = "/", method = RequestMethod.POST)
	public Todo addTodo(@RequestBody Todo todo) {
		System.out.println(todo.getDueDate());
		return todoService.addTodo(todo);
	}
}
