package oops_p;
/* 스타벅스,       커피빈(Outer)

아메리카노:	2000    2100
아시아노:		2300    2500
아프리카노:	2700    2200


 지역별로 커피전문점이 존재(Inner)

 스타벅스 - 서면,해운대,자갈치

 커피빈 - 서면,광안리,가야
 
 
구현메소드 : 판매, 출력
 판매 : 메뉴,수량
 
 출력(지점별, 총판)
 각 커피판매수량

* */

class MenuData{
	String title;
	int price, cnt;
	
	MenuData(String title, int price) {
		this.title = title;
		this.price = price;
	}
	
	int ppp() {
		System.out.println(title+"\t"+price+"\t"+cnt+"\t"+price*cnt);
		return price*cnt;
	}
}

class ShopData{
	String name;
	MenuData [] md;
	ShopData(String name, int am, int af, int asia) {
		
		this.name = name;
		md = new MenuData[] {
			new MenuData("아메리카노",am),
			new MenuData("아프리카노",af),
			new MenuData("아시아노",asia)
		};
	}
	
	
	MenuData add(String menu, int cnt) {
		MenuData ret = null;
		
		for (MenuData cd : md) {
			if(cd.title==menu) {
				ret = cd;
				break;
			}
		}
		
		ret.cnt+=cnt;
		
		return ret;
	}
	
	void ppp() {
		System.out.println("[["+name+"]]");
		int tot = 0;
		int cnt = 0;
		for (MenuData menuData : md) {
			tot += menuData.ppp();
			cnt += menuData.cnt;
		}
		System.out.println("\t\t"+cnt+"\t"+tot);
	}
	
}
class OuterBrand{
	ShopData data;

	OuterBrand(String name, int am, int af, int asia) {
		
		data = new ShopData(name, am, af, asia);
	}
	
	class InnerShop{
		ShopData data;
		InnerShop(String name) {
			data = new ShopData(name, 
					OuterBrand.this.data.md[0].price,
					OuterBrand.this.data.md[1].price,
					OuterBrand.this.data.md[2].price
			);
		}
		
		void order(String menu, int cnt) {
			OuterBrand.this.data.add(menu, cnt);
			MenuData cd = data.add(menu, cnt);
			System.out.println(OuterBrand.this.data.name+" "+data.name+"점 "+menu+"("+cd.price+") "+cnt+"잔 팔아요");
			System.out.println("\t금액 : "+cd.price*cnt);
			
		}
	}
	
}
public class InnerCoffeeMain {

	public static void main(String[] args) {
		OuterBrand sb = new OuterBrand("스타벅스", 2000,2300,2700);
		OuterBrand cb = new OuterBrand("커피빈", 2100,2500,2200);

		OuterBrand.InnerShop [] shops = {
				sb.new InnerShop("서면"),
				sb.new InnerShop("해운대"),
				sb.new InnerShop("자갈치"),
				cb.new InnerShop("서면"),
				cb.new InnerShop("광안리"),
				cb.new InnerShop("가야")
		};
		
		shops[0].order("아메리카노", 1);
		shops[1].order("아프리카노", 3);
		shops[0].order("아메리카노", 2);
		shops[2].order("아시아노", 3);
		
		shops[3].order("아프리카노", 3);
		shops[4].order("아메리카노", 2);
		shops[5].order("아시아노", 3);
		shops[4].order("아시아노", 2);
		
		shops[1].order("아시아노", 3);
		shops[4].order("아메리카노", 4);
		
		for (OuterBrand.InnerShop innerShop : shops) {
			innerShop.data.ppp();
		}
		sb.data.ppp();
		cb.data.ppp();
	}

}
