package day3;

import java.util.Scanner;;

public class Problem13 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=6,fact=0;
		if(num==1 || num==0)
			System.out.println("non prime");
		for(int i=2;i<num/2;i++)
		{
			if(num%i==0)
			{
				fact++;
			}
		}
		if(fact==1)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("non prime");
		}
	}
}
