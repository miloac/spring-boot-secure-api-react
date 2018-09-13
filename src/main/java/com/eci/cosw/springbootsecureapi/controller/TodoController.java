package com.eci.cosw.springbootsecureapi.controller;

import com.eci.cosw.springbootsecureapi.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import com.eci.cosw.springbootsecureapi.model.Todo;

@RestController
@RequestMapping( "api" )
public class TodoController {

    @Autowired
    private TodoService ts;

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping( value = "/todo", method = RequestMethod.GET )
    public List<Todo> getTodoList(){
        return ts.getTodoList();
    }


    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping( value = "/todo", method = RequestMethod.POST )
    public void addTodo(@RequestBody Todo todo){
        ts.addTodo(todo);
    }
}