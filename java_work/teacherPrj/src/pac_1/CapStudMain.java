package pac_1;

class CapStud{

	private String name;
	private int [] jum = new int [3];
	private int tot, avg;
	
	public CapStud(String name) {
		this.name = name;
	}
	public void setJum(int pos, int score) {
		if(pos<0 || pos >= jum.length ) {
			System.out.println("잘못된 과목입니다.");
			return;
		}
		if(score<0 || score > 100 ) {
			System.out.println("잘못된 점수입니다.");
			return;
		}
		
		jum[pos] = score;
		calc();  //점수 입력마다 계산
	}
	public String getName() {
		return name;
	}
	public int getJum(int pos) {
		if(pos<0 || pos >= jum.length ) {
			System.out.println("잘못된 과목입니다.");
			return 0;
		}
		
		return jum[pos];
	}
	public int getTot() {
		return tot;
	}
	public int getAvg() {
		return avg;
	}
	
	private void calc() {
		tot = 0;
		for (int i : jum) {
			tot += i;
		}
		avg = tot/jum.length;
	}
	
}


public class CapStudMain {

	public static void main(String[] args) {
		CapStud st = new CapStud("차은우");
		st.setJum(0, 87);
		st.setJum(1, 83);
		st.setJum(2, 89);
		st.setJum(-1, 89);
		st.setJum(3, 89);
		st.setJum(2, 1234);
		
		System.out.println("이름 : "+st.getName());
		System.out.println("국어 : "+st.getJum(0));
		System.out.println("영어 : "+st.getJum(1));
		System.out.println("수학 : "+st.getJum(2));
		System.out.println("수학 : "+st.getJum(4));
		System.out.println("총점 : "+st.getTot());
		System.out.println("평균 : "+st.getAvg());
	}

}

/*
MovieReserveMain 
영화예약 클래스를 생성하여 출력해보세요

예약시 필수 입력 사항 : id, 성명, 전화번호, 상영시간, 좌석번호

예약후 변경 가능사항 : 성명, 전화번호

출력시 모든 항목이 다 있어야 함
*/



