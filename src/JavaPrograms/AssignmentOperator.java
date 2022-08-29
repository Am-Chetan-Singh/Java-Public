package JavaPrograms;

public class AssignmentOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=5;
		int j=10;
		i+=1;// i+=1 will be as i+1 which will be 5+1=6 or i=i+1=6
		j+=5;// j+=5 will be as j+5 which will be 10+5=15 or j-j+5=15
		System.out.println("value of i: " +i);//6
		System.out.println("value of j: " +j);//15
		i+=j;//i=6+15=21
		System.out.println("value of i: " +i);//21
		System.out.println("value of j: " +j);//15
		i-=j;//i=21-15=6
		System.out.println("value of i: " +i);//6
		System.out.println("value of j: " +j);//15
		i*=j;//i=6*15=90
		System.out.println("value of i: " +i);//90
		System.out.println("value of j: " +j);//15
		i%=j;//i=90%15=0
		System.out.println("value of i: " +i);//0
		System.out.println("value of j: " +j);//15
		i/=j;//i=0/15=0
		System.out.println("value of i: " + i);//0
		System.out.println("value of j: " +j);//15
	}

}
