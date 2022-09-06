package com.Comparator_AND_Comparable;

import java.util.Comparator;

public class EmpName_Comparator implements Comparator<Employee> {
	
	@Override
	public int compare(Employee emp1, Employee emp2) 
	{
		int compareTo = emp1.name.compareTo(emp2.name);
	
		return compareTo>0?1: compareTo<0?-1: 0;
	}	
}
