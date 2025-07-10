package day3;

import java.util.Scanner;

public class Problem14 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int i=2;
		while(a/2==0)
		{
			if(a%2==0 && a%3==0)
			{
				System.out.println("prime");
			}
			else {
				System.out.println("non prime");
			}
		}
	}
}
