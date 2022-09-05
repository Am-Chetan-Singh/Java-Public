package JavaPrograms;

import java.util.Scanner;

public class UsrInptReverseNumber {

	public static void main(String[] args) {
		int rev=0,rem=0;
		int num;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number for reverse: ");
		num=s.nextInt();
		while(num!=0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println(rev);

	}

}
