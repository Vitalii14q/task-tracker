package org.example;

public class Task {

    public String name;
    public String info;
    public String status;
    public static long id;

    public Task (String name, String info, String status) {
        this.name = name;
        this.info = info;
        this.status = status;
        Task.id++;
    }

    public void getId () {
        System.out.println("Идентификационный номер задачи: " + id);
    }

    public String setName (String name) {
        return this.name;
    }

    public void getName () {
        System.out.println("Наименоване задачи: " + name);
    }

    public void getInfo () {
        System.out.println("Информация о задаче: ");
    }

    public String setStatus (String status) {
        return this.status;
    }
}
