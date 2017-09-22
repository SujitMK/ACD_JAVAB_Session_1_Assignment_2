package NumAddWihoutPlusSignPKG;

import java.util.Scanner;

public class NumAddWihoutPlusSign {

	public static void main(String[] args) {
		
		// Using Scanner to take dynamic/runtime values for parameters num1 and num2
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the value for Num1");
		int num1 = input.nextInt();
		
		System.out.println("Enter the value for Num2");
		int num2 = input.nextInt();
		
		// Printing values of num1 and num2
		
		System.out.println("The First Number is   : " + num1);
		System.out.println("The Second Number is  : " + num2);
		
		// Adding num1 and num2 without using + sign
		
		num2 = num1 - (-num2);
		
		System.out.println("The Addition of Num1 and Num2 is  : " + num2);
	}
}
