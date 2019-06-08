package com.youtube.techtalk;

public class StringReverse {

	public static void main(String[] args) {

      String str = "My Name is Java";
      
      String arrStr[] = str.split("\\s+");
      StringBuffer finalStr = new StringBuffer();
      for(int i = arrStr.length -1 ; i>0  ;i--){
    	  
    	  finalStr.append(arrStr[i]).append(" ");
    	  
      }
    System.out.println(finalStr.toString());
      
    
	}

}
