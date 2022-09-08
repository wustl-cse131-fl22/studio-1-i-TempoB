package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("input the year:");
		int year=in.nextInt();
		boolean leapyear= ((year%4)==0&&(year%100!=0))||(year%4==0);
		System.out.print("It is a leap year:"+leapyear);
		
	}

}
