package org.example.dto;

public class Task {

    private String name;
    private String description;
    private Status status;
    private long id;


    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public String setName(String name) {
        return this.name;
    }

    public String getName() {
        return name;
    }

    public String setDescription(String description) {
        return this.description;
    }

    public String getDescription() {
        return description;
    }

    public Status setStatus(Status status) {
        return this.status;
    }

    public Status getStatus() {
        return status;
    }
}
