package com.example.hellorest.users;

import java.util.ArrayList;
import java.util.List;

public class UserResponse {

    private List<User> users = new ArrayList<>();

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
