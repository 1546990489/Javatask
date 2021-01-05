package javatask3;

import java.util.Scanner;

public class javatask3719 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter list:");
		int n = input.nextInt();
		int[] nums = new int[n];
		for(int i = 0; i < n; ++i)
			nums[i] = input.nextInt();
		for(int i = 1; i < n; ++i)
		{
			if(nums[i] < nums[i-1])
			{
				System.out.println("The list is not sorted");
				return ;
			}
		}
		System.out.println("The list is already sorted");
	}	
}
