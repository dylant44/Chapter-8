package Exercises;

import java.util.Scanner;

public class ArrayMethodDemo 
{

	public static void main(String[] args) 
	{
		
		double[] arrayNums = new double[10];
		double total = 0;
		int i = 0;
		double quit = 0;
		
		Scanner input = new Scanner(System.in);
		
		while(quit != 999)
		{
			System.out.print("Enter a number >>");
			arrayNums[i] = input.nextDouble();
			
			total = total + arrayNums[i];
			i++;
			System.out.print("Another number? to quit 999");
			quit = input.nextDouble();
		}
		for(int j = 0; j < arrayNums.length; ++j) 
		{
			System.out.println(arrayNums[j]);
		}
		System.out.print("Sum: " + total);
		displayReverse(arrayNums); 
	}
	public static void displayReverse(double[] arrayNums) 
	{
		for(int k = 0; k > arrayNums.length; k--)
		{
			System.out.println(arrayNums[k]);
		}
	}

	
	
}
