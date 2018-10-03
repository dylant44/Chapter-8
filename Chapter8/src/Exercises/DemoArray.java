package Exercises;

public class DemoArray 
{

	public static void main(String[] args) 
	{
	double[] salaries = {6.25, 6.55, 10.25, 16.85};
	double total = 0;
	
	
	
	
	for(int i = 0; i < salaries.length; i = i + 1)
	{
		System.out.println(salaries[i]);
		total = total + salaries[i];
	}
	
	System.out.println("Total: " + total);
	
	}

}
