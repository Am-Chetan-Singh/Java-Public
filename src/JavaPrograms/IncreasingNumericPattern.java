package JavaPrograms;

import java.util.Scanner;

public class IncreasingNumericPattern {

	public static void main(String[] args) {
		int term;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Terms: ");
		term=s.nextInt();
		int temp=1;
		for(int i=0;i<term;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(temp+" ");
				temp++;
				}System.out.println();
			}
		}
}
