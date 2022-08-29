package JavaPrograms;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;
int b=15;
int c=20;
System.out.println(a>b&&b<c&&b++<c);/*First Condition for Logical Operator(&&) is false,
 so it did not checked the other two conditions*/ 
System.out.println(b);//b=15 as b++ is not performed or checked
System.out.println(a<b&&b>c&&b++<c);/*Again First Condition for Logical Operator(&&) is false,
so it did not checked the other two conditions*/
System.out.println(b);//b=15 as b++ is not performed or checked
System.out.println(a<b&&b<c&&b++<c);/*Here, First Condition for Logical Operator(&&) is true,
so it did checked the other two conditions*/
System.out.println(b);//b=16 as b++ is performed or checked
System.out.println(a<b&&b>c&&b++>c);/*Here, Second Condition for Logical Operator(&&) is false,
so it did not checked the third conditions*/
System.out.println(b);//b=16 as b++ is not performed or checked
System.out.println(a<b&&b<c&&b++<c);/*Here, Second Condition for Logical Operator(&&) is true,
so it did checked the third conditions*/
System.out.println(b);//b=17 as b++ is performed or checked
System.out.println(a<b&&b<c&&b++>c);/*Here, third Condition for Logical Operator(&&) is false, 
and the b variable is incremented by 1 as it was checked*/
System.out.println(b);//b=18 as b++ is performed

System.out.println(a<b&&b<c&& ++b>c);/*Here, third Condition for Logical Operator(&&) is false, 
and the b variable is incremented by 1 as it was checked*/
System.out.println(b);//b=19 as ++b is performed

System.out.println(a<b&&b<c&&b+2>c);/*Here, third Condition for Logical Operator(&&) is true, 
and the b variable is incremented by 2 as it was checked*/
System.out.println(b);//b=21 as b+2 is performed
	}

}
