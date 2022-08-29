package tutorial;

public class Typecasting {
	public static void main(String []args){
		int a=12;//declaration and initialisation at same time for a
		System.out.println("a: "+a);//printing the value of a
		float b=10.9f; //declaration and initialisation at same time for b
		float c=220.9f;//declaration and initialisation at same time for c
		System.out.println("b: "+b);//printing the value of b
		a=(int)b;//Typecasting of b to int
		b=c;//transfer/copying the value of c to b
		System.out.println("a: "+a);//printing the value of a
		System.out.println("b: "+b);//printing the value of b
		a=(int)c;//Typecasting of c to int
		System.out.println("b: "+b);//printing the value of b
		System.out.println("a: "+a);//printing the value of a
		}

}
