package org.example.taskManager;

import org.example.dto.Epic;
import org.example.dto.Subtask;
import org.example.dto.Task;

import java.util.List;

public interface TaskManger {
    long addTask(Task task);
    void updateTask(Task task);
    void removeTask(long taskId);
    Task getTaskById(long taskId);
    List<Task> getAllTasks();
    long addSubTask(Subtask subtask);
    void updateSubTask(Subtask subtask);
    void removeSubTask(long SubTaskId);
    Subtask getSubtaskById(long SubtaskId);
    List<Subtask> getAllSubtasks();
    long addEpic(Epic epic);
    void updateEpic(Epic epic);
    void removeEpic(long epicId);
    Epic getEpicById(long epicId);
    List<Epic> getAllEpic();
}
