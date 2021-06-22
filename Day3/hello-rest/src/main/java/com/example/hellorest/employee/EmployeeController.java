package com.example.hellorest.employee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/employee/{id}")
    public EmployeeResponese getEmployeeByID(@PathVariable String id) {
        int _id = 0;
        try {
            _id = Integer.parseInt(id);
        }
        catch(Exception e){
            System.out.println("Failed Please Check ID");
            return new EmployeeResponese(000,"-","-");

        }
        return new EmployeeResponese(_id,"Thana","Yok");

    }
    // employee?id=?
    @GetMapping("/employee")
    public EmployeeResponese getEmployeeByID2(@RequestParam String id) {

        int _id = 0;
        try {
            _id = Integer.parseInt(id);
        }catch (NumberFormatException e) {
            // ERROR => TODO ?
        }
        return new EmployeeResponese(_id, "Thana2", "Yok2");
    }


}
