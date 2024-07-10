package com.java;

public class condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age= 3;
		if (age>2 && age<=5) {
		System.out.println( "Age comes under Toddler");
	}
		else if(age>5 && age<=12)
		System.out.println("Age comes under Kid");
		else
			System.out.println("Age comes under Adult");
}
}