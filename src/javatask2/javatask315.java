package javatask2;

import java.util.Scanner;

public class javatask315 {

	public static void main(String[] args) {
		int num = (int) (Math.random() * 1000);
		String strNum = String.format("%03d", num);
		System.out.println("随机数字已生成");
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入三位数：");
		int usrNum = scanner.nextInt();
		String strUsrNum = String.format("%03d", usrNum);
		String num000 = strNum.substring(0, 1);
		String num00 = strNum.substring(1, 2);
		String num0 = strNum.substring(2, 3);
		String usrNum000 = strUsrNum.substring(0, 1);
		String usrNum00 = strUsrNum.substring(1, 2);
		String usrNum0 = strUsrNum.substring(2, 3);
		if (strNum.equals(strUsrNum)) {
		    System.out.println("恭喜您奖金为10000美元");
		} else if ((usrNum000.equals(num00) && usrNum00.equals(num0) && usrNum0.equals(num000)) ||
		        (usrNum000.equals(num000) && usrNum00.equals(num0) && usrNum0.equals(num00)) ||
		        (usrNum000.equals(num0) && usrNum00.equals(num00) && usrNum0.equals(num000)) ||
		        (usrNum000.equals(num0) && usrNum00.equals(num000) && usrNum0.equals(num00)) ||
		        (usrNum000.equals(num00) && usrNum00.equals(num000) && usrNum0.equals(num0))) {
		    System.out.println("恭喜您奖金为3000美元");
		} else if (usrNum000.equals(num000) ||
		        usrNum000.equals(num00) ||
		        usrNum000.equals(num0) ||
		        usrNum00.equals(num000) ||
		        usrNum00.equals(num00) ||
		        usrNum00.equals(num0) ||
		        usrNum0.equals(num000) ||
		        usrNum0.equals(num00) ||
		        usrNum0.equals(num0)) {
		    System.out.println("恭喜您奖金为1000美元");
		} else {
		    System.out.println("错误");
		
		    }
		}
		}