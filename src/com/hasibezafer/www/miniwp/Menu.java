package com.hasibezafer.www.miniwp;

public class Menu {

		public static void printMenu() {
			StringBuilder menu = new StringBuilder(50);
			
			
			menu.append("\n");
			menu.append("MENU\n");
			menu.append("=====\n");
			menu.append("(0) Exit\n");
			menu.append("(1) Add Page\n");
			menu.append("(2) Add Post\n");
			menu.append("(3) Add Comment \n");
			menu.append("(4) Show Pages\n");
			menu.append("(4) Show Posts \n");
	
			menu.append("\n");
			menu.append("Enter your command: ");
			
			System.out.println(menu.toString());
			
		
	}
	
		}
