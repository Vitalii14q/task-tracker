package org.example.dao.subtask;

import org.example.dao.Dao;
import org.example.dto.Epic;
import org.example.dto.Subtask;

public interface SubTaskDao extends Dao<Subtask> {
    void changeEpic(long subtaskId, Epic epic);
}
