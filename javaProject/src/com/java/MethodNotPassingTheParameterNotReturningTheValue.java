package com.java;

import java.util.Scanner;

public class MethodNotPassingTheParameterNotReturningTheValue {

	public static void main(String[] args) {
		
		multiple();
	}
	
	public static void multiple()
	{
		Scanner sc = new Scanner(System.in);
		char a= sc.next().charAt(0);
		char b = sc.next().charAt(0);
		
		int multiple = a*b;
		System.out.println(multiple);
	}

}
