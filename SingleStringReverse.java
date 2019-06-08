package com.youtube.techtalk.interview;

public class SingleStringReverse {
	
	public static void main(String[] args) {
		
		String str ="Hello";
		char arr[] = str.toCharArray();
		char result[] = new char[arr.length];
		int j =0;
		for( int i = arr.length -1 ; i >= 0;i --){
			System.out.println();
			result[j] =arr[i];
			j++;

		}
		System.out.println(String.valueOf(result));
		
	}

}
