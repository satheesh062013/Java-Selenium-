package com.Comparator_AND_Comparable;

import java.util.Comparator;

public class EmpID_Comparator implements Comparator<Employee>{
		
		 @Override
		 public int compare(Employee emp1, Employee emp2) 
		 {
			return (emp1.id-emp2.id);
		}

}
