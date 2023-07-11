package org.example.dto;

public class Subtask extends Task {
    private Epic epic;

    public Subtask(Epic epic) {
        this.epic = epic;
    }

    public void setEpic (Epic epic) {
        this.epic = epic;
    }

    public Epic getEpic () {
        return epic;
    }

    @Override
    public String toString() {
        return "Subtask{" +
                "epicId=" + epic.getId() + ", " +
                "id = " + getId() + ", " +
                "name = " + getName() + ", " +
                "description = " + getDescription() + ", " +
                "status = " + getStatus() +
                '}';
    }
}
