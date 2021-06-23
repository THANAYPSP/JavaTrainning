package com.example.hellorest.employee;

import java.util.Objects;

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

    public EmployeeResponese() {
    }

    public String getLname() {
        return lname;
    }

    public EmployeeResponese(int id, String fname, String lname) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeResponese that = (EmployeeResponese) o;
        return id == that.id &&
                Objects.equals(fname, that.fname) &&
                Objects.equals(lname, that.lname);
    }


}

