package JavaPrograms;

import java.util.Scanner;

public class VerticalNumber {

	public static void main(String[] args) {
		int term;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Terms: ");
		term=s.nextInt();
		
		for(int i=1;i<=term;i++) {
			int temp=i;
			for(int j=1;j<=i;j++) {
				System.out.print(temp);
				temp=temp+term-j;
			}System.out.println();
		}

	}

}
