import java.lang.*;
import java.util.Scanner;

class Assgn8{
	
	void digit(int n){
		if(n>0){
		System.out.println(n%10);
		digit(n/10);
		}
	}
	
	
	public static void main(String [] args){
		
		int a;
		
		System.out.println("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		
		Assgn8 obj1 = new Assgn8();
		obj1.digit(a);
	}
	
		
		
}