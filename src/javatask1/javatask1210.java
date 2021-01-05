package javatask1;

import java.util.Scanner;

public class javatask1210 {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.print("Enter an amount in double, for example 11.56: ");
		double amount =input.nextDouble();
		int remainingAmount = (int)(amount * 100);
		int numberOfOneDollars= remainingAmount /100;
		
		int numberOfQuarters =remainingAmount / 25;
		int numberOfDimes = remainingAmount /10;
		

	}

}
