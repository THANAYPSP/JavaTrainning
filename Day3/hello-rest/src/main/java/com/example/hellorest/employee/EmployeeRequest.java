package com.example.hellorest.employee;

public class EmployeeRequest {
    private String fname;
    private String lname;

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public EmployeeRequest(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    public EmployeeRequest() {
    }
}
