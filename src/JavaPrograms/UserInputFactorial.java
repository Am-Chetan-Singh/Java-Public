package JavaPrograms;

import java.util.Scanner;

public class UserInputFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c;
		do {
		int input=0;
		int fact=1;
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter Number for Factorial: ");
		input=inp.nextInt();
		for(int i=1;i<=input;i++) {
			fact*=i;
			
		}
		System.out.println("Factorial of "+input+" is :"+fact);
		System.out.println("Do you want to try for new number(yes/no) : ");
		c=inp.next().charAt(0);
		}while(c=='Y'||c=='y');

	}

}
