package org.example.dto;

public enum Status {
    NEW("Задача создана, но выполнения не началось"),
    IN_PROGRESS("Задача выполняеться"),
    DONE("Задача завершена");

    private String description;

    Status (String description) {
        this.description = description;
    }

    public String getDescription () {
        return description;
    }
}
