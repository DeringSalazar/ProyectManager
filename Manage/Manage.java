/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manage;

import Projects.Project;
import User.Users;
import java.util.ArrayList;
import java.util.Iterator;

public class Manage {
    private ArrayList<Project> listProject;
    private ArrayList<Users> listUser;
    
    public void agregarProject(Project project){
        listProject.add(project);
    }
    
    public void agregarUser(Users user){
        listUser.add(user);
    }
    
    public void eliminarProject(int id){
        Project EliminarProjects = null;
        for (Project projects : listProject) {
            if (projects.getId() == id) {
                EliminarProjects = projects;
                break;
            }
        }
        if (EliminarProjects != null) {
            listProject.remove(EliminarProjects);
            System.out.println("Producto eliminado Correctamente");
        } else {
            System.out.println("El producto con código " + id + " no existe");
        }
    }
    
    public ArrayList<Project> ListarProject(){
        Iterator<Project> iterator = listProject.iterator();
        Project temp;
        boolean swapped;
        do {
            swapped = false;
            iterator = listProject.iterator();
            Project current = iterator.next();
        while (iterator.hasNext()) {
            Project next = iterator.next();
                if (current.getId() > next.getId()) {
                    temp = current;
                    current = next;
                    next = temp;
                    swapped = true;
                }
            }
        } while (swapped);
        return listProject;
    }
}
