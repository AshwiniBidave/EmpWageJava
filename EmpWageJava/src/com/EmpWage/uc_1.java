package com.EmpWage;

public class UC_1 
{
	 public static void main(String[] args)
 {
	int Is_Part_Time = 1;
	int Is_Full_Time = 2;
	int Emp_Rate_per_hour = 20;
    int empHrs = 0;
    int empWage = 0;
    
    
    double empcheck = Math.floor(Math.random()*10)%3;
    if (empcheck == Is_Part_Time)
    {
        empHrs = 4;
        
    }
    else if (empcheck == Is_Full_Time)
    {
        empHrs = 8;
        
    }
    else
    {
     empHrs=0;
   	 System.out.println("Employee is Absent");
   	 

    }
    empWage = empHrs * Emp_Rate_per_hour;
    System.out.println("empwage is :" + empWage);

}
}
