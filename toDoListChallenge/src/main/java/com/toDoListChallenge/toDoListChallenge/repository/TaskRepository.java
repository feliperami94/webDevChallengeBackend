package com.toDoListChallenge.toDoListChallenge.repository;

import com.toDoListChallenge.toDoListChallenge.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
