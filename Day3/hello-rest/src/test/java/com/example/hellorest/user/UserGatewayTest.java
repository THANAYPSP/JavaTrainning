package com.example.hellorest.user;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class UserGatewayTest {
    @Autowired
    private UserGateway userGateway;

    @Test
    public void tryToCallAPI() {
        Users users = userGateway.getAllUsers();
        assertEquals(10, users.getUsers().size());
    }


}