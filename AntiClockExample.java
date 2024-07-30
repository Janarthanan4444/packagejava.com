package com.internship;

public class AntiClockExample {

	static String leftrotate(String str, int index) {
		String ans = str.substring(index) + str.substring(0, index);
		return ans;
	}

	static String rightrotate(String str, int index) {
		return leftrotate(str, str.length() - index);
	}

	public static void main(String args[]) {
		String str1 = "application";
		System.out.println("clock wise\t" + leftrotate(str1, 2));

		String str2 = "apple";
		System.out.println("anti clock wise\t" + rightrotate(str2, 2));

	}

}
