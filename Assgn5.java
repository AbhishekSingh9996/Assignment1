import java.lang.*;
import java.util.Scanner;

class Assgn5{
	
	void pn(int i){
		if (i>=0)
		{
			System.out.println("The number is positive.");
		}
		else {
			System.out.println("The number is negative.");
		}
	}
	
	public static void main(String [] args){
		
		System.out.println("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		
		Assgn5 num = new Assgn5();
		num.pn(a);
		
		
	}
}