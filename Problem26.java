package day3;

public class Problem26 {
	public static void main(String[] args) {
		int i=1;
		int n=25;
		int sum=0;
		do
		{
			if(i%2==0)
			{
				sum+=i;
			}
			i++;
		}
		while(i<=n);
		System.out.println(sum);
	}
}