package org.example.SRP;

import java.util.List;

public class UserReport {
    private UserRepository repo;

    public UserReport(UserRepository repo){
        this.repo = repo;
    }

    public void printUser(String id){
        for(User user : repo.users){
            if(user.getId().equals(id)){
                System.out.println("User name is : " + user.getName());
                System.out.println("User email is : " + user.getEmail());
                return;
            }
        }
    }
}
