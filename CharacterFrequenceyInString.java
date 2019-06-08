package com.youtube.techtalk.interview;

import java.util.HashMap;
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class CharacterFrequenceyInString {
	public static void main(String[] args) {

		System.out.println("Enter String");

		Scanner in = new Scanner(System.in);

		String str = in.nextLine();
		
		char[] charArr = str.toCharArray();
		
		HashMap<Character, Integer>  map = new HashMap<Character, Integer>();
	    
		for(int i = 0 ;i < charArr.length ; i++){
			
			int val = map.getOrDefault(charArr[i], 0);
			map.put(charArr[i], val + 1);
			
		}
		
		map.forEach((k,v) -> { 
			if(k==' ')
			System.out.println("Key : Space" + " | Value  : " + v);
			else
		   System.out.println("Key : " +  k + " | Value  : " + v);
	});
		
	}
}
