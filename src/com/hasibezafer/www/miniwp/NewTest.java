package com.hasibezafer.www.miniwp;

import java.util.Scanner;

public class NewTest {
	

		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
					
			while (true) {
				Menu.printMenu();
				int select=input.nextInt();
				processInput(select);
			}


		}

		private static void processInput(int select) {
			Scanner input = new Scanner(System.in);	
			switch (select) {
			case 0:
				System.out.println("Exiting...");
				System.exit(0);
			case 1:
				Page pages2 = new Page();
				PageHelper.addPage(pages2);
				System.out.println("Created new page!");
				break;
			case 2:
				System.out.println("Select of post type:");
				System.out.println("Enter 1 for Video Post ||| Enter 2 for Text Post:");
				Page addPost = new Page();
				int type= input.nextInt();
				PageHelper.addPost(type);
				break;
			//case 3:
				
				//TodoHelper.remove(Integer.parseInt(param)-1);
				//break;
				
			//case 4:
				//try {
					//index = Integer.parseInt(param);
					//TodoHelper.mark(index-1 , false);
				//} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					//System.out.println("Error" + e.getMessage());
			//	}

			default:
				break;
			}

		}
	}
