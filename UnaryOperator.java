package tutorial;

public class UnaryOperator {
public static void main(String []args){
int x=10;
System.out.println(++x);//Print 11
System.out.println(x++);//Print 11 but value is incremented to 12
System.out.println(--x);//Priint 11 because value is decremented to 11 before printing
System.out.println(x--);//Print 11 because the value is decremented to 10 post printing
System.out.println(x);//Print 10 which is the final value
}
}
