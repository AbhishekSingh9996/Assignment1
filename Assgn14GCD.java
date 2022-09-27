import java.lang.*;
import java.util.Scanner;

class Assgn14GCD{
	
	int Assgn14GCD(int m,int n){
		
		int num =1;
		
		for(int i=1;i<=m && i<=n;i++){
			if(m%i==0 && n%i==0){
				num=i;
			}
		}
		return num;
		
	}
	
	public static void main(String [] args){
		
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number : ");
		a=sc.nextInt();
		b=sc.nextInt();
		
		Assgn14GCD obj1 = new Assgn14GCD();
		int c=obj1.Assgn14GCD(a,b);
		
		System.out.println(c);
	}
}