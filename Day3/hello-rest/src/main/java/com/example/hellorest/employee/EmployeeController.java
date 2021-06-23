package com.example.hellorest.employee;

import com.example.hellorest.MyRandom.MyRandom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.Random;

@RestController
public class EmployeeController {

    @Autowired
    private MyRandom random;

    @Autowired
    private EmployeeRepository repository;

    @GetMapping("/employee/{id}")
    public EmployeeResponese getEmployeeByID(@PathVariable String id) {
        int _id = 0;
        try {
            _id = Integer.parseInt(id);
        } catch (Exception e) {
            System.out.println("Failed Please Check ID");
            return new EmployeeResponese(000, "-", "-");
        }
        //Workshop
         int number = random.nextInt(10);
        //  return new EmployeeResponese(_id,"Thana"+ number,"Yok");
        // Call repository
        Optional<Employee> result = repository.findById(_id);
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

    // employee?id=?
    @GetMapping("/employee")
    public EmployeeResponese getEmployeeByID2(@RequestParam String id) {

        int _id = 0;
        try {
            _id = Integer.parseInt(id);
        } catch (NumberFormatException e) {
            System.out.println("Failed Please Check ID");
            return new EmployeeResponese(000, "-", "-");
        }
        return new EmployeeResponese(_id, "Thana2", "Yok2");
    }

    @PostMapping("/employee")
    public EmployeeResponese createNewEmployee(@RequestBody EmployeeRequest request) {
        return new EmployeeResponese(999, request.getFname(), request.getLname());
    }
}
