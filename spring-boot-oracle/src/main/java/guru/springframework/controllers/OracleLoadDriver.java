package guru.springframework.controllers;

import java.sql.*;
import java.util.*;
public class OracleLoadDriver {
    public static void main(String [] args) {
        Connection con = null;
        try {
            System.out.println("Before loading OracleDriver:");
            listDrivers();
            Class.forName("oracle.jdbc.OracleDriver") ;
            System.out.println("After loading OracleDriver:");
            listDrivers();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void listDrivers() {
        Enumeration driverList = DriverManager.getDrivers();
        while (driverList.hasMoreElements()) {
            Driver driverClass = (Driver) driverList.nextElement();
            System.out.println("   "+driverClass.getClass().getName());
        }
    }
}