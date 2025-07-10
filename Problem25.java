package day3;

public class Problem25 {
	public static void main(String[] args) {
		int i=1;
		int n=20;
		int sum=0;
		
		do
		{
			if(i%2!=0)
			{
				sum=sum+i;
			}
			i++;
		}
		while(i<=n);
		System.out.println(sum);
	}
}