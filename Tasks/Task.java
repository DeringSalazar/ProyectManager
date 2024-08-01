/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tasks;

import Comments.Comment;
import User.Users;
import java.util.ArrayList;

public class Task {
    private int id;
    private String description;
    private Boolean complete;
    private Users user;
    private ArrayList<Comment> comment;

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Boolean getComplete() {
        return complete;
    }

    public Users getUser() {
        return user;
    }

    public ArrayList<Comment> getComment() {
        return comment;
    }

    public void setComment(ArrayList<Comment> comment) {
        this.comment = comment;
    }
    
    public void addComments(Comment comment){
        this.addComments(comment);
    }

    public Task(int id, String description, Users user) {
        this.id = id;
        this.description = description;
        this.complete = false;
        this.user = user;
        this.comment = new ArrayList<>();
    }

    public Task() {
        this(0, "", new Users());
    }

    @Override
    public String toString() {
        return "Task{" + "id=" + id + ", description=" + description + ", complete=" + complete + ", user=" + user + ", comment=" + comment + '}';
    }
    
}
