package com.cg.oct12.batch3.lab3.Q4;

import java.util.Scanner;

public class Exercise4 {
	

    public static void main(String arr[]) 
    {
        Scanner sc=new Scanner(System.in);
        int min=9,max=0,number,digit,diff;
        System.out.println("Enter any Integer Number : ");
        number=sc.nextInt();
        while(number>0)
        {
            digit=number%10;
      //      if(min>digit)
     //       {
                min=digit;
     //}
       //     if(max<digit)
       //     {
       //         max=digit;
         //   }
            number=number/10;
        }
        diff=max-min;
       // System.out.println("Greatest  Digit : "+max);
      //  System.out.println("Smallest  Digit : "+min);
        System.out.println("Difference  Between consecutive numbers  Digit : "+diff);        
    }

}


