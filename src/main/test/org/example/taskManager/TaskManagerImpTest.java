package org.example.taskManager;

import org.example.dto.Status;
import org.example.dto.Task;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskManagerImpTest {
    private final TaskManger taskManger = new TaskManagerImp();

    @Test
    void addTask() {
        Task expectedTask = new Task();
        expectedTask.setName("By apple");
        expectedTask.setDescription("By green apple");
        expectedTask.setStatus(Status.NEW);

        long taskId = taskManger.addTask(expectedTask);
        Task actualTask = taskManger.getTaskById(taskId);

        Assertions.assertEquals(expectedTask.getName(), actualTask.getName());
        Assertions.assertEquals(expectedTask.getDescription(), actualTask.getDescription());
        Assertions.assertEquals(expectedTask.getStatus(), actualTask.getStatus());
        Assertions.assertEquals(taskId, actualTask.getId());
        Assertions.assertTrue(actualTask.getId() >= 0);
    }

    @Test
    void updateTask() {
    }

    @Test
    void removeTask() {
    }

    @Test
    void getTaskById() {
    }

    @Test
    void getAllTasks() {
    }

    @Test
    void addSubTask() {
    }

    @Test
    void updateSubTask() {
    }

    @Test
    void removeSubTask() {
    }

    @Test
    void getSubtaskById() {
    }

    @Test
    void getAllSubtasks() {
    }

    @Test
    void addEpic() {
    }

    @Test
    void updateEpic() {
    }

    @Test
    void removeEpic() {
    }

    @Test
    void getEpicById() {
    }

    @Test
    void getAllEpic() {
    }
}