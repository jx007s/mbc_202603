package excep_p;

public class TSNMain {

	public static void main(String[] args) {
		for (int i = 1; i <=20; i++) {
			int one = i%10;
			try {
				int three = one%3;
				int a = 1234/three;
				System.out.println(i);
			} catch (Exception e) {
				try {
					int a = 1234/one;
					System.out.println("짝");
				} catch (Exception e2) {
					System.out.println(i);
				}
				
			}
			
		}

	}

}
