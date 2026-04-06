package arr_p;

public class MulCoffeeMain {

	public static void main(String[] args) {
		/*
		 * MulCoffeeMain
		 * 1일 : "아시아노","아프리카노","아메리카노"
		 * 2일 : "아프리카노","아시아노"
		 * 3일 : 
		 * 
		 * 메뉴별 갯수를 출력하세요
		 * */
		String [][] order = {
				{"아시아노","아프리카노","아메리카노"},
				{"아프리카노","아시아노"},
				{"아메리카노","아프리카노","아프리카노","아시아노"}
		};
		
		String [] menu = {"아시아노","아프리카노","아메리카노"};
		int [] cnt = new int [menu.length];
		
		for (String[] oos : order) {
			for (String oo : oos) {
				
				System.out.println(oo);
				for (int i = 0; i < cnt.length; i++) {
					if(menu[i]==oo) {
						cnt[i]++;
					}
				}
			}
		}
		
		for (int i = 0; i < cnt.length; i++) {
			System.out.println(menu[i]+" : "+cnt[i]);
		}

	}

}
