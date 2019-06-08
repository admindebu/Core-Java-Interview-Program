package com.youtube.techtalk.interview;

import java.util.Scanner;

public class CheckPalidromeNumber {

	public static void main(String[] args) {

		System.out.println("Enter Number : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int temp = number;
		int remainder = 0, result = 0;

		while (number > 0) {
			remainder = number % 10;

			result = result * 10 + remainder;

			number = number / 10;

		}
		if (temp == result)
			System.out.println("Number is palindrome : " + result);
		else

			System.out.println("Number is NOT palindrome : " + result);

	}

}
