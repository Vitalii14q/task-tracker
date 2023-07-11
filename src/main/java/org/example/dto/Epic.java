package org.example.dto;

import java.util.ArrayList;
import java.util.List;


public class Epic extends Task {

    private List<Subtask> subtasks = new ArrayList<>();

    public List<Subtask> getSubtasks() {
        return subtasks;
    }

    public void addSubtask(Subtask subtask) {
        subtasks.add(subtask);
    }

    public void removeSubtask(Subtask subtask) {
        subtasks.remove(subtask);
    }

    @Override
    public String toString() {
        return "Epic{" +
                "subtasks=" + subtasks.size() + ", " +
                "id = " + getId() + ", " +
                "name = " + getName() + ", " +
                "description = " + getDescription() + ", " +
                "status = " + getStatus() +
                '}';
    }
}
