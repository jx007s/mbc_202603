package basic_p;

public class CoffeeMain {

	public static void main(String[] args) {
		//커피이름: ex)아프리카노
		String name = "아메리카노";
		//포장유무: ex)  true
		boolean togo = true;
		//크기:  ex) L (S, M , L 중 택 1) 
		char size = 'L';
		//단가 : ex) 2100
		short price = 2100;
		// 수량 : ex) 3
		byte cnt = 3;
		// 금액 : ex) 6300
		int money = price * cnt;
		
		System.out.println("커피이름 : "+name);
		System.out.println("포장유무 : "+togo);
		System.out.println("크기 : "+size);
		System.out.println("단가 : "+price);
		System.out.println("수량 : "+cnt);
		System.out.println("금액 : "+money);


	}

}
