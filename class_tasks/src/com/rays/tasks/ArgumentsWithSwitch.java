package com.rays.tasks;

public class ArgumentsWithSwitch {

	public static void main(String[] args) {
		
		int len =args.length;
		
		int a= Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int sum=a+b;
		System.out.println("Sum = "+sum);
		
		switch (len) {
		case 0:	
			System.out.println("no arguments");
			
			break;
		case 1 : 
			System.out.println("First string is : "+ args[0]);
			break;

		default:
			System.out.println("All strings are------");
			for (int i = 0; i < args.length; i++) {
				System.out.println(args[i]);
			}
			break;
		}
	}
}
