package oops_p;

class SoccerPlayer{
	String pos;
	String name;
	int no;
	
	void attack() {
		System.out.println("공격해요");
	}
	
	void pass() {
		System.out.println("패쓰해요");
	}
	
	void defense() {
		System.out.println("수비해요");
	}
}

public class SoccerPlayerMain {

	public static void main(String[] args) {
		SoccerPlayer p1 = new SoccerPlayer();
		SoccerPlayer p2 = new SoccerPlayer();
		p1.name = "박지성";
		p1.pos = "MF";
		p1.no = 13;
		
		p1.attack();
		p1.pass();
		p1.defense();
		
		p2.name = "손흥민";
		p2.pos = "WF";
		p2.no = 7;
		
		p2.attack();
		p2.pass();
		p2.defense();

	}

}
