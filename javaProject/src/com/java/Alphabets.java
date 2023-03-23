package com.java;

import java.util.Scanner;

public class Alphabets {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		for (char i = 'A'; i <='Z'; i++) {
			
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		for (int i = 'A'; i <='Z'; i++) {
			
			System.out.print(i+" ");
		}

		for (char i = 'a'; i <='z'; i++) 
		{
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		for (int i = 'a'; i <='z'; i++) {
			System.out.print(i+" ");
		}
		sc.close();
	}

}
