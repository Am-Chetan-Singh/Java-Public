package JavaPrograms;

public class LogicBitwiseOROperator {
public static void main(String[] args) {
	int a=10;
	int b=5;
	int c=20;
	System.out.println(a>b||a++>c); //true || false = true
	System.out.println(a);// a=10 because second comparison is not checked
	System.out.println(a<b|a++<c); // false | true = true
	System.out.println(a);// a=11 because the second comparison is checked
	//here a =11
	System.out.println(a<b||a++>c); //false || false = false
	System.out.println(a);// a=12 because second comparison is checked
	//here a =12
	System.out.println(a>b|a++<c); // true | true = true
	System.out.println(a);// a=13 because the second comparison is checked
	//here a =13
	System.out.println(a<b|a++>c); // false | false = false
	System.out.println(a);// a=14 because the second comparison is checked
		
}
}
