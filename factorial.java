import java.util.Scanner;
public class factorial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int f=1;
		for (int a=n;a>=1;a--)
		{
			f=f*a;
			
	}
		System.out.println("The factorial is ");
		System.out.println(f);
	

}
}
