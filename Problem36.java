package day3;

import java.util.Scanner;

public class Problem36 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int i=sc.nextInt();
		int[] arr=new int[size];
		for(i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		int[] freq=new int[10];
		for(i=0;i<arr.length;i++)
		{
			while(arr[i]!=0)
			{
				freq[arr[i]%10]+=1;
			}
		}
	}
}
