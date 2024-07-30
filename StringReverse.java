package com.internship;

import java.util.Scanner;

public class StringReverse 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the String");
		String str1 =scn.next();
		char ch;
		String str="";
		for(int i=str1.length()-1;i>=0;i--)
		{
			ch=str1.charAt(i);
			str=str+ch;
			}
		System.out.println("Reverse String:"+str);
		
	}

	
}

