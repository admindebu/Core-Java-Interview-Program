package com.youtube.techtalk.interview;

import java.util.Arrays;

public class StringAnagram {
	
	public static boolean isAnagram(String one, String two){
		
		String s1 = one.replaceAll("\\s+", "");
		String s2 =  two.replaceAll("\\s+", "");
		
		boolean status = true;
		if(s1.length() !=  s2.length())
			status = false;
		else 
		{
			char[]  s1Arr =  s1.toCharArray();
			char[] s2Arr = s2.toCharArray();
			
			Arrays.sort(s1Arr);
			Arrays.sort(s2Arr);
			
			status = Arrays.equals(s1Arr, s2Arr);
		}
			
		
		return status;
	}

	public static void main(String[] args) {
		
		String one = "Hello";
		String two = "lolHe";
		
		System.out.println(StringAnagram.isAnagram(one, two));
		
	}
}
