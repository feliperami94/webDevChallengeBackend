package com.toDoListChallenge.toDoListChallenge.dto;

import lombok.Data;

@Data
public class TaskDTO {
    private Long id;
    private String taskMessage;
    private boolean taskStatus;
}
