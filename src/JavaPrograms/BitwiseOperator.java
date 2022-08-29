package JavaPrograms;

public class BitwiseOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;
int b=15;
int c=20;
System.out.println(a<b&b>c&b++<c);// true false true = False
System.out.println(b);//b=16 as b++ is performed or checked
System.out.println(a<b&b<c&b++<c);// true true true = true
System.out.println(b);//b=17 as b++ is performed or checked
System.out.println(a<b&b<c&b++>c);// true true false=false
System.out.println(b);//b=18 as b++ is performed or checked
System.out.println(a<b&b<c&b++<c);// true true true = false
System.out.println(b);//b=19 as b++ is performed
System.out.println(a<b&++b==c);// true true = true
System.out.println(b);//b=20 as ++b is performed
System.out.println(a<b&++b>c);// true true = true
System.out.println(b);//b=21 as ++b is performed
	}

}
