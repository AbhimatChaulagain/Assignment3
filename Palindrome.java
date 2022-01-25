import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		
		int rev=0;
		int rem;
		for(int a=n;a!=0;a=a/10)
		{
			rem=a%10;
			rev=rev*10+rem;
			
		}
		if (rev==n)
			System.out.println("The number is palindrome");
		else
			System.out.println("The number is not palindrome");
	}

}
