package com.trimind.training.day05;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class EmployeeRunner
{
    public static void main(String[] args)
    {


        Employee emp1 = new Employee("Aru",1,20000);
        Employee emp2 = new Employee("niru",2,25000);
        Employee emp3 =new Employee("viru",3,27000);

        ArrayList<Employee> employees1= new ArrayList<Employee>();
        employees1.add(emp1);
        employees1.add(emp2);
        employees1.add(emp3);
        System.out.println(employees1.get(0));
        Employee emp4 =new Employee("viru",3,27000);
        System.out.println(employees1.contains(emp4));
        Set<Employee> employeeset = new HashSet<>();
        for (Employee employee: employees1){
            System.out.println(employee);
        }


        employeeset.add(emp1);
        employeeset.add(emp2);
        employeeset.add(emp3);
        System.out.println("print set data");
        for (Employee employee: employeeset){
           // System.out.println(employee);
            System.out.println(employee.toString());
        }

    }
}
