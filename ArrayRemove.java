package com.internship;

public class ArrayRemove 
{
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,1,2,3,4,5};
		int temp=-1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=temp)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]==arr[j])
					{
						arr[j]=temp;
					}
				}
				System.out.println(arr[i]);
			}
		}
	}

}
