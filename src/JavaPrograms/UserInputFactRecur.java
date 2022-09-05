package JavaPrograms;

import java.util.Scanner;

public class UserInputFactRecur {

			public static void main(String[] args) {
				int fact;
				Scanner inp= new Scanner(System.in);
				System.out.println("Enter value for Factorial: ");
				int num=inp.nextInt();
				UserInputFactRecur f=new UserInputFactRecur();
				fact=f.fac(num);
				System.out.println("Factorial of "+num+" is "+fact);
			}
			int fac(int num) {
				if(num>=1) 
				return (num*fac(num-1));
				return 1;
			}
			
	}
