/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Projects;

import Tasks.Task;
import java.util.ArrayList;

/**
 *
 * @author pamel
 */
public class Project {
    private int id;
    private String name;
    private ArrayList<Task>Task;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Task> getTask() {
        return Task;
    }
    
    public void addTasks(Task task){
        this.addTasks(task);
    }

    public Project(int id, String name) {
        this.id = id;
        this.name = name;
        this.Task = new ArrayList<>();
    }

    public Project() {
        this(0, "");
    }

    @Override
    public String toString() {
        return "Project{" + "id=" + id + ", name=" + name + ", Task=" + Task + '}';
    }
    
    
}
