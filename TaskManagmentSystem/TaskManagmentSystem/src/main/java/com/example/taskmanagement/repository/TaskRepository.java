package com.example.taskmanagement.repository;

import com.example.taskmanagement.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Integer> {
    List<Task> findByUserId(int userId);
    List<Task> findByStatus(String status);
    List<Task> findByPriority(String priority);

    List<Task> findByStatusAndPriority(String status, String priority);
}
