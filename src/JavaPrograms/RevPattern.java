package JavaPrograms;

import java.util.Scanner;

public class RevPattern {

	public static void main(String[] args) {
		int term;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Terms: ");
		term=s.nextInt();
		
		for(int i=0;i<=term;i++) {
			for(int j=term;j>i;j--) {
				System.out.print(j);
			}System.out.println();
		}
	}

}
