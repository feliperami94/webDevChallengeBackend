package com.toDoListChallenge.toDoListChallenge.repository;

import com.toDoListChallenge.toDoListChallenge.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
