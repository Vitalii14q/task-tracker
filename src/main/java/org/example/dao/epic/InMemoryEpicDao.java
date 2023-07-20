package org.example.dao.epic;

import org.example.dao.util.IdGenerator;
import org.example.dto.Epic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class InMemoryEpicDao implements EpicDao {

    private final HashMap<Long, Epic> epicHashMap = new HashMap<>();
    private final IdGenerator idGenerator = new IdGenerator();

    @Override
    public long add(Epic epic) {
        long id = idGenerator.generateId();
        epicHashMap.put(id, epic);
        epic.setId(id);
        return id;
    }

    @Override
    public void update(Epic epic) {
        epicHashMap.put(epic.getId(), epic);
    }

    @Override
    public void remove(long id) {
        epicHashMap.remove(id);
    }

    @Override
    public List<Epic> getAll() {
        return new ArrayList<>(epicHashMap.values());
    }

    @Override
    public Epic getById(long id) {
        return epicHashMap.get(id);
    }
}
