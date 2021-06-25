package com.example.hellorest.employee;

import com.example.hellorest.MyRandom.MyRandom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;

@Service
public class EmployeeService {

    @Autowired
    private Random random;


    @Autowired
    private EmployeeRepository repository;

    public void setRandom(Random random) {
        this.random=random;
    }

    public EmployeeResponese process(int id) {
        //Workshop
        int number = random.nextInt(10);
        //  return new EmployeeResponese(_id,"Thana"+ number,"Yok");
        // Call repository
        Optional<Employee> result = repository.findById(id);
        if (result.isPresent()) {
            Employee employee = result.get();
            return new EmployeeResponese(
                    employee.getId(),
                    employee.getFirstName() + number,
                    employee.getLastName());
        }
        // Not found ?
        return new EmployeeResponese();
    }


    public void setRepository(EmployeeRepository repository) {
        this.repository = repository;
    }
}
