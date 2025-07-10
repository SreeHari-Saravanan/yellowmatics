package day3;

import java.util.Scanner;

public class Problem35 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name1="abc".toLowerCase();
		int sum=0;
		for(int i=0;i<name1.length();i++)
		{
			sum=sum+(name1.charAt(i)-96);
		}
		System.out.println(sum);
	}
}