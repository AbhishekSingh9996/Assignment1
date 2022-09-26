import java.lang.*;
import java.util.Scanner;

class Assgn10{
	
	
	
	int sumdigit(int num){
		
		int c=0;
				
		while(num>0){
			c=c+(num%10);
			num=num/10;
		}
		return c;
		
	}
	
	public static void main(String [] args){
		
		int a;
		System.out.println("Enter a number : ");
		Scanner sc =new Scanner(System.in);
		a=sc.nextInt();
		
		Assgn10 obj1 = new Assgn10();
		int b = obj1.sumdigit(a);
		
		System.out.println("The sum of digit is "+b);
	}
}