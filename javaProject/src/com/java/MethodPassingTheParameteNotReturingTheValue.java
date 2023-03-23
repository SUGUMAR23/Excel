package com.java;

import java.util.Scanner;

public class MethodPassingTheParameteNotReturingTheValue {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		add(a,b);

	}
	
	public static void add(int a, int b)
	{
		int sum = a+b;
		System.out.println(sum);
		
	}

}
