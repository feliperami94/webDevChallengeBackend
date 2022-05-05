package com.toDoListChallenge.toDoListChallenge.service;

import com.toDoListChallenge.toDoListChallenge.dto.CategoryDTO;
import com.toDoListChallenge.toDoListChallenge.entity.Category;
import com.toDoListChallenge.toDoListChallenge.entity.Task;

import java.util.List;

public interface ToDoService {
    Category createCategory(Category category);

    Category createTask(Task task);

    void deleteCategory(Long id);

    void deleteTask(Long id);

    List<CategoryDTO> getAllCategories();
}
