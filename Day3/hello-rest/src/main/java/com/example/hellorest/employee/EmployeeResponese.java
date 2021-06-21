package com.example.hellorest.employee;

public class EmployeeResponese {
    private int id;
    private String fname;
    private String lname;

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public EmployeeResponese(int id, String fname, String lname) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
    }
}

