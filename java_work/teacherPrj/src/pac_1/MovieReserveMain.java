package pac_1;

/*
MovieReserveMain 
영화예약 클래스를 생성하여 출력해보세요
예약시 필수 입력 사항 : id, 성명, 전화번호, 상영시간, 좌석번호
예약후 변경 가능사항 : 성명, 전화번호
출력시 모든 항목이 다 있어야 함
*/


class MovieReserve{
	private String id, name, tel;
	private int time, seat;
	MovieReserve(String id, String name, String tel, int time, int seat) {
		this.id = id;
		this.name = name;
		this.tel = tel;
		this.time = time;
		this.seat = seat;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getId() {
		return id;
	}
	public int getTime() {
		return time;
	}
	public int getSeat() {
		return seat;
	}
	
	
	
}

public class MovieReserveMain {

	public static void main(String[] args) {
		MovieReserve mr = new MovieReserve(
				"aaa", 
				"놀란", 
				"01012345678", 
				7, 
				23);
		mr.setName("놀부");
		mr.setTel("01098765432");
		
		System.out.println("ID : "+mr.getId());
		System.out.println("이름 : "+mr.getName());
		System.out.println("전화 : "+mr.getTel());
		System.out.println("시각 : "+mr.getTime());
		System.out.println("좌석 : "+mr.getSeat());
		

	}

}
