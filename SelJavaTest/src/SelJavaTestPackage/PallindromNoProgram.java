package SelJavaTestPackage;

public class PallindromNoProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 454, reverse = 0, temp;
		temp = num;

	     while(num != 0) {
	            int digit = num % 10;
	            reverse = reverse * 10 + digit;
	            num /= 10;
	        }
	     if(temp == reverse) {
	    	 System.out.println("It is a Pallindrom Number " +temp);
	     }
	    	 else {
	    	System.out.println("It is a Pallindrom Number " +temp);	 
	     }

	}

}
