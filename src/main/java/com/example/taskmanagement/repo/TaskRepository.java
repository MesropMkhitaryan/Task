package com.example.taskmanagement.repo;

import com.example.taskmanagement.entity.Task;
import com.example.taskmanagement.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Integer> {
}
