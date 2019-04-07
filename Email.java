package edu.dmacc.codedsm.hw16;

public class Email extends Message {
    @Override
    public void assignTask(Task task, Integer priority) {
        System.out.println(task.getToDo()+ " Task assigned through email by " + task.getAssigner().getFirstName() +" to " + task.getAssignee().getFirstName());
    }
}
