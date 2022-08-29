package JavaPrograms;

public class UnaryOperatorExample2 {
public static void main(String []args){
int x=10, y=20;
System.out.println(x++ + ++x);//10 post-incremented to 11 and 11 pre-incremented to 12 (final value)= 10+12=22
System.out.println(y++ + y++);//20 post-incremented to 21 and 21 post-incremented to 22 (final value)= 20+21=41
System.out.println(x +", "+ y);// Final value of x= 12 and y = 22
}
}
