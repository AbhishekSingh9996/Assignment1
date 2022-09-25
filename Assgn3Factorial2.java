import java.lang.*;
import java.util.Scanner;

class Assgn3Factorial2{
	
	int fact (int num){
		
		if (num==0)
		{
			return 1;
		}
		else 
		{
			return (num*fact(num-1));
		}	
	}
	
	public static void main(String[] args){
		
		System.out.println("Enter a number : ");
		Scanner sc=new Scanner(System.in);
		
		int a =sc.nextInt();
		
		int b;
		
		Assgn3Factorial2 fact=new Assgn3Factorial2();
		b=fact.fact(a);
		
		//Working: eg: a=4; b=4*fact3 ; b=4*3*fact2 ;b=4*3*fact2 ; b=4*3*2*fact(1) ;b=4*3*2*1*fact(0) ; b=4*3*2*1*1 ;
		
		System.out.println("The factorial is "+b);
	}
}