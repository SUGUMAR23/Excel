package com.java;

import java.util.Scanner;

public class methodNotPassingTheParameterButReturingTheValue {

	public static void main(String[] args) {
		int result = operation();
		System.out.println(result);

	}
	public static int operation()
	{
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		char z = sc.next().charAt(0);
		
		int sum = x+y+z;
		return sum;
	}

}
