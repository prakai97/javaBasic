package com.rays.tasks;

public class ReverseArguments {

	public static void main(String[] args) {

		for (int i = args.length - 1; i >= 0; i--) {
			System.out.println(args[i]);
			for(int j=0; j<args[i].length(); j++) {
				System.out.println(args[i].charAt(j));
			}
		}

	}
}
