import java.lang.*;
import java.util.Scanner;

class Assgn13Reverse{
	
	public static void main(String [] args){
		int num=0;
		
		System.out.println("Enter a number : ");
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		
		while (a>0){
			int temp;
			temp=a%10;
			num=(num*10)+(temp);
			a=a/10;
						
		}
		System.out.println("The reverse number is "+num);
	}
	
}