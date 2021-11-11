package com.cg.oct12.batch3.lab2.Q1;

import java.util.Scanner;

public class Exercise1 {


	public int secondLargest(int[] arr) 
	{
		int large = Integer.MIN_VALUE;
		int slarge = arr[0];
		for (int i = 0; i < arr.length; i++)
		{
			if (large < arr[i]) {
				slarge = large;
				large = arr[i];
			}
			else if (arr[i] > slarge && arr[i] != large)
			{
				slarge = arr[i];
			}
		}

		return slarge;
	}
    
	//Driver 
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter length: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
		}
		Exercise1 ref = new Exercise1();
		System.out.println("second largest num is: " + ref.secondLargest(arr));
		sc.close();
	}

}
