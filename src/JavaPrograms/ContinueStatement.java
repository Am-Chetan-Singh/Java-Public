package JavaPrograms;

public class ContinueStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int j = 0 ; j <= 2 ; j++) {
			for(int k = j ; k <= 5 ; k++) {
				if(k == 3) {
					continue;
				}
				System.out.println(k);
			}
		}

	}

}
