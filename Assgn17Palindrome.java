import java.lang.*;
import java.util.Scanner;

class Assgn17Palindrome{
	
	public static void main(String[] args){
		
		System.out.println("Enter a number : ");
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int og=a;
		int s=0;
				
		while(a>0){
			int c = a%10;
			s = (s*10)+c;
			a=a/10;			
		}
		
		if(og==s){
			System.out.println("Number is a palindrome");
		}
		else
		{
			System.out.println("Number is not a palindrome");
		}
		
	}
	
}