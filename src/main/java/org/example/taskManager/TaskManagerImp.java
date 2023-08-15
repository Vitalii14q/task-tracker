package org.example.taskManager;

import org.example.dao.epic.EpicDao;
import org.example.dao.epic.InMemoryEpicDao;
import org.example.dao.subtask.InMemorySubTaskDao;
import org.example.dao.subtask.SubTaskDao;
import org.example.dao.task.InMemoryTaskDao;
import org.example.dao.task.TaskDao;
import org.example.dto.Epic;
import org.example.dto.Subtask;
import org.example.dto.Task;

import java.util.List;

public class TaskManagerImp implements TaskManger{
    private final TaskDao taskDao = new InMemoryTaskDao();
    private final SubTaskDao subTaskDao = new InMemorySubTaskDao();
    private final EpicDao epicDao = new InMemoryEpicDao();

    @Override
    public long addTask(Task task) {
        return taskDao.add(task);
    }

    @Override
    public void updateTask(Task task) {
        taskDao.update(task);
    }

    @Override
    public void removeTask(long taskId) {
        taskDao.remove(taskId);
    }

    @Override
    public Task getTaskById(long taskId) {
        return taskDao.getById(taskId);
    }

    @Override
    public List<Task> getAllTasks() {
        return taskDao.getAll();
    }

    @Override
    public long addSubTask(Subtask subtask) {
        return subTaskDao.add(subtask);
    }

    @Override
    public void updateSubTask(Subtask subtask) {
        subTaskDao.update(subtask);
    }

    @Override
    public void removeSubTask(long subTaskId) {
        subTaskDao.remove(subTaskId);
    }

    @Override
    public Subtask getSubtaskById(long subtaskId) {
        return subTaskDao.getById(subtaskId);
    }

    @Override
    public List<Subtask> getAllSubtasks() {
        return subTaskDao.getAll();
    }

    @Override
    public long addEpic(Epic epic) {
        return epicDao.add(epic);
    }

    @Override
    public void updateEpic(Epic epic) {
        epicDao.update(epic);
    }

    @Override
    public void removeEpic(long epicId) {
        epicDao.remove(epicId);
    }

    @Override
    public Epic getEpicById(long epicId) {
        return epicDao.getById(epicId);
    }

    @Override
    public List<Epic> getAllEpic() {
        return epicDao.getAll();
    }
}
