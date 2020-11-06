package SelJavaTestPackage;

import java.util.Scanner;

public class CheckOddEvenNumbers {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		CheckOddEvenNumbers obj = new CheckOddEvenNumbers();
		//obj.CheckOddorEven( );
		//obj.CheckVowelorNot( );
		//obj.LargestNumber( );
		//obj.PositiveNegativeNumber( );
		obj.RemovewhitSpaces( );
	}
	public static void CheckOddorEven( ) {
		Scanner reader= new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = reader.nextInt();
		if(n % 2 == 0)
			System.out.println("The number is even");
			else
			System.out.println("The number is Odd");
			
	}
	
	public static void CheckVowelorNot( ) {
		char ch  = 'b';
		if(ch == 'a' || ch == 'e' ||ch == 'i' ||ch == '0' ||ch == 'u')
		System.out.println("The Chararcter is Vowel");
		else
		System.out.println("The Chararcter is Consonant");
			
	}
	
	public static void LargestNumber( ) {
		int num1  = 107;
		int num2 = 700;
		int num3 = 360;
		if (num1 > num2 && num1 > num3)
		System.out.println("The Num1 is Greater");
		else if (num2>num1 && num2>num3)	
		System.out.println("The Num2 is Greater");
		else
		System.out.println("The Num3 is Greater");
	}
	public static void PositiveNegativeNumber( ) {
		int num1  = 99;
		if (num1 > 0)
		System.out.println("The Num1 is Positive");
		else if (num1 < 0)	
		System.out.println("The Num2 is Negative");
		
	}
	public static void RemovewhitSpaces( ) {
		String Sentence  = "i	hate 	myself now.";
		System.out.println("The initial statement is: "+Sentence);
		Sentence=Sentence.replaceAll("\\s", "");
		System.out.println("The final statement is: "+Sentence);
		
	}
}

