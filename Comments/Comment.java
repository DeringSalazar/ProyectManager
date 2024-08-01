/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comments;

import User.Users;

/**
 *
 * @author pamel
 */
public class Comment {
    private int id;
    private Users User;
    private String comments;

    public int getId() {
        return id;
    }

    public Users getUser() {
        return User;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Comment(int id, Users User, String comments) {
        this.id = id;
        this.User = User;
        this.comments = comments;
    }

    public Comment() {
        this(0, new Users(), "");
    }

    @Override
    public String toString() {
        return "Comment{" + "id=" + id + ", User=" + User + ", comments=" + comments + '}';
    }
    
   
}
