package org.example;

import java.util.ArrayList;
import java.util.List;


public class Epic extends Task {

    private List<Subtask> subtasks;

    public Epic (String name, String info, String status) {
        super(name, info, status);
        subtasks = new ArrayList<>();
    }

    public List<Subtask> getSubtasks() {
        return subtasks;
    }

    public void addSubtask(Subtask subtask) {
        subtasks.add(subtask);
    }

    public void removeSubtask(Subtask subtask) {
        subtasks.remove(subtask);
    }
}
