package JavaPrograms;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		int num;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number: ");
		num=s.nextInt();
		Palindrom pl=new Palindrom();
		pl.palin(num);
	}
	
	int palin(int n) {
		int t=n;int rev=0,rem=0;
		while(n!=0) {
		
		rem=n%10;
		rev=rev*10+rem;
		n=n/10;
		}
		if(t==rev) 
			System.out.println("Palindrom");
		else
			System.out.println("Not a Palindrom");
		return 1;
	} 

}
