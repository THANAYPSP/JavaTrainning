package com.example.hellorest.employee;

import java.sql.*;

public class DemoSQL {
    public void workingWithDB() throws Exception {
        Class.forName("driver class of database");
        Connection conn = DriverManager.getConnection("");
        PreparedStatement prepStmt = conn.prepareStatement("SQL");
        ResultSet rs = prepStmt.executeQuery();
        while(rs.next()) {
            int id = rs.getInt("id");
        }
    }
}
