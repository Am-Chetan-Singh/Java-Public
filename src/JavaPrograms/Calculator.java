package JavaPrograms;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n=new Scanner(System.in);
		int res=0;
		char c;
		boolean check;
		do {
		System.out.println("Value 1 :");
		//int a=n.nextInt();
		int a=0;
		check=n.hasNextInt();
		if(check)
			 a=n.nextInt();
		else
			System.out.println("Please enter Numeric value");
		System.out.println("Value 2 :");
		int b=0;
		check=n.hasNextInt();
		if(check)
			 b=n.nextInt();
		else
			System.out.println("Please enter Numeric value");
		System.out.println("Enter one opetation(+,-,*,/) :");
		char ch=n.next().charAt(0);		
		switch(ch) {
		case '+': res=a+b;
			System.out.println(res);
			break;
		
		case '-': res=a-b;
		System.out.println(res);
		break;
		
		case '*': res=a*b;
		System.out.println(res);
		break;
		
		case '/': res=a/b;
		System.out.println(res);
		break;	
		
		default: System.out.println("Invalid Input!");
		
		}
		System.out.println("Want to continue?(Y/N) :");
		c=n.next().charAt(0);
	}while (c=='Y'||c=='y');

	}

}
