package Utility;

import org.testng.annotations.Test;

public class BasicCalculator {
	
	@Test(priority = 1)
	public void sum()
	{
		int a=5;
		int b=10;
		int sum=a+b;
	//	System.out.println("a = " + a + "\nb = " + b);
		System.out.println("Sum = " + sum);	
	}	
	
	@Test(priority = 2)
	public void multiplication()
	{
		int a=5;
		int b=10;
		int result=a*b;
	//	System.out.println("a = " + a + "\nb = " + b);
		System.out.println("Multiplication = " + result);	
	}

}
