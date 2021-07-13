package com.Empwage;

public class EmpWageUC4 {
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME = 2;
	public static final int  Emp_Rate_per_Hour =20;
	public static final int Num_OF_WORKING_DAYS =22;
	public static void main(String[] args) {
		System.out.println("Emp Wage Check");
		// TODO Auto-generated method stub
		 //variables
		int empHrs=0;
		int empWage=0;
	   int 	totalEmpWage=0;
		//comptation
		
   
   for(int day =0;day<Num_OF_WORKING_DAYS;day++) {
	   int empCheck=0;  
   switch (empCheck){
    case  IS_PART_TIME:
            empHrs =8;
            break;
     case       IS_FULL_TIME:
   				empHrs=4;
   				break;
   	default:
   					empHrs =0;
    }
    empWage =empHrs*Emp_Rate_per_Hour;
    totalEmpWage += empWage;
    System.out.println("Emp Wage:" +empWage);

	}
   System.out.println("Total Emp Wage:" + totalEmpWage);
	}	

}
