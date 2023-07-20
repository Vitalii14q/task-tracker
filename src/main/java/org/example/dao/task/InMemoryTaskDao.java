package org.example.dao.task;

import org.example.dao.util.IdGenerator;
import org.example.dto.Task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class InMemoryTaskDao implements TaskDao{
    private final IdGenerator idGenerator = new IdGenerator();
    private final HashMap<Long, Task> taskHashMap = new HashMap<>();

    @Override
    public long add(Task task) {
        long id = idGenerator.generateId();
        taskHashMap.put(id, task);
        task.setId(id);
        return id;
    }


    @Override
    public void update(Task element) {
        taskHashMap.put(element.getId(), element);
    }

    @Override
    public void remove(long id) {
        taskHashMap.remove(id);
    }

    @Override
    public List<Task> getAll() {
        return new ArrayList<>(taskHashMap.values());
    }

    @Override
    public Task getById(long id) {
        return taskHashMap.get(id);
    }
}
