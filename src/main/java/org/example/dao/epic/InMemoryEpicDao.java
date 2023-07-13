package org.example.dao.epic;

import org.example.dao.epic.EpicDao;
import org.example.dto.Epic;
import org.example.dto.Subtask;

import java.util.HashMap;
import java.util.List;

public class InMemoryEpicDao implements EpicDao {

    private long currentId;
    HashMap<Long, Epic> epicHashMap = new HashMap<>();

    private long generateId() {
        return currentId++;
    }
    @Override
    public long add(Epic epic) {
        long id = generateId();
        epicHashMap.put(id, epic);
        return id;
    }

    @Override
    public void update() {

    }

    @Override
    public void remove() {

    }

    @Override
    public List<Epic> getAll() {
        return null;
    }

    @Override
    public Epic getById(long id) {
        return null;
    }
}
