package day3;

import java.util.Scanner;

public class Problem15 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int rev=0;
		int sum=0;
	    while(num!=0)
	    {
	    	int temp=num%10;
	    	rev=rev*10+temp;
	    	num=num/10;
	    }
	    System.out.println(rev); 
		while(rev!=0)
		{
			int b=rev;
			int sum1=0;
			while(b!=0)
			{
				sum1+=b%10;
				b/=10;
			}
			sum+=sum1;
			rev/=10;
		}
		System.out.println(sum);
	}
}
		
			
	    	
	