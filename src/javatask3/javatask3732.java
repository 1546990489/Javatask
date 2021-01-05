package javatask3;

import java.util.Scanner;

public class javatask3732 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] nums = new int[10];
		for(int i = 0; i < 10; ++i)
		{
			nums[i] = input.nextInt();
		}
		int num = partition(nums);
		System.out.println(num);
		for(int i = 0; i < nums.length; ++i)
			System.out.print(nums[i] + " ");
	}
	public static int partition(int[] list){
		int temp = 0;
		int j = 0;
		for(int i = 1; i < list.length; ++i)
		{
			if(list[i] <= list[j])
			{
				temp = list[i];
				list[i] = list[j];
				list[j] = temp;
				temp = list[j+1];
				list[j+1] = list[i];
				list[i] = temp;
				++j;
			}
		}
		return j;
	}
}

