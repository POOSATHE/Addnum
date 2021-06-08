//Create a class with a method to find the difference between the sum of the 
//squares and the square of the sum of the first n natural numbers.
//
//Note: Complete this exercise on Doselect.           [DoSelect-Lab1_2]
//
//Method Name 						calculateDifference 
//Method Description 				Calculate the difference 
//Argument 							int n 
//Return Type 						int - Sum 
//Logic 				Find the difference between the sum of the squares of the first n natural numbers and the square of their sum. 
//For Example			 if n is 10,you have to find 
//						(1^2+2^2+3^2+….9^2+10^2)- 
//						(1+2+3+4+5…+9+10)^2 






package com.cg.demolabbook;

import java.util.Scanner;

public class CalculateDiff {
	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		//n=s.nextInt();
		
		int sum=0;
		System.out.println("sum of square");
		for(int i=1; i<=n; i++)
		{
			sum= sum + (i*i);//1+4+9+16+25=55
			
		}
		System.out.println(sum);
		System.out.println("Difference bet=");
		int diff= sum - (sum*sum);
		System.out.println(diff);
		
	}

}
