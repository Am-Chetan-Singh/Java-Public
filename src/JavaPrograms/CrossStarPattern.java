package JavaPrograms;

import java.util.Scanner;

public class CrossStarPattern {

	public static void main(String[] args) {
		int term;
		Scanner d=new Scanner(System.in);
		System.out.println("Enter the number of lines: ");
		term=d.nextInt();
		for(int i=0;i<term;i++) {
			for(int j=0;j<term;j++) {
				if(i==j||i+j==term-1)
				System.out.print("*");
				else
					System.out.print(" ");
			}System.out.println();
		}
	}

}
