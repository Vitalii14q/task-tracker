package org.example.dao;

import org.example.dto.Epic;

import java.util.List;

public interface Dao<T> {
    long add(T element);

    void update();

    void remove();

    List<T> getAll();

    T getById(long id);
}
