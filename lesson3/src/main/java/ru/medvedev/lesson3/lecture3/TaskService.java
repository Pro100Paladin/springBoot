package ru.medvedev.lesson3.lecture3;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class TaskService {

    private final List<Task> tasks = new ArrayList<>();

    public List<Task> getTasks() {
        return tasks;
    }

    public Task getTaskById(UUID id) {
        return tasks.stream()
                .filter(task -> task.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public Task addTask(Task task) {
        tasks.add(task);
        return task;
    }

    public void deleteTask(UUID id) {
        tasks.removeIf(task -> task.getId().equals(id));
    }

    public Task updateTask(UUID id, Task task) {
        Task oldTask = getTaskById(id);
        if (oldTask != null) {
            oldTask.setDescription(task.getDescription());
            oldTask.setName(task.getName());
            oldTask.setStatus(task.getStatus());
            oldTask.setCompletionTime(task.getCompletionTime());
        }
        return oldTask;
    }
}
