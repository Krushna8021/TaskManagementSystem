package com.example.taskmanagement.service;

import com.example.taskmanagement.model.Task;

import java.util.List;

public interface TaskService {
    Task createTask(Task task);
    Task updateTask(int id, Task task);
    void deleteTask(int id);
    List<Task> getAllTasks();
    Task getTaskById(int id);
    List<Task> getTasksByUserId(int userId);
    List<Task> filterTasks(String status, String priority);
}
