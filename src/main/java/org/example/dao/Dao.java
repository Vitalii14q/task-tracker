package org.example.dao;

import org.example.dto.Epic;

import java.util.List;

public interface Dao<T> {
    long add(T element);
    void update(T element);
    void remove(long id);
    List<T> getAll();
    T getById(long id);
}
