package com.java;

public class PrintNumberWithoutUsingNumericValue 
{
	public static void main(String[] args) 
	{
		int sum = 0, num = 0;
		System.out.print("1"+" ");
		for (char i = 'A'/'A'; i <= 'c';i++) 
		{
			sum=sum+i;
			num=sum/sum+i;
			System.out.print(num+" ");
			
		}
	}
}
