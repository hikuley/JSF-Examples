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

    private static final ArrayList<Employee> empmloyess = new ArrayList<Employee>(
            Arrays.asList(
                    new Employee("Halil İbrahim", "25", 25, 2500),
                    new Employee("Halil İbrahim", "25", 25, 2500),
                    new Employee("Halil İbrahim", "25", 25, 2500),
                    new Employee("Halil İbrahim", "25", 25, 2500),
                    new Employee("Halil İbrahim", "25", 25, 2500),
                    new Employee("Halil İbrahim", "25", 25, 2500),
                    new Employee("Halil İbrahim", "25", 25, 2500),
                    new Employee("Halil İbrahim", "25", 25, 2500)
            )
    );


    public ArrayList<Employee> getEmployees() {
        return empmloyess;
    }

}
