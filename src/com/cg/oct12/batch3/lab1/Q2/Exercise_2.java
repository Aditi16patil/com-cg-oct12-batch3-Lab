package com.cg.oct12.batch3.lab1.Q2;

import java.util.Scanner;

public class Exercise_2 {

	public static void main(String[] args) {
		String ss="y";
		while(ss.equals("y")) 
		{
		System.out.println("***********************MAIN MENU***************");
		System.out.println("press 1 to select red light");
		System.out.println("press 2 to select green light");
		System.out.println("press 3 to select yellow light");
		
		
		System.out.println("enter your choice");
		Scanner sc = new Scanner(System.in); // this line will help to take input from user on console

		int choice = sc.nextInt();

		Exercise_2 f=new Exercise_2();
		
		switch (choice) {
		case 1:
			f.redlight();
			break;
		case 2:
			f.greenlight();
			break;
		case 3:
			f.yellowlight();
			break;
		default:
			System.out.println("Invalid output");
		}
		System.out.println("do you want to continue press y/n");
		ss=sc.next();
		}	
	}
		void redlight() {
			System.out.println("Stop now");
		}

		void greenlight() {
			System.out.println("go now");
		}

		void yellowlight() {
			System.out.println("ready to go");
		}

}

