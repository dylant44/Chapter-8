package Exercises;

import java.util.Scanner;

public class ArrayMethodDemo 
{

	public static void main(String[] args) 
	{
		
		double[] arrayNums = new double[10];
		double userEntry;
		double total = 0;
		double avg = 0;
		int quit = 0;
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < arrayNums.length; i++) 
		{
			System.out.println("Enter a number >> ");
			arrayNums[i] = input.nextDouble();
		}

		System.out.println(arrayNums[10]);
		
			
		
	//displayNumbers();
	//displayReverse();
	//displatTotal;
	//displayHigherThanAverage();
	}

}
