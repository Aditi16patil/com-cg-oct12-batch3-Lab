package com.cg.oct12.batch3.lab1.Q7;

import java.util.Scanner;

public class Exercise_7 {

	public static void main(String[] args)
	{
		int num;
	       boolean b = false;

	       Scanner sc = new Scanner(System.in);
	       System.out.println("Enter a number : ");
	       num = sc.nextInt();

	       
	       int crDigit = num % 10;
	       num = num/10;

	       
	       while(num>0){
	       
	           if(crDigit <= num % 10){
	               b = true;
	               break;
	           }

	           crDigit = num % 10;
	           num = num/10;
	       }
	       
	       if(b){
	           System.out.println("Digits are not in increasing order");
	       }else{
	           System.out.println("Digits are in increasing order");
	       }
	    }



	}