package com.Empwage;

public class EmpWageBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //constant
		   int IS_FULL_TIME = 1;
		            //comptation
		     double empCheck = Math.floor(Math.random() *10)%2;
		       if(empCheck == IS_FULL_TIME)
		         System.out.println("Emp is present");
		         else
		           System.out.println("Emp is absent");

	}

}
