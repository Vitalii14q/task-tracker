package org.example.dao.util;

public class IdGenerator {
    private long currentId;

    public long generateId() {
        return currentId++;
    }
}
