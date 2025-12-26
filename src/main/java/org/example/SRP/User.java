package org.example.SRP;

public class User {

    public String name;
    public String id;
    public String email;

    public User(String name, String id, String email){
        this.name=name;
        this.id = id;
        this.email = email;
    }

    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }
}
