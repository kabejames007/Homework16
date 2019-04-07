package edu.dmacc.codedsm.hw16;

public class Message implements TaskAssigner {

    @Override
    public void assignTask(Task task, Integer priority) {
        System.out.println("Message");

    }
}

