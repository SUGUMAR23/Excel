package com.java;

import java.util.Scanner;

public class MethodPassingTheParameterReturingTheValue {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result = add(a,b);
		System.out.println(result);
	

	}
	
	public static int add(int a, int b)
	{
		int sum = a+b;
		return sum;
	}

}
