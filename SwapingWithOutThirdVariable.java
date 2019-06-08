package com.youtube.techtalk.interview;

import java.util.Scanner;

public class SwapingWithOutThirdVariable {

	public static void main(String[] args) {
		int a, b;

		System.out.println("Enter A and B");

		Scanner in = new Scanner(System.in);

		a = in.nextInt();

		b = in.nextInt();
		
		a = (a+b);
		b = (a-b);
		a = (a-b);
		System.out.println(" A is : " + a);
		System.out.println(" B is : " +  b);
		

	}
}
