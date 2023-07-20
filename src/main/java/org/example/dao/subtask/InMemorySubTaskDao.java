package org.example.dao.subtask;

import org.example.dao.util.IdGenerator;
import org.example.dto.Epic;
import org.example.dto.Subtask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class InMemorySubTaskDao implements SubTaskDao {
    private final IdGenerator idGenerator = new IdGenerator();
    private final HashMap<Long, Subtask> subtaskHashMap = new HashMap<>();


    @Override
    public long add(Subtask subtask) {
        long id = idGenerator.generateId();
        subtaskHashMap.put(id, subtask);
        subtask.setId(id);
        return id;
    }

    @Override
    public void update(Subtask subtask) {
        subtaskHashMap.put(subtask.getId(), subtask);
    }

    @Override
    public void remove(long id) {
        subtaskHashMap.remove(id);
    }

    @Override
    public List<Subtask> getAll() {
        return new ArrayList<>(subtaskHashMap.values());
    }

    @Override
    public Subtask getById(long id) {
        return subtaskHashMap.get(id);
    }

    @Override
    public void changeEpic(long subtaskId, Epic epic) {
        Subtask subtask = subtaskHashMap.get(subtaskId);
        subtask.setEpic(epic);
    }
}
