package com.example.demo.service;

import com.example.demo.model.Task;

import java.util.List;

public interface TaskService {
    public Task create (Task task);
    public Task update (Task task);
    public List<Task> getMyTasks( String username );
    void delete (Long id);
}
