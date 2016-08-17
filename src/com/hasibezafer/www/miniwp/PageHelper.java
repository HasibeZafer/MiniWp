package com.hasibezafer.www.miniwp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class PageHelper {
	static Scanner input = new Scanner(System.in);
	
	private static List<Page> pages = new ArrayList<>();
	
	public static void addPage(Page pages2) {
	    System.out.print("Please enter title:" );
		String title = input.nextLine();  // local variable
	    System.out.print("Please enter body: " );
	    String body = input.nextLine();  // local variable
	    System.out.print("Please enter category: " );
	    String category = input.nextLine();  // local variable
	    pages2.setTitle(title);
	    pages2.setTitle(body);
	    pages2.setTitle(category);
	    pages.add(pages2);
		
	}
	
	public static void addPost(int type) {
		
		System.out.print("Please enter title:" );
		String title = input.nextLine();  // local variable
	    System.out.print("Please enter body: " );
	    String body = input.nextLine();  // local variable
	    System.out.print("Please enter category: " );
	    String category = input.nextLine();  // local variable
	    
	    
	    
		
	    switch(type){
	    case 1: 
	    	System.out.println("Please enter url");
	    	String url=input.nextLine();
	    	VideoPost video = new VideoPost(title ,body, category, url);
	    	System.out.println("Created VideoPost!");
	    	break;
	    case 2:
	    	
	    	TextPost text = new TextPost(title ,body, category);
	    	
	    
	    	System.out.println("Created TextPost!");
	    	break;
	    	
	    default:
			break;
	    	
	    }
	}
	
	public static void addComment(Page newComment) {
		//Listelenen postTitle içinden seçim yapacak. 
		//Userdan name, comment istenecek Enter Comment created.
		pages.add(newComment);
	}
	
	public static void showPages(Page allPages) {
		//Listelenen postTitle içinden seçim yapacak. 
		//Userdan name, comment istenecek Enter Comment created.
		pages.add(allPages);
	}
	
	public static void showPosts(Page allPosts) {
		//Listelenen postTitle içinden seçim yapacak. 
		//Userdan name, comment istenecek Enter Comment created.
		pages.add(allPosts);
	}
	
	public static Iterator<Page> getItereator(){
		return pages.iterator();
	
	}
	
	public static List<Page> getPage() {
		return pages;
	}
	
	
	

}
