package javatask2;

import java.util.Scanner;

public class javatask2329 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double r1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double r2 = input.nextDouble();
        if(Math.pow((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2),0.5)<=Math.abs(r1-r2))
            System.out.println("无重叠");
        else if(Math.pow((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2),0.5)<=r1+r2)
            System.out.println("相切");
        else
            System.out.println("重叠");

	}

}
