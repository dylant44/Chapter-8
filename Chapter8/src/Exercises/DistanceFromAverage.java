package Exercises;

import java.util.Scanner;

public class DistanceFromAverage 
{

	public static void main(String[] args) 
	{
		
		double[] arrayNums = new double[20];
		double userEntry;
		double total = 0;
		double avg = 0;
		int i = 0;
		int quit = 0;
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter a number >> ");
		
			while(quit != 999) 
			{
				arrayNums[i] = input.nextDouble();
				total = total + arrayNums[i];
				System.out.println("Another number? 999 to quit ");
				quit = input.nextInt();
			}
		
		avg = total / arrayNums.length;
	
		
	}

}
