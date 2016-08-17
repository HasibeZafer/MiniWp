package com.hasibezafer.www.miniwp;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.Set;

public class MiniWpTest {

	private static final LocalDate LocalDate = null;
	private static final String String = null;
	private static final java.lang.String Set = null;

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		// 
		System.out.print("Please enter name: ");
		    String title = input.nextLine();  // local variable
		    System.out.print("Please enter value: " );
		    String body = input.nextLine();  // local variable
		    System.out.print("Please enter value: " );
		    String category = input.nextLine();  // local variable
		    System.out.print("Please enter value: " );
		    String comments = input.nextLine();  // local variable
		  
		    
		
		    
		    // use local variables in constructor call
			Page post = new Page(title,body,category); 
	}

}
