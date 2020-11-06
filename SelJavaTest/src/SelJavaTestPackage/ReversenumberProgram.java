package SelJavaTestPackage;

public class ReversenumberProgram {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int num = 4321, reverse = 0;

     while(num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed of the Number is " +reverse);
        int num1 = 1234567, reversed = 0;
        for(;num1 != 0;num1 /= 10) {
            int digit = num1 % 10;
            reversed = reversed * 10 + digit;
        }
        System.out.println("Reversed Number: " + reversed);
	} 

}
