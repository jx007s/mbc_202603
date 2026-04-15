package oops_p;


class PlayerData{
	String kind;
	int cnt;
	PlayerData(String kind) {
		this.kind = kind;
		cnt = 0;
	}

	@Override
	public boolean equals(Object obj) {
		return obj.equals(kind);
	}

	void ppp() {
		
		System.out.println(kind + " :" + cnt);
	}
	
	

}

class BaseTeam{
	String name;//팀이름
	int hit, out3;
	
	BaseTeam(String name) {
		this.name = name;
	}
	
	void ppp() {
		System.out.println("[["+name+"]]");
		System.out.println("안타:"+hit);
		System.out.println("삼진:"+out3);
	}
	class Palyer{
		String name;		//선수이름
		PlayerData [] data = {
			new PlayerData("안타"),
			new PlayerData("삼진"),
			new PlayerData("사사구")
		};
		Palyer(String name) {
			this.name = name;
		}
		
		void ppp() {
			System.out.println("[["+name+"]]");
			for (PlayerData pd : data) {
				pd.ppp();
			}
		}
		
		void go(String act) {
			System.out.println(BaseTeam.this.name+" "+name+" "+act);
			
			// Player 기록
			for (PlayerData pd : data) {
				if(pd.equals(act)) {
					pd.cnt++;
				}
			}
			
			switch (act) {  //BaseTeam 기록
			case "안타":
				hit++;
				break;
			case "삼진":
				out3++;
				break;
			}
		}
		
	}
}

public class InnerBaseBallMain {

	public static void main(String[] args) {
		BaseTeam home = new BaseTeam("롯데");
		BaseTeam away = new BaseTeam("LG");
		
		BaseTeam.Palyer [] bps = {
			home.new Palyer("전준우"),
			home.new Palyer("윤동희"),
			home.new Palyer("황성빈"),
			home.new Palyer("한태양"),
			home.new Palyer("김민재"),
			away.new Palyer("박해민"),
			away.new Palyer("오스틴"),
			away.new Palyer("오지환"),
			away.new Palyer("박용택"),
			away.new Palyer("문보경")
		};
		
		bps[0].go("안타");
		bps[5].go("사사구");
		bps[2].go("안타");
		bps[6].go("삼진");
		bps[3].go("안타");
		bps[4].go("사사구");
		bps[7].go("사사구");
		bps[1].go("사사구");
		bps[2].go("안타");
		bps[9].go("안타");
		bps[0].go("삼진");
		bps[6].go("사사구");
		bps[7].go("안타");
		bps[1].go("안타");
		bps[2].go("사사구");
		bps[8].go("안타");
		bps[3].go("안타");
		bps[4].go("삼진");
		
		System.out.println("-------------");
		for (BaseTeam.Palyer palyer : bps) {
			palyer.ppp();
		}
		home.ppp();
		away.ppp();

	}

}

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




