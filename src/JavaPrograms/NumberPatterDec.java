package JavaPrograms;

import java.util.Scanner;

public class NumberPatterDec {

	public static void main(String[] args) {
		int term;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Terms: ");
		term=s.nextInt();
		for(int i=1;i<=term;i++) {
			for(int j=i;j>=1;j--) {
				System.out.print(j+" ");
			}System.out.println();
		}
	}

}
