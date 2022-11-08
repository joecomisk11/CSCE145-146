import java.util.Scanner;
public class SimpleRecursion {

	public static void main(String[] args) {
		
		//countDown(5);
		//System.out.println(factorial(5));
		//System.out.println(gcd(19,5));
		System.out.println(fibo(6));
	}
	public static void countDown(int i)
	{
		if(i < 0)
			return;
		System.out.println(i);
		countDown(i-1);
	}
	public static int factorial(int num)
	{
		if(num <= 0)
			return 1;
		else
			return num * factorial(num-1);
		
	}
	public static int gcd(int a, int b)
	{
		if(b == 0)
			return a;
		else
			return gcd(b, a%b);
	}
	public static int fibo(int num)
	{
		if(num == 1 || num == 2)
			return 1;
		else
			return fibo(num-1) + fibo(num-2);
	}
}
