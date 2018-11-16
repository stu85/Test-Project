package com.test;

public class HelloWorld {
	
	public static void main(String args[]) {
		
		if (args.length == 0) {
			
			System.out.println("Hello there, no name?");
		}
		
		else {
			
			String name = args[0] ;
			
			System.out.println("Hello " + name);  
			
		}

	}

}
  