package basic_p;

public class TSNMain {

	public static void main(String[] args) {
		System.out.println("1->20");
		for (int i = 1; i <=20; i++) {
			
			int one = i%10;
			int three = one%3;
			String ttt = i+"";
			if(three==0 && one!=0) {
				ttt="짝";
			}
			System.out.println(ttt);
			//System.out.println(i+","+one+","+three+","+ttt);
		}
		
		System.out.println("1->100");
		for (int i = 1; i <=100; i++) {
			
			int one = i%10;
			int ten = i/10;

			String ttt = "";
			if(ten%3==0 && ten!=0) {
				ttt+="짝";
			}
			if(one%3==0 && one!=0) {
				ttt+="짝";
			}
			if(ttt=="") {
				ttt+=i;
			}
			System.out.println(ttt);
		}

	}

}
