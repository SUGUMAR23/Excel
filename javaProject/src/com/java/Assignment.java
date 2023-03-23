package com.java;

import java.util.Scanner;

public class Assignment 
{
	static int a;
	static int b;
	static int c;
	static int d;
	public static void main(String[] args) 
	{
		System.out.println("------------------------WELCOME------------------------");
		for (int j=0; j <=0; j++) 
		{
			if (0==j) 
			{
				for (int i = 0; i <=j; i++) 
				{
						Scanner sc=new Scanner(System.in);
						System.out.println("Press 1 to add 2 Number");
						System.out.println("Press 2 to add 3 Number");
						System.out.println("Press 3 to add 4 Number");
						System.out.println("-------------------------------------------------------");
						System.out.println("Enter your choice");
						int choice=sc.nextInt();
						
					if (choice==1) 
					{
						System.out.println("Enter the 2 number");
						int x=sc.nextInt();
						int y=sc.nextInt();
						int sum1 = m1(x, y);
						System.out.println("Sum is :"+sum1);
						System.out.println("Press 0 to continue");
						System.out.println("Press any other number to stop");
						int oo=sc.nextInt();
						int ss=sc.nextInt();
						
					}
					else if (choice==2) 
					{
						System.out.println("Enter the 3 number");
						int x=sc.nextInt();
						int y=sc.nextInt();
						int z=sc.nextInt();
						int sum1 = m1(x, y, z);
						System.out.println("Sum is :"+sum1);
						System.out.println("Press 0 to continue");
						System.out.println("Press any other number to stop");
					}
					else if (choice==3) 
					{
						System.out.println("Enter the 4 number");
						int x=sc.nextInt();
						int y=sc.nextInt();
						int z=sc.nextInt();
						int m=sc.nextInt();
						int sum1 = m1(x, y, z, m);
						System.out.println("Sum is :"+sum1);
						System.out.println("Press 0 to continue");
						System.out.println("Press any other number to stop");
					}
	
				}
			}
		else 
		{
				System.out.println("Thanks for using the program");
		}
	}
		
}
	
	public static int m1(int a, int b)
	{
		int sum=a+b;
		return sum;
	}
	public static int m1(int a, int b, int c)
	{
		int sum=a+b+c;
		return sum;
	}
	public static int m1(int a, int b, int c, int d)
	{
		int sum=a+b+c+d;
		return sum;
	}
	
}
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter 2 number choice");
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//		System.out.println("Sum is :"+(a+b));
//		System.out.println("Press 0 to continue");
//		System.out.println("Press any other number to stop");


