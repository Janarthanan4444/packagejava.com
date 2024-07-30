package com.internship;

public class RemovefromDuplicateString 
{
	public static void main(String[] args) {
		String str="application";
		char ch[]=str.toCharArray();
		String str1="";
		for(int i=0;i<ch.length;i++)
		{
			boolean found= false;
			for(int j=i+1;j<str.length();j++)
			{
				
				if(ch[i]==str1.charAt(j))
				{
					found = true;
					break;
					
				}
			}
				if(!found)
				{
					str1=str1+ch[i];
				}
						
			}
		
		System.out.println(str1);
		
	}
	
}


