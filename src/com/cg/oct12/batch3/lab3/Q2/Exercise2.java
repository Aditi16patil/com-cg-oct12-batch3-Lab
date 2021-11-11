package com.cg.oct12.batch3.lab3.Q2;

public class Exercise2 {
	public static void main(String[] args) 
	{
		StringBuffer str = new StringBuffer("EARTH");
		System.out.println(str + "|" + Exercise2.GetImage(str));
	}

	public static StringBuffer GetImage(StringBuffer str)
	{
		return str.reverse();
	}

}
