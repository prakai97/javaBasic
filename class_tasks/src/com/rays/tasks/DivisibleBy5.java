package com.rays.tasks;

public class DivisibleBy5 {

	public static void main(String[] args) {
		
		int i=100;
		System.out.println("num divisible by 5 b/w 100-200");
		while(i<201)
		{
			if(i%5==0)
			System.out.println(i);
			i++;
		}
	}
}
