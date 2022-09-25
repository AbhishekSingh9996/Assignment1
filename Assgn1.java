import java.lang.*;
import java.util.Scanner;

class Assgn1{
	
	public static void Evenodd(int num){
		if(num%2==0){
			System.out.println("The number is even");
		}
		else{
			System.out.println("The number is odd");
		}
		return;
	}
	
	public static void main(String args[]){
		
		int a;
		
		System.out.println("Enter a number ");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();

		Evenodd(a);
		
		
	}
}