package com.toDoListChallenge.toDoListChallenge.service;


import com.toDoListChallenge.toDoListChallenge.entity.Category;
import com.toDoListChallenge.toDoListChallenge.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TodoService extends JpaRepository {

    Category createCategory(Category category);

    Category createTask(Task task);

    void deleteCategory(Category category);

    void deleteTask(Task task);

    List<Category> getAllCategories();


}
