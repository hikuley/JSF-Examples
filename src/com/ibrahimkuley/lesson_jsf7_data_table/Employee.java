package com.ibrahimkuley.lesson_jsf7_data_table;

/**
 * Created by hikuley on 05.12.2014.
 */
public class Employee {

    private String name;
    private String deparmant;
    private int age;
    private double salary;
    private boolean canEdit;


    public Employee(String name, String deparmant, int age, double salary) {
        this.name = name;
        this.deparmant = deparmant;
        this.age = age;
        this.salary = salary;
        canEdit = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeparmant() {
        return deparmant;
    }

    public void setDeparmant(String deparmant) {
        this.deparmant = deparmant;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }
}
