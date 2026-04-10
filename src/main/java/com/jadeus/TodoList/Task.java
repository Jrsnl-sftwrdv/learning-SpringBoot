package com.jadeus.TodoList;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;

@Entity
public class Task {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 

    private String tasks; 
    private boolean isCompleted; 

    public Task(Long id, String taskname, boolean status) {
        this.id = id; 
        this.tasks = taskname; 
        this.isCompleted = status; 
    }

    public Task(){}


    public Long getId(){
        return id; 
    }

    public void setTask(String task){
        this.tasks = task; 
    }

    public String getTasks(){
        return tasks; 
    }

    public void setCompleted(boolean isCompleted){
        this.isCompleted =  isCompleted;
    }
    public boolean getCompleted(){
        return isCompleted; 
    }


}
