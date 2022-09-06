package com.Comparator_AND_Comparable;

import java.util.Comparator;

public class EmpSalary_Comparator implements Comparator<Employee>{
		
			 @Override
			 public int compare(Employee emp1, Employee emp2) 
			 {
				return (emp1.salary-emp2.salary);
			}
		
	/*	Comparator<Employee> salaryComparator = new Comparator<Employee>()
		{
			 @Override
			 public int compare(Employee emp1, Employee emp2) 
			 {
				return (emp1.salary-emp2.salary);
			}
		};*/
		
}
