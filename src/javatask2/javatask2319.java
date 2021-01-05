package javatask2;

import java.util.Scanner;

public class javatask2319 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double a=input.nextDouble();
		double b=input.nextDouble();
		double c=input.nextDouble();
		if(a+b<=c||a+c<=b||b+c<=a) 
		{
			System.out.println("输入不合法");
		}
		else 
		{
			System.out.println(a+b+c);
		}

	}

}
