package com.youtube.techtalk.interview;

public class SingleStringReverseSecondProcedure {


	public static void main(String[] args) {

		String str = "TechTalk";
		String result =""; 
		
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.println();
			result = result + str.charAt(i);

		}
		System.out.println(result);

	}
}
