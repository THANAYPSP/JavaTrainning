package com.example.hellorest.employee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {


    @GetMapping("/employee/{id}")
    public EmployeeResponese getEmployeeByID(@PathVariable int id) {
        return new EmployeeResponese(id, "Thana", "Na");
    }

}
