package org.example;

public class Subtask extends Task {
    private Epic epic;

    public Subtask(String name, String info, String status, Epic epic) {
        super(name, info, status);
        this.epic = epic;
    }

    public void setEpic (Epic epic) {
        this.epic = epic;
    }

    public Epic getEpic () {
        return epic;
    }


}
