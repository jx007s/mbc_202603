package oops_p;

/* 스타벅스,       커피빈

아메리카노:	2000    2100
아시아노:		2300    2500
아프리카노:	2700    2200


 지역별로 커피전문점이 존재

 스타벅스 - 서면,해운대,자갈치

 커피빈 - 서면,광안리,가야
 
 
구현메소드 : 판매, 출력
 판매 : 메뉴,수량
 
 출력(지점별, 총판)
 각 커피판매수량

* */

//커피메뉴1개의 데이터
class StCoffeeData{
	final String title;
	final int price;
	int cnt = 0;
	
	StCoffeeData(String title, int price) {
	
		this.title = title;
		this.price = price;
	}
	void ppp() {
		String ttt = title+"\t";
		ttt += price+"\t";
		ttt += cnt+"\t";
		ttt += price*cnt;
		System.out.println(ttt);
	}
}

//커피전문점의 데이터
class StShopData{
	String name;
	StCoffeeData [] data;
	StShopData(String name, int ... price) {
		this.name = name;
		data = new StCoffeeData[] {
			new StCoffeeData("아메리카노", price[0]),
			new StCoffeeData("아시아노", price[1]),
			new StCoffeeData("아프리카노", price[2])
		};
	}
	
	StCoffeeData add(String menu, int cnt) {
		StCoffeeData ret = null;
		
		for (StCoffeeData cd : data) {
			if(cd.title==menu) {
				ret = cd;
				break;
			}
		}
		
		ret.cnt+=cnt;
		
		return ret;
	}
	
	void ppp() {
		for (StCoffeeData cd : data) {
			cd.ppp();
		}
	}
}

class StBuck{

	final static StShopData totData = new StShopData("스타벅스",2000,2300,2700);
	final StShopData myData;

	StBuck(String localName) {
		
		myData = new StShopData(localName, 
				totData.data[0].price,
				totData.data[1].price,
				totData.data[2].price
				);
	}
	

	void order(String menu, int cnt) {
		totData.add(menu, cnt);
		StCoffeeData cd = myData.add(menu, cnt);
		System.out.println(totData.name+" "+myData.name+"점 "+menu+"("+cd.price+") "+cnt+"잔 팔아요");
		System.out.println("\t금액 : "+cd.price*cnt);
		
	}
	
}

class StBean{

	final static StShopData totData = new StShopData("커피빈",2100,2500,2200);
	final StShopData myData;

	StBean(String localName) {
		
		myData = new StShopData(localName, 
				totData.data[0].price,
				totData.data[1].price,
				totData.data[2].price
				);
	}
	

	void order(String menu, int cnt) {
		totData.add(menu, cnt);
		StCoffeeData cd = myData.add(menu, cnt);
		System.out.println(totData.name+" "+myData.name+"점 "+menu+"("+cd.price+") "+cnt+"잔 팔아요");
		System.out.println("\t금액 : "+cd.price*cnt);
		
	}
	
}

public class StaticCoffeeMain {

	public static void main(String[] args) {
		StBuck [] sbs = {
				new StBuck("서면"),
				new StBuck("해운대"),
				new StBuck("자갈치")
		};
		StBean [] bbs = {
				new StBean("서면"),
				new StBean("광안리"),
				new StBean("가야")
		};

		sbs[0].order("아메리카노", 1);
		bbs[1].order("아프리카노", 3);
		sbs[0].order("아메리카노", 2);
		sbs[2].order("아시아노", 3);
		
		sbs[1].order("아프리카노", 3);
		bbs[0].order("아메리카노", 2);
		sbs[2].order("아시아노", 3);
		bbs[1].order("아시아노", 2);
		
		sbs[1].order("아시아노", 2);
		bbs[2].order("아메리카노", 1);
		
		for (StBuck sb : sbs) {
			System.out.println(sb.totData.name+"."+sb.myData.name+">>>");
			sb.myData.ppp();
		}
		System.out.println(StBuck.totData.name+">>>");
		StBuck.totData.ppp();
		
		System.out.println();
		for (StBean sb : bbs) {
			System.out.println(sb.totData.name+"."+sb.myData.name+">>>");
			sb.myData.ppp();
		}
		
		System.out.println(StBean.totData.name+">>>");
		StBean.totData.ppp();
	}

}
