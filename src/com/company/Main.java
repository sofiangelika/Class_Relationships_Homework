package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        Employee sarah = new Employee("Sarah");
        HiredContractor joey = new HiredContractor("Joey");
        LinkedList<Worker> workers1 = new LinkedList<>();
        workers1.add(sarah);
        workers1.add(joey);

        Employee micheal = new Employee("Micheal");
        HiredContractor annie = new HiredContractor("Annie");
        LinkedList<Worker> workers2 = new LinkedList<>();
        workers2.add(micheal);
        workers2.add(annie);

        Task task1 = new Task("Staple documents", workers1);

        Task task2 = new Task("Organize storage room", workers2);

        Project project = new Project(4);
        project.addTasks(task1);
        project.addTasks(task2);

        System.out.println("Project identifier: " + project.getIdentifier());
        for (Task t : project.tasks) {
            System.out.println("Task: " + t);
            System.out.println("Workers: " + t.workers);
            System.out.println();
        }

    }
}

class Project {
    int identifier;
    public LinkedList<Task> tasks;

    Project(int identifier) {
        this.identifier = identifier;
        tasks = new LinkedList<>();
    }

    public void addTasks(Task t) {
        tasks.add(t);
    }

    public int getIdentifier() {
        return identifier;
    }

}

class Task {
    public String taskName;
    public LinkedList<Worker> workers;

    public Task(String taskName, LinkedList<Worker> workers) {
        this.taskName = taskName;
        this.workers = workers;
    }

    public String toString() {
        return taskName;
    }

}

class Worker {
    String workerName;

    Worker(String workerName) {
        this.workerName = workerName;
    }

    public String toString() {
        return workerName;
    }

}

class Employee extends Worker {
    Employee(String workerName) {
        super(workerName);
    }
}

class HiredContractor extends Worker {
    HiredContractor(String workerName) {
        super(workerName);
    }
}