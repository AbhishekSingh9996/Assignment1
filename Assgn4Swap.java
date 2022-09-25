import java.lang.*;
import java.util.Scanner;

class Assgn4Swap{
	
	void Swapping(int x, int y){
		
		x = x+y;
		y = x-y;
		x = x-y;
		
		System.out.println("After swapping the numbers are "+x+" and "+y);
		return;
	}
	
	public static void main(String [] args){
		
		int a,b;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter number 1 : ");
		a=scan.nextInt();
		
		System.out.println("Enter number 2 : ");
		b=scan.nextInt();
		
		Assgn4Swap swap=new Assgn4Swap();
		swap.Swapping(a, b);
	}
}