package org.example.taskManager;

import org.example.dto.Status;
import org.example.dto.Task;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class TaskManagerImpTest {
    private final TaskManger taskManager = new TaskManagerImp();

    private Task buildTask () {
        Task taskForAdd = new Task();
        taskForAdd.setName("Bay apple");
        taskForAdd.setDescription("Bay green apple");
        taskForAdd.setStatus(Status.NEW);

        return taskForAdd;
    }
    @Test
    void addTask() {
        Task expectedTask = buildTask();

        long taskId = taskManager.addTask(expectedTask);
        Task actualTask = taskManager.getTaskById(taskId);

        Assertions.assertEquals(expectedTask.getName(), actualTask.getName());
        Assertions.assertEquals(expectedTask.getDescription(), actualTask.getDescription());
        Assertions.assertEquals(expectedTask.getStatus(), actualTask.getStatus());
        Assertions.assertEquals(taskId, actualTask.getId());
        Assertions.assertTrue(actualTask.getId() >= 0);
    }



    @Test
    void updateTask() {
        long taskId = taskManager.addTask(buildTask());

        Task expectedUpdateTask = new Task();
        expectedUpdateTask.setId(taskId);
        expectedUpdateTask.setName("Bay apple and peach");
        expectedUpdateTask.setDescription("Bay green apple and yellow peach");
        expectedUpdateTask.setStatus(Status.IN_PROGRESS);

        taskManager.updateTask(expectedUpdateTask);
        Task actualUpdateTask = taskManager.getTaskById(taskId);

        Assertions.assertEquals(expectedUpdateTask.getName(), actualUpdateTask.getName());
        Assertions.assertEquals(expectedUpdateTask.getDescription(), actualUpdateTask.getDescription());
        Assertions.assertEquals(expectedUpdateTask.getStatus(), actualUpdateTask.getStatus());
        Assertions.assertEquals(actualUpdateTask.getId(), expectedUpdateTask.getId());
    }

    @Test
    void removeTask() {
        long taskId = taskManager.addTask(buildTask());
        taskManager.removeTask(taskId);

        Assertions.assertNull(taskManager.getTaskById(taskId));
    }

    private boolean searchElement(long taskId, List<Task> tasks) {
        for (int i = 0; i < tasks.size(); i++){
            Task element = tasks.get(i);
            if (element.getId() == taskId) {
                return true;
            }
        }
        return false;
    }

    @Test
    void getAllTasks() {
        long taskId1 = taskManager.addTask(buildTask());
        long taskId2 = taskManager.addTask(buildTask());
        long taskId3 = taskManager.addTask(buildTask());

        List<Task> tasks = taskManager.getAllTasks();

        Assertions.assertTrue(tasks.size() >= 3);
        Assertions.assertTrue(searchElement(taskId1, tasks));
        Assertions.assertTrue(searchElement(taskId2, tasks));
        Assertions.assertTrue(searchElement(taskId3, tasks));

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