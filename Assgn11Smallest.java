import java.lang.*;
import java.util.Scanner;

class Assgn11Smallest{
	
	void smallest(int m,int n, int p){
		if(m<n && m<p){
		System.out.println("Smallest number is "+m);	
		}
		else{
			if(n<p){
				System.out.println("Smallest number is "+n);
			}
			else{
				System.out.println("Smallest number is "+p);
			}
		}
		return;
		
	}
	
	public static void main(String [] args){
		
		int a,b,c;
		
		System.out.println("Enter 3 numbers : ");
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		Assgn11Smallest obj1 = new Assgn11Smallest();
		obj1.smallest(a,b,c);
		
	}
}