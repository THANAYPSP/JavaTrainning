package com.example.hellorest.employee;

import com.example.hellorest.MyRandom.MyRandom;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.when;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class EmployeeControllerMockTest {

    @Autowired
    private TestRestTemplate restTemplate;
    //MockBean การทำการจำลองในโลก Sring boot ทำงานร่วมกับ Mockito ได้
    @MockBean
    private MyRandom random;

    @MockBean
    private EmployeeRepository repository;

    @Test
    public void callApiWithPathVariableWithoutDatabase() {
        when(random.nextInt(10)).thenReturn(5);

        Employee mock = new Employee(123, "Mock fname","Mock Lname");
        when(repository.findById(123)).thenReturn(Optional.of(mock));
        
        //Testing
        EmployeeResponese expected = new EmployeeResponese(123, "Mock fname5", "Mock Lname");
        EmployeeResponese response
                = restTemplate.getForObject("/employee/123", EmployeeResponese.class);
        assertEquals(123, response.getId());
        assertEquals("Mock fname5", response.getFname());
        assertEquals("Mock Lname", response.getLname());
        assertEquals(expected,response);
    }

    @Test
    public void callApiWithPathVariableWithoutDatabaseNotFound() {
        when(random.nextInt(10)).thenReturn(5);

        Employee mock = new Employee(123, "Mock fname","Mock Lname");
        when(repository.findById(123)).thenReturn(Optional.empty());

        //Testing
        EmployeeResponese response
                = restTemplate.getForObject("/employee/123", EmployeeResponese.class);
        assertEquals(0, response.getId());
        assertNull(response.getFname());
        assertNull(response.getLname());
    }


}
