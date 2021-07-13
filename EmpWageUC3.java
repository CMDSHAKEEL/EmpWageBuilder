package com.Empwage;

public class EmpWageUC3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Emp Wage Bulider UC2");
		int IS_PART_TIME=1;
		int IS_FULL_TIME = 2;
		int  Emp_Rate_per_Hour =20;
		
        //variables
		int empHrs=0;
		int empWage=0;
		//comptation
		
   double empCheck = Math.floor(Math.random() *10)%3;
      if(empCheck == IS_FULL_TIME)
        empHrs=8;
      else if(empCheck == IS_FULL_TIME)
    	  empHrs =4;
       else
    	   empHrs =0;
      empWage =empHrs*Emp_Rate_per_Hour;
          System.out.println("Emp Wage:" +empWage);

	}

}
