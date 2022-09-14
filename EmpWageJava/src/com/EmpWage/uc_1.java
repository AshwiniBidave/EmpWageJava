package com.EmpWage;

public class UC_1 
{
	 public static void main(String[] args)
 {
		 int Emp_Rate_per_hour = 20;
         int empHrs = 0;
         int empWage = 0;
         int Is_Full_Time = 1;
         
         double empcheck = Math.floor(Math.random()*10)%2;
         if (empcheck == Is_Full_Time)
         {
             empHrs = 8;
             System.out.println("Employee is Present");
         }
         else
         {

        	 System.out.println("Employee is Absent");
        	 

         }
         empWage = empHrs * Emp_Rate_per_hour;
         System.out.println("empwage is :" + empWage);

}
}
