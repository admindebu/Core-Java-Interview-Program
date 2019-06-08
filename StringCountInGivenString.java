package com.youtube.techtalk;

//Ex - Given String : I love my country | finder String : love
// O/P -> 1

import java.io.*; 

public class StringCountInGivenString { 
  
static int countOccurences(String str, String word)  
{ 
    // split the string by spaces in a 
    String a[] = str.split("\\s+"); 
  
    // search for pattern in a 
    int count = 0; 
    for (int i = 0; i < a.length; i++)  
    { 

    if (word.equals(a[i])) 
        count++; 
    } 
  
    return count; 
} 
  

public static void main(String args[])  
{ 
    String str = "We need to learn computer science "; 
    String word = "computer"; 
    System.out.println(countOccurences(str, word)); 
} 
} 