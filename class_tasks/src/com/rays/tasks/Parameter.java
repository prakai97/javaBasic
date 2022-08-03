package com.rays.tasks;

public class Parameter {
	public static void main(String[] args) {
		if (args.length==0) {
			System.out.println("parameter name required");
		}else {
			for (int i = 0; i < args.length; i++) {
				
				System.out.println("hello... "+args[i]);
			}
		}
	}

}
