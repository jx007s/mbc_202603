package oops_p;

class DragonMoney{
	static int money = 100;
	int myMoney=0;
	
	String name;

	DragonMoney(String name) {
		this.name = name;
	}
	
	void showMeTheMomey(int money) {
		myMoney+= money;
		this.money-=money;
		System.out.println(name+":"+money+"("+myMoney+")");
		System.out.println("\t잔액:"+this.money);
		
	}
	
}


public class DragonMoneyMain {

	public static void main(String[] args) {
		DragonMoney son = new DragonMoney("아들");
		DragonMoney daughter = new DragonMoney("딸");
		
		son.showMeTheMomey(15);
		daughter.showMeTheMomey(8);
		daughter.showMeTheMomey(22);
		son.showMeTheMomey(7);
		son.showMeTheMomey(9);
		daughter.showMeTheMomey(16);
		

	}

}
