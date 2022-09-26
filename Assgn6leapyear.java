import java.lang.*;
import java.util.Scanner;

class Assgn6leapyear{
	
		int year1(int n){
			if(n%4==0){
				if(n%100==0){
					if(n%400==0){
						return 0;
					}
					else{
						return 1;
					}
				}
				else{
					return 1;
				}
			}
			else{
			return 1;	
			}
			
		}
	
	public static void main(String [] args){
		
		
		int year;
		
		System.out.println("Enter a year : ");
		Scanner num = new Scanner(System.in);
		year = num.nextInt();
		
		Assgn6leapyear obj1 = new Assgn6leapyear();
		
		int y = obj1.year1(year);
		
		switch (y){
			
			case 1: 
			System.out.println("It is not a leap year");
			break;
			case 0:
			System.out.println("It is a leap year");
			break;
		}
		
		
		
		
	}
}