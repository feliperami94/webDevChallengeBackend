package com.toDoListChallenge.toDoListChallenge.controller;

import com.toDoListChallenge.toDoListChallenge.dto.CategoryDTO;
import com.toDoListChallenge.toDoListChallenge.service.ToDoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class Controller {

    @Autowired
    private ToDoServiceImpl toDoService;

    @GetMapping
    public List<CategoryDTO> getAllCategories(){
        return toDoService.getAllCategories();
    }

}
