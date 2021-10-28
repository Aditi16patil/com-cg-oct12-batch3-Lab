package com.cg.oct12.batch3.lab1.Q1;

public class Exercise_1 {
	
		//sum of the cubes of the digits of an n digit number


			public static void main(String[] args) {
				// TODO Auto-generated method stub
				int n=675;
				int sum=0;
			
				while(n!=0)
				{   int power=3;
					int digit=n%10;
					 
					    n=n/10;
					   sum=sum+digit;
					
					
				}
				System.out.println(sum);

			}

		}

