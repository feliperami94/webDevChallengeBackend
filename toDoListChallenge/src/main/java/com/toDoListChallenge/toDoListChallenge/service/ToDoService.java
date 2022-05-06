package com.toDoListChallenge.toDoListChallenge.service;

import com.toDoListChallenge.toDoListChallenge.dto.CategoryDTO;
import com.toDoListChallenge.toDoListChallenge.dto.TaskDTO;
import com.toDoListChallenge.toDoListChallenge.entity.Category;
import com.toDoListChallenge.toDoListChallenge.entity.Task;

import java.util.List;

public interface ToDoService {
    Category createCategory(CategoryDTO categoryDTO);

    Category createTask(TaskDTO taskDTO);

    void deleteCategory(Long id);

    void deleteTask(Long id);

    Category updateTask(TaskDTO taskDTO);

    List<CategoryDTO> getAllCategories();
}
