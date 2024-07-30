package com.internship;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class VowelCount 
{
	public static void main(String[] args) {
		String str="application";
		LinkedHashMap<Character,Integer> map=new LinkedHashMap();
		map.put('a',0);
		map.put('e', 0);
		map.put('i', 0);
		map.put('o', 0);
		map.put('u', 0);
		for(int i=0;i<str.length();i++)
		{
			if(map.containsKey(str.charAt(i)))
			{
				int count=map.get(str.charAt(i));
				map.put(str.charAt(i),++count);
			}
		}
		System.out.println(map);
		
	}
	

}
