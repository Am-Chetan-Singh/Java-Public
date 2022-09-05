package JavaPrograms;

import java.util.Scanner;

public class RevMethod {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number for reverse: ");
		int num=s.nextInt();
		RevMethod r=new RevMethod();
		int res=r.rev(num);
		System.out.println("Result: "+res);
	}
		int rev(int num) {
			int rev=0,rem=0;
			while(num!=0) {			
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		return rev;
		}
}