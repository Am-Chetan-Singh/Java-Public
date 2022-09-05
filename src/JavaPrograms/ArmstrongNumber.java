package JavaPrograms;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num=0;
		Scanner n= new Scanner(System.in);
		System.out.println("Enter Number: ");
		num=n.nextInt();
		ArmstrongNumber no= new ArmstrongNumber();
		no.ArmNo(num);
	}
	void ArmNo(int num) {
		int len=0, t1=num, t2=t1, rem=0, arm=0;
		while(t1!=0) {
			t1/=10;
			len++;
		}
		while(t2!=0) {
			int pow=1;
			rem=t2%10;
			for(int i=0;i<len;i++) {
				pow*=rem;
			}
			arm=arm+pow;
			t2=t2/10;
		}
		if(num==arm)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not Armstrong Number");
	}

}
