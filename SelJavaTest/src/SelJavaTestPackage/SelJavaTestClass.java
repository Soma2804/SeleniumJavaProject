package SelJavaTestPackage;
import java.util.Arrays;

public class SelJavaTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("started Java Basics");
		// Add 2 nos:
		 int num1 = 10;
		 int num2 = 45;
		 int sum = num1 + num2;
		 int product = num1 * num2;
		System.out.println("Sum of Num1 & Num2 is " + sum);
		System.out.println("Product of Num1 & Num2 is " + product);
	
		//int[] intArray = new int[10];
		 
		 int[] intArray = { 1,2,3,4,5,6,7,8,9,10 }; 
		 //for (int i = 0; i < intArray.length; i++)
		 for(int n:intArray) {
			 System.out.println(n); 
		 }
		 //System.out.println(Arrays.toString(intArray));
		 //int[][] intMultiArray = {{1,2},{3,4},{24,26}};
		 //System.out.println(Arrays.deepToString(intMultiArray));
		 //int sum1 = intArray[7] + intArray[8];
		 //System.out.println("sum of the 2 arrays are "  + sum1);
		 
		 
		 }
}
