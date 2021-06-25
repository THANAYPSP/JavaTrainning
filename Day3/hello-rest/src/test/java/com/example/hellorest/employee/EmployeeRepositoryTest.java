package com.example.hellorest.employee;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class EmployeeRepositoryTest {

    @Autowired
    private EmployeeRepository repository;

    @Test
    public  void  foundWithID1(){
        Employee data = new Employee(1,"Thana from DB", "Yok from DB");
        repository.save(data);

        Employee employee1 = repository.getById(1);
        assertEquals(1,employee1.getId());
        assertEquals("Thana from DB", employee1.getFirstName());
        assertEquals("Yok from DB", employee1.getLastName());
    }



}