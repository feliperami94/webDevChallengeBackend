package com.toDoListChallenge.toDoListChallenge.entity;


import lombok.Data;

import javax.naming.Name;
import javax.persistence.*;
import java.util.List;

@Entity(name = "Category")
@Table(name = "category")
@Data
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String categoryName;

    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    private List<Task> taskList;


    public Category addTask(Task task){
        this.taskList.add(task);
        return this;
    }
}
