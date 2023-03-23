package com.java;

import java.util.Scanner;

public class SwitchStatement 
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 
		//int input = sc.nextInt();
		
		/*switch (input)
		{
			
			case 1: System.out.println("First Statement");
			        break;
					
			case 2: System.out.println("Second Statement");
					break;
					
			default : System.out.println("Out of the Range");
					break;*/
		
		
		int day = sc.nextInt();
		
		switch (day)
		{
			
		case 1: System.out.println("Sunday");
				break;
				
		case 2: System.out.println("Monday");
				break;
				
		case 3: System.out.println("Tuesday");
				break;
				
		case 4: System.out.println("Wednesday");
				break;
				
		case 5: System.out.println("Thursday");
				break;
				
		case 6: System.out.println("Friday");
				break;
				
		case 7: System.out.println("Saturday");
				break;
		
		}
	}

}