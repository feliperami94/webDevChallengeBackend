package com.toDoListChallenge.toDoListChallenge.dto;

import lombok.Data;

@Data
public class TaskDTO {
    private Long taskId;
    private String taskMessage;
    private boolean taskStatus;
    private Long fkCategory;
}
