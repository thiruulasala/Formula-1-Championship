package com.Driver.Race;

public class Mechanic extends Driver
{

        String name;
        String address;
        int salary;


    public Mechanic(String n, String add, int sal) {
        name = n;
        address = add;
        salary = sal;
    }

    public String getName() { return name; }

    public String getAddress() { return address; }

    public int getSalary() { return salary; }
}


