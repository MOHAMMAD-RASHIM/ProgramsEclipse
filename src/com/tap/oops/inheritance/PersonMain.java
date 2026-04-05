package com.tap.oops.inheritance;
import java.util.*;

//Base class
class Person {
 private String name;
 private int age;

 // Getters and Setters
 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 public int getAge() {
     return age;
 }

 public void setAge(int age) {
     this.age = age;
 }

 // Method to override
 public String getDetails() {
     return "Person Details: Name: " + name + ", Age: " + age;
 }
}

//Subclass Employee
class Employee extends Person {
 private String employeeID;

 public String getEmployeeID() {
     return employeeID;
 }

 public void setEmployeeID(String employeeID) {
     this.employeeID = employeeID;
 }

 @Override
 public String getDetails() {
     return "Employee Details: Name: " + getName() +
            ", Age: " + getAge() +
            ", Employee ID: " + employeeID;
 }
}

//Subclass Manager
class Manager extends Employee {
 private String department;

 public String getDepartment() {
     return department;
 }

 public void setDepartment(String department) {
     this.department = department;
 }

 @Override
 public String getDetails() {
     return "Manager Details: Name: " + getName() +
            ", Age: " + getAge() +
            ", Employee ID: " + getEmployeeID() +
            ", Department: " + department;
 }
}

//Main class
public class PersonMain {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     String[] data = sc.nextLine().trim().split(",");

     Manager m = new Manager();
     m.setName(data[0].trim());
     m.setAge(Integer.parseInt(data[1].trim()));
     m.setEmployeeID(data[2].trim());
     m.setDepartment(data[3].trim());

     System.out.println(m.getDetails());

     sc.close();
 }
}