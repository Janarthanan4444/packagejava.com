package com.internship;

public class PrimeNumber 
{
	public static void main(String[] args) {
		int num=9;
		int count=0,div=1;
		while(num<=num/2)
			{
			  if(num%div==0)
				  {
				  count++;
				  
				  }
			  div++;
			  
			}
		if(count==1)
		{
			System.out.println("Prime number"+num);
		}
		else
		{
			System.out.println("Not Prime number\t"+num);
		}
		
	}
	

}
