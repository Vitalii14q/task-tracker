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
        
    }

    @Override
    public void removeTask(long taskId) {

    }

    @Override
    public Task getTaskById(long taskId) {
        return null;
    }

    @Override
    public List<Task> getAllTasks() {
        return null;
    }

    @Override
    public long addSubTask(Subtask subtask) {
        return 0;
    }

    @Override
    public void updateSubTask(Subtask subtask) {

    }

    @Override
    public void removeSubTask(long SubTaskId) {

    }

    @Override
    public Subtask getSubtaskById(long SubtaskId) {
        return null;
    }

    @Override
    public List<Subtask> getAllSubtasks() {
        return null;
    }

    @Override
    public long addEpic(Epic epic) {
        return 0;
    }

    @Override
    public void updateEpic(Epic epic) {

    }

    @Override
    public void removeEpic(Epic epic) {

    }

    @Override
    public Epic getEpicById(long EpicId) {
        return null;
    }

    @Override
    public List<Epic> getAllEpic() {
        return null;
    }
}
