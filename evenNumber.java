import java.util.Scanner;
public class evenNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		if(n%2==0&&n!=0)
			System.out.println("The number is Even");
		else
			System.out.println("The number is not Even");
	}

}
