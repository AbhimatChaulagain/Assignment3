import java.util.Scanner;
public class OddNumber {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		if(n%2!=0 && n!=0)
			System.out.println("The number is odd");
		else
			System.out.println("The number is not odd");
		
	}

}
