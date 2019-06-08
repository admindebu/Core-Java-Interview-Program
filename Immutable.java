package com.youtube.techtalk;

public final class Immutable {
	
	
	    final String name; 
	    final int regNo; 
	  
	    public Immutable(String name, int regNo) 
	    { 
	        this.name = name; 
	        this.regNo = regNo; 
	    } 
	    public String getName() 
	    { 
	        return name; 
	    } 
	    public int getRegNo() 
	    { 
	        return regNo; 
	    } 
	    
	    public static void main(String[] args) {
			
			Immutable im = new Immutable("Debu", 1);
			System.out.println(im.getName());
			
			Immutable im1 = new Immutable("New Debu", 1);
			System.out.println(im1.getName());

		}
	

}
