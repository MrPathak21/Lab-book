package com.corejava.training.java8project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComaparatorDemo {
	
public static void main(String[] args) {
        
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(101,"raj",50000));
        empList.add(new Employee(102,"sam",60000));
        empList.add(new Employee(103,"rohit",30000));
        empList.add(new Employee(104,"sachin",40000));
        
        
        System.out.println("Sort by Name: ");
        
        Comparator<Employee> nameComparator = new Comparator<Employee>() {

 

            @Override
            public int compare(Employee o1, Employee o2) {                
                return o1.getName().compareTo(o2.getName());
            }
            
        };
        
        Collections.sort(empList, nameComparator);
        
        for(Employee e: empList) {
            System.out.println(e.getEmpno()+" "+e.getName()+" "+e.getSalary());
        }
        
        System.out.println("Sort by Salary: ");
        
        
        Comparator<Employee> salaryComparator = new Comparator<Employee>() {

 

            @Override
            public int compare(Employee o1, Employee o2) {
                
                return (int) (o1.getSalary() - o2.getSalary());
            }
            
        };
        
        Collections.sort(empList, salaryComparator);
        
        for(Employee e: empList) {
            System.out.println(e.getEmpno()+" "+e.getName()+" "+e.getSalary());
        }

 

    }

}
