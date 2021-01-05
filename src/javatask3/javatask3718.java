package javatask3;

import java.util.Scanner;

public class javatask3718 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		double[] nums = new double[n];
		
		for(int i = 0; i < n; ++i)
		{
			nums[i] = input.nextDouble();
		}
		
		for(int i = 0; i < n-1; ++i){
			for(int j = 0; j < n-1; ++j)
			{
				if(nums[j] < nums[j+1])
				{
					double temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
		
		for(int i = 0; i < n; ++i)
		{
			System.out.println(nums[i]);
		}
	}	

}

