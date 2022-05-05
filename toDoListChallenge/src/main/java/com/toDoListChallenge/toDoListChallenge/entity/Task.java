package com.toDoListChallenge.toDoListChallenge.entity;


import lombok.Data;

import javax.persistence.*;

@Entity(name = "Task")
@Table(name = "task")
@Data
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long taskId;
    private String taskMessage;
    private Boolean taskStatus;
    private Long fkCategory;
}
