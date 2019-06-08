package com.youtube.techtalk;

public class EqualsMethodOperatorDiff {

	public static void main(String[] args) {
	
		String s1 = new String("Debu");
		
		String s3 = s1;
		
		String s2 = new String("Debu");
		
		String s4 = new String(s1);
		
		System.out.println(s1==s4);
		
		System.out.println(s1.equals(s4));

	}

}
