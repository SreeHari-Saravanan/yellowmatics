package day3;

import java.util.Scanner;

public class Problem9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the Start value:");
		int start=sc.nextInt();
		System.out.println("enter the End value:");
		int end=sc.nextInt();
		int num=0;
		for(int i=start;i<=end;i++) {
			if(num%2==0)
			{
				System.out.println("even");
			}
			else
			{
				System.out.println("odd");
			}
		}
	}
}

		