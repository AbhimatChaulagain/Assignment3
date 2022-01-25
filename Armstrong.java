import java.util.Scanner;
public class Armstrong {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		double sum=0;
		double rem=0;
		double c=0;
		for(int a=n; a!=0; a=a/10)
		{
			c=c+1;
		}
		
		for(int b=n; b!=0; b=b/10)
		{
			rem = b%10;
			sum = sum+Math.pow(rem,c);
		}
		
		if (sum==n)
			System.out.println("The number is armstrong");
		else
			System.out.println("The number is not armstrong");
	
	}

}
