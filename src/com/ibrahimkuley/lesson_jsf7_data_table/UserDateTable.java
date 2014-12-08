package com.ibrahimkuley.lesson_jsf7_data_table;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by hikuley on 05.12.2014.
 */

@ManagedBean(name = "userDateTable", eager = true)
@SessionScoped
public class UserDateTable {

    private String name;
    private int age;
    private String department;
    private double salary;
    private Employee employee;

    private static final ArrayList<Employee> empmloyess = new ArrayList<Employee>(
            Arrays.asList(
                    new Employee("Halil İbrahim", "IT Departman", 25, 2500),
                    new Employee("Halil İbrahim", "IT Departman", 25, 2500),
                    new Employee("Halil İbrahim", "IT Departman", 25, 2500),
                    new Employee("Halil İbrahim", "IT Departman", 25, 2500),
                    new Employee("Halil İbrahim", "IT Departman", 25, 2500),
                    new Employee("Halil İbrahim", "IT Departman", 25, 2500),
                    new Employee("Halil İbrahim", "IT Departman", 25, 2500),
                    new Employee("Halil İbrahim", "IT Departman", 25, 2500)
            )
    );

    public ArrayList<Employee> getEmployees() {
        return empmloyess;
    }

    public String addEmployee() {
        Employee employee = new Employee(name, department, age, salary);
        empmloyess.add(employee);
        return null;
    }

    public String deleteEmployee(Employee employee){
        System.out.println(123);
        return null;
    }

//    public String editEmployee(Employee employee) {
//        employee.setCanEdit(true);
//        return null;
//    }

    public String saveEmployee(){
        //set "canEdit" of all employees to false


        return null;
    }

    public String editEmployee() {

        return null;
    }

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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
