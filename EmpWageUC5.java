package com.Empwage;

public class EmpWageUC5 {
	   public static final int IS_PART_TIME=1;
	   public static final int IS_FULL_TIME = 2;
	   public static final int  Emp_Rate_per_Hour =20;
	   public static final int Num_OF_WORKING_DAYS =22;
	   public static final int MAX_HRS_IN_MONTH =10;
	public static void main(String[] args) {
		System.out.println("----------Welcome to EMP Wage----------");
		 //variable
		int empHrs =0;
		int totalEmphrs =0;
		int totalWorkingDays =0;
		//computation
	while(totalEmphrs<=MAX_HRS_IN_MONTH) {
			totalWorkingDays++;
			int empCheck =(int)Math.floor(Math.random()*10)%3;
			switch(empCheck) {
			
			case 1: IS_PART_TIME:
				     empHrs = 4;
			break;
			
			case 2: IS_FULL_TIME:
				      empHrs = 8;
			break;
			
			default:
				    empHrs=0;
			}
			  totalEmphrs += empHrs;
			  System.out.println("Day#: "+totalWorkingDays +"Emp hrs:"+empHrs);
			
			}
			int totalEmpWage = totalEmphrs *Emp_Rate_per_Hour;
			System.out.println("Total EmpWage:-"+totalEmpWage);
			
		}

	}


