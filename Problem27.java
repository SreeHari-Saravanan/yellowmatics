package day3;

import java.util.Scanner;

public class Problem27 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] arr=new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print("("+i+","+j+")"+" ");
			}
			System.out.println();
		}
	}
}
