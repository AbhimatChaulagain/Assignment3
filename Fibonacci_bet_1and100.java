
public class Fibonacci_bet_1and100 {
	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c=0;
		System.out.print(a+" "+b);
		for(int i=1;c<=100;++i)
		{
			c=a+b;
			if (c<=100)
				System.out.print(" "+c);
			a=b;
			b=c;
			
		}
	}

}
