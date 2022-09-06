package JavaPrograms;

import java.util.Scanner;

public class RevNum {

	public static void main(String[] args) {
		int term;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Terms: ");
		term=s.nextInt();
		for(int i=0;i<=term;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
				for(int k=i-1;k>=1;k--)
					System.out.print(k+" ");
			System.out.println();
		}
	}

}
