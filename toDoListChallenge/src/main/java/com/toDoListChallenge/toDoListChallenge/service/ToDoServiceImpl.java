package com.toDoListChallenge.toDoListChallenge.service;

import com.toDoListChallenge.toDoListChallenge.dto.CategoryDTO;
import com.toDoListChallenge.toDoListChallenge.dto.TaskDTO;
import com.toDoListChallenge.toDoListChallenge.entity.Category;
import com.toDoListChallenge.toDoListChallenge.entity.Task;
import com.toDoListChallenge.toDoListChallenge.repository.CategoryRepository;
import com.toDoListChallenge.toDoListChallenge.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class ToDoServiceImpl implements ToDoService{

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private TaskRepository taskRepository;

    private CategoryDTO convertCategoryToDTO(Category category){
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setId(category.getId());
        categoryDTO.setCategoryName(category.getCategoryName());
        categoryDTO.setTaskList(category.getTaskList());
        return categoryDTO;
    }

    private TaskDTO convertTaskToDTO(Task task){
        TaskDTO taskDTO = new TaskDTO();
        taskDTO.setId(task.getTaskId());
        taskDTO.setTaskMessage(task.getTaskMessage());
        taskDTO.setTaskStatus(task.getTaskStatus());
        return taskDTO;
    }

    @Override
    public List<CategoryDTO> getAllCategories() {
        return categoryRepository.findAll()
                .stream()
                .map(this::convertCategoryToDTO)
                .collect(Collectors.toList());
    }



    @Override
    public Category createCategory(CategoryDTO categoryDTO) {
        return null;
    }

    @Override
    public Category createTask(Task task) {
        return null;
    }

    @Override
    public void deleteCategory(Long id) {

    }

    @Override
    public void deleteTask(Long id) {

    }


}
