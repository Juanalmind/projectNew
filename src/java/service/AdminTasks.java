/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entities.Tasks;
import java.util.List;

/**
 *
 * @author A685844
 */
public interface AdminTasks {
    
    public List<Tasks> findAllTasks();
    
    public Tasks updateTaskById_task(int id_task);
    
    public Tasks addTask(Tasks task);
}
