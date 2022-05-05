package com.toDoListChallenge.toDoListChallenge.service;

import com.toDoListChallenge.toDoListChallenge.dto.CategoryDTO;
import com.toDoListChallenge.toDoListChallenge.dto.TaskDTO;
import com.toDoListChallenge.toDoListChallenge.entity.Category;
import com.toDoListChallenge.toDoListChallenge.entity.Task;
import com.toDoListChallenge.toDoListChallenge.repository.CategoryRepository;
import com.toDoListChallenge.toDoListChallenge.repository.TaskRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ToDoServiceImpl implements ToDoService{

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private ModelMapper modelMapper;

    private CategoryDTO convertCategoryToDTO(Category category){
        CategoryDTO categoryDTO;
        categoryDTO = modelMapper.map(category, CategoryDTO.class);
        return categoryDTO;
    }

    private Category revertCategoryFromDTO(CategoryDTO categoryDTO){
        Category category = new Category();
        category = modelMapper.map(categoryDTO, Category.class);
        return category;
    }

    private TaskDTO convertTaskToDTO(Task task){
        TaskDTO taskDTO;
        taskDTO = modelMapper.map(task, TaskDTO.class);
        return taskDTO;
    }

    private Task revertTaskFromDTO(TaskDTO taskDTO){
        Task task = new Task();
        task = modelMapper.map(taskDTO, Task.class);
        return task;
    }

    @Override
    public List<CategoryDTO> getAllCategories() {
        return categoryRepository.findAll()
                .stream()
                .map(this::convertCategoryToDTO)
                .collect(Collectors.toList());
    }



    @Override
    public Category createCategory(Category category) {

        return categoryRepository.save(category);
    }

    @Override
    public Category createTask(Task task) {
        Category category = categoryRepository.findById(task.getFkCategory()).get();
        category.addTask(task);
        taskRepository.save(task);
        return categoryRepository.save(category);
    }

    @Override
    public void deleteCategory(Long id) {
        Category categoryToDelete = categoryRepository.findById(id).get();
        if(!categoryToDelete.getTaskList().isEmpty()){
            categoryToDelete.getTaskList().forEach(task -> taskRepository.deleteById(task.getTaskId()));
        }
        categoryRepository.deleteById(id);
    }

    @Override
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }


}
