package com.rays.tasks;

public class ArgumentsPassing {

	public static void main(String[] args) {
		System.out.println(args.length);
		for (String s : args) {
			for(int i=0; i<s.length();i++) {
				System.out.println(s.charAt(i));
			
			}
			System.out.println();
		}

	}
}
