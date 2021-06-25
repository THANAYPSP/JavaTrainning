package com.example.hellorest.employee;

import com.example.hellorest.MyRandom.MyRandom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.Random;

@RestController
public class EmployeeController {


    @Autowired
    private  EmployeeService employeeService;

    @GetMapping("/employee/{id}")
    public EmployeeResponese getEmployeeByID(@PathVariable String id) {
        int _id = 0;
        try {
            _id = Integer.parseInt(id);
        } catch (Exception e) {
            System.out.println("Failed Please Check ID");
            return new EmployeeResponese(000, "-", "-");
        }

        //Delegate to service
        EmployeeResponese employeeResponese = employeeService.process(_id);
        return  employeeResponese;


    }

    private void process(int id) {
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
