package edu.dmacc.codedsm.hw16;

public class Runner {

    public static Task task;
    public static Integer priority;

    public static void main(String[] args) {
        User assigner = new User("James","Kabera","5156391706");
        User assignee = new User("Ismael","Muhikira", "5156391707");
        Task task1 = new Task("Homework16",0,assigner,assignee);
        task = task1;
        priority = 1;
        processMessage(new Email());
        processMessage(new Phone());
        processMessage(new Person());
    }

    public static void processMessage(Message m){


        m.assignTask(task,priority);
    }



}
