package com.EmpWage;

public class UC_1 
{
	public static final int Is_Part_Time = 1;
    public static final int Is_Full_Time = 2;
    public static final int Emp_Rate_Per_Hour = 20;
    public static final int Num_Of_Working_Days = 20;
    public static final int Max_Hrs_In_Month = 100;
	 public static void main(String[] args)
 {
    int empHour = 0;
    int totalworkingdays = 0;
    int totalEmpHrs = 0;
    while (totalEmpHrs <= Max_Hrs_In_Month && totalworkingdays < Num_Of_Working_Days)
    {
        totalworkingdays++;
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
        totalEmpHrs += empHour;
        System.out.println("Days: " + totalworkingdays + "  Emp hrs :" + empHour);
    }

    int totalEmpWage = totalEmpHrs + Emp_Rate_Per_Hour;
    System.out.println("Emp Wage : " + totalEmpWage);


 }
}
