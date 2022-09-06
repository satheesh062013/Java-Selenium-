package com.Comparator_AND_Comparable;

import java.util.ArrayList;
import java.util.Arrays;

public class Employee {
	
 	    public int id;
	    public String name;
	    public int salary;

	    public Employee(int id, String name, int salary) 
	    {
	        this.id = id;
	        this.name = name;
	        this.salary = salary;
	    }
	       
	    public static void main(String[] args) 
	    {
	    	EmpName_Comparator empNameComparator = new EmpName_Comparator();
	    	EmpSalary_Comparator empSalaryComparator = new EmpSalary_Comparator();
	    	EmpID_Comparator empIdComparator = new EmpID_Comparator();
	    	Employee emp1 = new Employee(1,"XYZ",100);
	    	Employee emp2 = new Employee(3,"Satheeshkumar",50);
	    	Employee emp3 = new Employee(2,"ABC",150);
	    	Employee [] emp = {emp1,emp2,emp3};   
	    	
	    	System.out.println("Sorted by EmployeeName: ");
	    	Arrays.sort(emp, empNameComparator);  	
	    	for (int i = 0; i < emp.length; i++) {
				System.out.println(emp[i]);
			} 	
	    	
	    	System.out.println("Sorted by EmployeeSalary: ");
	    	Arrays.sort(emp, empSalaryComparator);    	
	    	for (int i = 0; i < emp.length; i++) {
				System.out.println(emp[i]);
			} 
	    	
	    	System.out.println("Sorted by EmployeeId: ");
	    	Arrays.sort(emp, empIdComparator);    	
	    	for (int i = 0; i < emp.length; i++) {
				System.out.println(emp[i]);
			} 
		} 
	  
	    @Override
	    public String toString() {
	   	    	
	      return this.id+"\t"+this.name+"\t"+this.salary;
	    }
}
