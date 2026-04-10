package com.jadeus.TodoList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class TaskService{


    @Autowired
    private TaskRepository taskrepo; 

    public List<Task> getAllTask(){
        return taskrepo.findAll(); 
    }
    
    public Task addTask(Task  taskname){
        return taskrepo.save(taskname); 
    }
    public void deleteTask(Long id){
        taskrepo.deleteById(id);
    }



}