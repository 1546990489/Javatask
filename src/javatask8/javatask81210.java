package javatask8;

import java.util.ArrayList;

public class javatask81210 {

	public static void main(String[] args) {
		ArrayList<Double> list = new ArrayList<Double>();
	    double i = 123456;
	    while(true)
	    {
	        i++;
	        try
	        {
	            list.add(i);
			} 
	        catch (OutOfMemoryError e) 
	        {
				System.out.print("Wrong!\n" + e);
				System.exit(1);
			}
		}
	}
}
