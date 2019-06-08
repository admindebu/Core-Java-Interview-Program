package com.youtube.techtalk;

//Ex -Give String : abcdabxsabc  | Finder String : abc
// O/P -> 2


public class StringCountInGivenStringWithOutSpace {

    
    public static int stringFirnder(String actual , String word){
        
        
        int len1 = actual.length();
        int len2 = word.length();
        
        int count = 0;
        
        for(int i = 0 ; i < len1 - len2 + 1 ; i ++){
            
            String temp = actual.substring(i,i+len2);
            
            System.out.println("Value " + temp);
            
            if(temp.equalsIgnoreCase(word))
            count++;
            
            
        }
        
        
        
        return count;
    }

     public static void main(String []args){
        System.out.println("Result is : " + StringCountInGivenStringWithOutSpace.stringFirnder("abcdabxsabc","abc"));
     }
}