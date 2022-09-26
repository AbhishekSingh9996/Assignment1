import java.lang.*;
import java.util.Scanner;

class Assgn9Factors{
	
	void factors(int num){
		
		for (int i=1;i<=num;i++ ){
			if(num%i==0)
			{
			System.out.println(i);
			}
		}
		
	}
	
	public static void main(String [] args){
		
		int a;
		System.out.println("Enter a number : ");
		Scanner sc = new Scanner (System.in);
		a=sc.nextInt();
		
		Assgn9Factors obj1 = new Assgn9Factors();
		
		System.out.println("The factors of "+a+" are : ");
		
		obj1.factors(a);
	}
}
