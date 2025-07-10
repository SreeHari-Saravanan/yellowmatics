package day3;

import java.util.Scanner;

public class Package7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the Start value:");
		int start=sc.nextInt();
		System.out.println("enter the End value:");
		int end=sc.nextInt();
		int sum=0;
		for(int i=start;i<=end;i++) {
			sum=sum+i;
		}
		System.out.println(sum);
		}
}