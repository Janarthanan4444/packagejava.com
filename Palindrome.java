package com.internship;

public class Palindrome
{
	public static void main(String[] args) {
		String str="level";
		char ch;
		String str1="";
		for(int i=str.length()-1;i>=0;i--)
		{
			ch=str.charAt(i);
			str1=str1+ch;
		}
		if(str1.equals(str))
		{
			System.out.println("given string Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
		
	}

}
