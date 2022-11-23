package com.Driver.Race;

public class Driver {
    String name;
    String address;
    int salary;

    public Driver(String n, String add, int sal) {
        this.name = n;
       this.address = add;
       this.salary = sal;
    }

    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }

    public int getSalary() {
        return salary;
    }
}
