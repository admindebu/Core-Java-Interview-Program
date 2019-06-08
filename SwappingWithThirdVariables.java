package com.youtube.techtalk.interview;

import java.util.Scanner;

public class SwappingWithThirdVariables {
	
	public static void main(String[] args) {
		int a, b , temp;

		System.out.println("Enter A and B");

		Scanner in = new Scanner(System.in);

		a = in.nextInt();

		b = in.nextInt();
		
		temp = a;
		a = b;
		b = temp;
		System.out.println(" A is : " + a);
		System.out.println(" B is : " +  b);
		

	}

}
