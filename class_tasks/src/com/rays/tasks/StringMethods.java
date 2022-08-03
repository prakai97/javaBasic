package com.rays.tasks;

public class StringMethods {
	public static void main(String[] args) {
		String[] str = { "hello....!!", "how", "are", "you", "how" };
		String s = "Hello World...";

		System.out.println("total length =" + s.length());
		System.out.println("char at index 2 =" + s.charAt(2));
		System.out.println("indexof o= " + s.indexOf('o'));
		System.out.println("first index of l= " + s.indexOf('l'));
		System.out.println("last index of l= " + s.lastIndexOf('l'));
		System.out.println("lowercase = "+s.toLowerCase());
		System.out.println("uppercase = "+s.toUpperCase());
		System.out.println("starts With he =" + s.startsWith("He"));
		System.out.println("ends with ld =" + s.endsWith("ld"));
		System.out.println("Substring = "+s.substring(3));
		
		System.out.println("replace= " + s.replace('l', 'p'));

		System.out.print("replaceAll ------------");
		for (String st : str) {

			System.out.print(st.replaceAll("how", "hey how")+" ");

		}
	}

}
