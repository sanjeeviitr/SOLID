package org.example.SRP;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UserRepository {
    Set<User> users;

    public UserRepository(){
        this.users = new HashSet<>();
    }

    public void saveUser(User a){
        users.add(a);
    }


}
