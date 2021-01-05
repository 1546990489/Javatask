package javatask3;

import java.util.Arrays;
import java.util.Scanner;

public class javatask373 {

	public static void main(String[] args) {
		final int inf = 101;
    	Scanner input = new Scanner(System.in);
    	int[] num = new int[100];
    	int count = 0;
    	while(true)
    	{
    		int temp = input.nextInt();
    		if(temp == 0)
    			break;
    		num[count] = temp;
    		++count;
    	}
    	Arrays.sort(num,0,count);
    	int time = 0;
    	for(int i = 0; i < count; ++i)
    	{
    		if(num[i] != inf)
    		{
    			time = 0;
	    		for(int j = 0; j < count; ++j)
	    		{
	    			if(num[i] == num[j])
	    			{
	    				++time;
	    				if(i != j)
	    					num[j] = inf;
	    			}
	    		}
	    		System.out.println(num[i] + " occurs " + time + (time > 1 ? " times" : " time"));
	    	}
    	}


	}

}
