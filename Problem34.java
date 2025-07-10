package day3;

import java.util.Scanner;

public class Problem34 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name1="nAmItHa";
		String emt="";
		for(int i=0;i<name1.length();i++)
		{
			char c=name1.charAt(i);
			if(c>='A' && c<='Z')
			{
				c=(char) (c+32);
				emt=emt+c;
			}
			else if(c>='a' && c<='z')
			{
				c=(char) (c-32);
	            emt=emt+c;
			}
		}
		System.out.println(emt);
	}
}
			