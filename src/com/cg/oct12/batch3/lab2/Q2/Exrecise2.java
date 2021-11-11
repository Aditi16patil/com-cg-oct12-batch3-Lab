package com.cg.oct12.batch3.lab2.Q2;

import java.util.Arrays;

public class Exrecise2 {
	public String[] sortStrings(String[] arr)
    {  	Arrays.sort(arr);
        
    return arr;
    }
	
	public static void main(String[] args)
	{   String[] arr= {"ORANGE","BananA","Kiwi","AppLE","GrapES","PINEapple"};
	 Exrecise2 ref=new  Exrecise2 ();
	String[] sorted=ref.sortStrings(arr);
	for(int i=0;i<sorted.length;i++)
	{
		System.out.print(sorted[i]+" ");
	    
	}
	System.out.println();
	for(int i=(sorted.length/2)+1;i<sorted.length;i++)
	{
		System.out.print(sorted[i].toUpperCase()+" ");
	}
	}



}
