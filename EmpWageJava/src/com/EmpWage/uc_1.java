package com.EmpWage;

public class UC_1 
{
	public static final int Is_Part_Time = 1;
    public static final int Is_Full_Time = 2;
    public static final int Emp_Rate_Per_Hour = 20;
    public static final int Num_Of_Working_Days = 2;
   
	 public static void main(String[] args)
 {
		    int empHour = 0;
		    int empwage = 0;
		    int totalEmpWages = 0;
		    for(int day = 0;day < Num_Of_Working_Days;day++) {
		        int empcheck =(int) Math.floor(Math.random()*10)%3;
		        switch (empcheck)
		        {
		            case Is_Part_Time:
		                empHour = 4;
		                break;
		            case Is_Full_Time:
		                empHour = 8;
		                break;
		            default:
		                empHour = 0;
		                break;
		        }
		        empwage= empHour * Emp_Rate_Per_Hour;
		        totalEmpWages += empwage;
		        System.out.println("  Emp wages :" + empwage);
		    }

		   
		    System.out.println(" total Emp Wage : " + totalEmpWages);



 }
}
