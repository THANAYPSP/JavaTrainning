package com.example.hellorest.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class UserGateway {
    @Autowired
    private RestTemplate restTemplate;

    public  Users getAllUsers(){
        // TODO
        Users results = restTemplate.getForObject("https://jsonplaceholder.typicode.com/users", Users.class);
        return  null;
    }

}
