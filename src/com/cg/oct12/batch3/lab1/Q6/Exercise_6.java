package com.cg.oct12.batch3.lab1.Q6;

import java.util.Scanner;
public class Exercise_6 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n= sc.nextInt();
		
		int diff=calculateDiffrence (n);
		
		
		System.out.println("diffrence "+ diff);
		
		
		
	}
	
	 public static int calculateDiffrence (int n)
	 {
		 int sqsum = 0;
		 int sumsq = 0;
		 for(int i=1 ; i <= n ; i++)
		 {
				sqsum = sqsum + (i*i);
				sumsq = sumsq + i;
			
		}
		  
		  
		  int diff =  (sumsq * sumsq) -sqsum ;
			
					
			return diff;
	 }
}
