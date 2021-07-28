package com.foguz;
//POJO or Model or Bean

public class Employee {
    int eid;
    String eName;
    int  eSalary;
    Address address;

    public Employee() {
    }

   //Constructor injection!!!!!!!!!!


    public Employee(Address address) {
        this.address = address;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getName() {
        return eName;
    }

    public void setName(String eName) {
        this.eName = eName;
    }

    public int geteSalary() {
        return eSalary;
    }

    public void seteSalary(int eSalary) {
        this.eSalary = eSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", eName='" + eName + '\'' +
                ", eSalary=" + eSalary +
                ", address=" + address +
                '}';
    }

    public void myInit(){
        System.out.println("---Object Initialized---");
    }
    public void myDestroy(){
        System.out.println("---Object Destroyed---");
    }
}
