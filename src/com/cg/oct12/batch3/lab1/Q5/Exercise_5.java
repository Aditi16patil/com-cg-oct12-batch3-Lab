package com.cg.oct12.batch3.lab1.Q5;

import java.util.Scanner;
public class Exercise_5
{

	public static void main (String[] a)
	{   
		System.out.println("Enter the values");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
		int sum = calculateSum (n);
		
		System.out.println("sum = "+sum);
		
	}
      public static int calculateSum (int n)
	{
		
		
		int sum = 0;	
		for(int i=0;i<=n;i++)
		{
			if(i%3==0 || i%5==0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}
}