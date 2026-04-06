package arr_p;

public class EvenMain {

	public static void main(String[] args) {
		int [] arr = {88,7,36,99,14,75,89,86,42,37,51,62};

		int tot = 0;
		int cnt = 0;
		for (int i : arr) {
			if(i%2==0) {
				tot+= i;
				cnt++;
			}
		}
		System.out.println("합계 : "+tot);
		System.out.println("갯수 : "+cnt);
		System.out.println("평균 : "+tot/cnt);
	}

}
