package com.youtube.techtalk.interview;

public class CheckPalindromeString {

	public static void main(String[] args) {

		String str = "AAA";

		String result = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.println();
			result = result + str.charAt(i);

		}
		if (str.equals(result))
			System.out.println("Palidrome");
		else
			System.out.println("Not Palindrome");

	}

}
