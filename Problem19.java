package day3;
import java.util.Scanner;

public class Problem19 {
	 public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	       int[] arr=new int[5];
	       for(int i=0;i<arr.length;i++)
	       {
	    	   arr[i]=sc.nextInt();
	    	   
	       }
	       int max=arr[0];
	       for(int i=1;i<arr.length;i++)
	       {
	    	   if(arr[i]>max)
	    	   {
	    		   max=arr[i];
	    	   }
	       }
	       System.out.println(max);
	 }
}
