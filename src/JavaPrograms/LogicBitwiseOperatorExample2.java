package JavaPrograms;

public class LogicBitwiseOperatorExample2 {
public static void main(String[] args) {
	int a=10;
	int b=5;
	int c=20;
	System.out.println(a<b&&a++<c); //false && true=false
	System.out.println(a);//a=10 as the second condition is not checked
	System.out.println(a<b&a++<c);// false & true =false
	System.out.println(a);//a=11 because second condition is checked
}
}
