package edu.dmacc.codedsm.hw16;

public class Person extends Message {
    @Override
    public void assignTask(Task task, Integer priority) {
        System.out.println(task.getToDo()+ " Task assigned by " + task.getAssigner().getFirstName() +" to " + task.getAssignee().getFirstName());
    }
}
