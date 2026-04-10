package com.jadeus.TodoList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
 


@RestController
@RequestMapping("/tasks")
public class TaskController {
    
    @Autowired
    private TaskService taskservice; 

    @GetMapping
    public List<Task> getAllTask(){
        return taskservice.getAllTask(); 
    }

    @PostMapping
    public Task setTasks(@RequestBody Task task){
        return taskservice.addTask(task); 
    }
    
    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id){
         taskservice.deleteTask(id);
    }
    


}
