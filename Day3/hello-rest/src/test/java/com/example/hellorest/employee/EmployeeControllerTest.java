package com.example.hellorest.employee;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class EmployeeControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void callApiWithPathVariable() {
        EmployeeResponese expected = new EmployeeResponese(123, "Thana", "Yok");
        EmployeeResponese response
                = restTemplate.getForObject("/employee/123", EmployeeResponese.class);
        assertEquals(123, response.getId());
        assertEquals("Thana5", response.getFname());
        assertEquals("Yok", response.getLname());
        assertEquals(expected,response);
    }

    @Test
    public void callApiWithREquestParameter() {
        EmployeeResponese response
                = restTemplate.getForObject("/employee?id=999", EmployeeResponese.class);
        assertEquals(999, response.getId());
        assertEquals("Thana2", response.getFname());
        assertEquals("Yok2", response.getLname());
    }
}
