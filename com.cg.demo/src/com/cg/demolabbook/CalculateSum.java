//lab1-	Q5-Create a class with a method which can calculate the sum of first n natural numbers which are divisible by 3 or 5.
//
//Note: Complete this exercise on Doselect.          [DoSelect-Lab1_1]
//
//Method Name 						calculateSum 
//Method Description 				Calculate Sum 
//Argument 							int n 
//Return Type 						int-sum 
//Logic 							Calculate the sum of first n natural numbers which are divisible by 3 or 5. 






package com.cg.demolabbook;

import java.util.Scanner;

public class CalculateSum {
	public static void main(String[] args) {
		
	
	//int n;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a number: ");
	
	n=s.nextInt();
	
	int sum=0;
	System.out.println("integer divisible by 3 & 5=");
	for(int i=1; i<=n; i++)
	{
		if(i%3==0 || i%5==0)
		sum=sum + i;
		
	}
	System.out.println(sum);//7= 3+6+5
	
	
	
	
	
	
	
}
}