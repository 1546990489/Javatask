package javatask2;

import java.util.Scanner;

public class javatask2321 {

	public static void main(String[] args) {
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year:");
        int year = input.nextInt();
        System.out.print("Enter month: ");
        int month = input.nextInt();
        if((year%4==0&&year%100!=0)||(year%400==0))
            days[1]=29;
        System.out.print("Enter the day of the month: 1-"+days[month-1]+": ");
        int q = input.nextInt();
        if(month==1||month==2)
        {
            month+=12;
            year--;
        }
        int h=(q+26*(month+1)/10+year%100+year%100/4+year/100/4+5*(year/100))%7;
        String[] Days = {"Sat","Sun","Mon","Tue","Wed","Thu","Fri"};
        System.out.println("The day of the week is "+days[h]);

	}

}
