package com.toDoListChallenge.toDoListChallenge.repository;

import com.toDoListChallenge.toDoListChallenge.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
