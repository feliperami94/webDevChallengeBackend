package com.toDoListChallenge.toDoListChallenge.controller;

import com.toDoListChallenge.toDoListChallenge.dto.CategoryDTO;
import com.toDoListChallenge.toDoListChallenge.entity.Category;
import com.toDoListChallenge.toDoListChallenge.entity.Task;
import com.toDoListChallenge.toDoListChallenge.service.ToDoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/category")
    public Category createCategory(@RequestBody Category category){
        return toDoService.createCategory(category);
    }

    @PostMapping("/task")
    public Category createTask(@RequestBody Task task){
        return toDoService.createTask(task);
    }

    @DeleteMapping("/delete/task/{id}")
    public void deleteTask(@PathVariable Long id){
        toDoService.deleteTask(id);
    }

    @DeleteMapping("/delete/category/{id}")
    public void deleteCategory(@PathVariable Long id){
        toDoService.deleteCategory(id);
    }




}
