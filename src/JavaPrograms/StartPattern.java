package JavaPrograms;

import java.util.Scanner;

public class StartPattern {

	public static void main(String[] args) {
		int term=0;
		Scanner t=new Scanner(System.in);
		System.out.println("Enter the number of lines: ");
		term=t.nextInt();
		for(int i=0;i<=term;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
