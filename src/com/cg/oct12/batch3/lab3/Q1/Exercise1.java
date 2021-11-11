package com.cg.oct12.batch3.lab3.Q1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercise1 {


	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in); 
        int temp,sum=0;
        String str=sc.nextLine();
        sc.close();
        StringTokenizer ref=new StringTokenizer(str," ");
        while(ref.hasMoreTokens())
        {
        	temp=Integer.parseInt(ref.nextToken());
        	sum+= temp;        	
        }
        System.out.println("sum: "+sum);
	}
}
