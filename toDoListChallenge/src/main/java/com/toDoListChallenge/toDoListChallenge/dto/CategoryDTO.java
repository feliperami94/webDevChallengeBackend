package com.toDoListChallenge.toDoListChallenge.dto;

import com.toDoListChallenge.toDoListChallenge.entity.Task;
import lombok.Data;

import java.util.List;

@Data
public class CategoryDTO {
    private Long id;
    private String categoryName;
    private List<Task> taskList;
}
