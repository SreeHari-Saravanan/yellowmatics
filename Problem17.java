package day3;

import java.util.Scanner;

public class Problem17 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++)
			{
			arr[i]=sc.nextInt();
			}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		//index out of bound
		System.out.println(arr[20]);
	}
}
			