import java.lang.*;
import java.util.Scanner;

class Assgn2Factorial{
	
	static int Factorial(int num){
		int c=1;
		for(int i=num;i>=1;i--)
		{
			c=c*i;
		}
		return c;
	}
	
	public static void main(String[] args){
		
		int a;
		
		System.out.println("Enter a number : ");
		Scanner num=new Scanner(System.in);
		a=num.nextInt();
		
		int b = Factorial( a);
		System.out.println("The factorial is "+b);
	}
}