package JavaPrograms;

public class NestedTernaryOperator {

	public static void main(String[] args) {
		
		int a=10;
		int b=20; 
		int c=-15; 
		int d=50;
		int min=(a<b)?((a<c)?((a<d)?a:d):((c<d)?a:d)):((b<c)?((b<d)?b:d):((c<d)?a:d));
		System.out.println(min);
		
		int max=(a>b)?((a>c)?((a>d)?a:d):((c>d)?a:d)):((b>c)?((b>d)?b:d):((c>d)?a:d));
		System.out.println(max);

	}

}
