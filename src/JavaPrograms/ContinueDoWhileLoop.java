package JavaPrograms;

public class ContinueDoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		do{
			if(i==5) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}while(i<10);

	}

}
