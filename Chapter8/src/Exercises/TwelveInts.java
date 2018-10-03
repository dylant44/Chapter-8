package Exercises;

public class TwelveInts 
{

	public static void main(String[] args) 
	{
		int numArrays[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		double total = 0;
		
		System.out.println("Print numbers first to last");
		for(int i = 0; i < numArrays.length; i++)
		{
			System.out.println("numbers in order " + numArrays[i]);
		}
		
		System.out.println("Print numbers last to first");
		for(int j = 11; j >= 0; j--) 
		{
			System.out.println("Numbers in reverse order " + numArrays[j]);	
		}
		
		for(int k = 0; k < numArrays.length; k = k + 1)
		{
			System.out.println(numArrays[k]);
			total = total + numArrays[k];
		}
		
		
		
	}

}
