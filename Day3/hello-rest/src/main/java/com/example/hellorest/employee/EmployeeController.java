package com.example.hellorest.employee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {


    @GetMapping("/employee")
    public EmployeeResponese getEmployeeByID(int id){
        return new EmployeeResponese(id,"Thana","Na");
    }

}
