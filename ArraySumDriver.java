package RecursionLab;

import java.util.ArrayList;

/**
 * 
 * @author Paul Dacey
 *
 */
public class ArraySumDriver {
	private final static int ARRAY_SIZE = 6;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int index = 0;
		long test = 0;

		Integer[] myArray = new Integer[ARRAY_SIZE];
		
		myArray[index++] = 13;
		myArray[index++] = 5;
		myArray[index++] = 12;
		myArray[index++] = 6;
		
		int sum = sumOfArray(myArray, 3);
		System.out.println(sum);
		
		myArray[index++] = 7;
		myArray[index++] = 1;
		
		sum = sumOfArray(myArray, 5);
		System.out.println(sum);
		
		test = fibonacci(85);
		
		System.out.println("Fibonacci - " + test);
	}
	
	/**
	 * Recursive method for generating sum of values in array
	 * @param arr array of Integers
	 * @param num index of array to sum all previous index values (including num)
	 * @return sum of array values
	 */
	public static int sumOfArray(Integer[] arr, int num) 
	{
		if(num > 0)//General case
		{
			
			return arr[num] + sumOfArray(arr, num-1);//Reduced problem
		}
		else
		{
			return arr[num];//Base case (Ends when num is 0, since arr[-1] would throw an error)
		}

	}
	
	
	static Long[] fib = new Long[100000];
	static long result = 0;
	/**
	 * Recursively calculates the fibonacci of a number and stores in a table
	 * @param num number to calculate
	 * @return fibonacci of number
	 */
	public static long fibonacci(int num)
	{
		if(fib[num] != null)//Base case
		{
			return fib[num];
		}
		
		if(num == 1 || num == 2)
		{
			return 1;
		}
		else
		{
			result = fibonacci(num - 1) + fibonacci(num - 2);//Reduced problem
			fib[num] = result;
		}
		
		 
		return fib[num];//General solution
		
	}
	
	
	

}