package JavaPrograms;

public class LabeledContinueStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		aa:
		for(int i=0;i<5;i++) {
			bb:
				for(int j=0;j<5;j++) {
					if(i==2&&j==2) {
						continue aa;
					}
					System.out.println(i+" "+j);
				}
		}
	}

}
