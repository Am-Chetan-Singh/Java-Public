package JavaPrograms;

import java.util.Scanner;

public class RevStarPattern {

	public static void main(String[] args) {
		int term=0;
		Scanner t=new Scanner(System.in);
		System.out.println("Enter the number of lines: ");
		term=t.nextInt();
		for(int i=term;i>=0;i--) {
			for(int j=i;j>0;j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
