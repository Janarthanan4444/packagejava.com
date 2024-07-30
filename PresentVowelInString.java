package com.internship;

public class PresentVowelInString 
{
	public static void main(String[] args) {
		String str="APPLE";
		char ch;
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
		
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O'||ch=='U')
			{
				count++;
				
				
			}
			
			
	}
		if(count!=0)
		{
			System.out.println("given string present in vowel");
			
		}
		else
		{
			System.out.println("Not Present in  vowel in given string"+str);
		}
	}
}



