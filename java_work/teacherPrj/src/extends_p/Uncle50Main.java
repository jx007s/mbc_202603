package extends_p;

interface Teacher{
	String kind = "강사";
	void lecture(String title);
	String answer(String question);
}

interface Daddy{
	String kind = "아빠";
	
	String answer(String question);
	void play();
}

interface Husband{
	String kind = "남편";
	
	void play();
	void work();
}

class UncleData{
	String name;
	int lectureCnt =0, playCnt=0, workCnt=0, answerCnt = 0;
	UncleData(String name) {
		this.name = name;
	}
	
	void ppp() {
		String ttt = name+"\t";
		ttt+=lectureCnt+"\t";
		ttt+=playCnt+"\t";
		ttt+=workCnt+"\t";
		ttt+=answerCnt+"\t";
		System.out.println(ttt);
	}
}


class Uncle50 implements Teacher, Daddy, Husband{
	//String name;
	UncleData data;

	/*
	Uncle50(String name) {
		this.name = name;
	}*/
	
	Uncle50(UncleData data) {
		this.data = data;
	}
	

	@Override
	public void work() {
		data.workCnt++;
		System.out.println(data.name+" 일해요");
		
	}

	

	@Override
	public void play() {
		data.playCnt++;
		System.out.println(data.name+" 놀아요");
	}

	@Override
	public void lecture(String title) {
		data.lectureCnt++;
		System.out.println(data.name+" "+title+" 강의해요");		
	}

	@Override
	public String answer(String question) {
		data.answerCnt++;
		System.out.println(data.name+" "+question+" 대답해요");
		return "정답";
	}
	
}

public class Uncle50Main {

	public static void main(String[] args) {
		Uncle50 uu1 = new Uncle50(new UncleData("정우성"));
		Uncle50 uu2 = new Uncle50(new UncleData("정좌성"));
		
		Teacher tt;
		Daddy dd;
		Husband hh;
		
		tt = uu1;
		tt.lecture("국어");
		tt = uu2;
		tt.lecture("영어");
		dd = uu1;
		dd.play();
		String qq = dd.answer("토르랑슈퍼맨이랑누가이겨?");
		System.out.println("qq : "+qq);
		hh = uu2;
		uu2.work();
		
		uu1.data.ppp();
		uu2.data.ppp();
	}

}

/*
AlbaMain
식당을 구현해주세요
카운터 - 계산(몇번테이블에 얼마를), 인사
홀 - 음식나르기(몇번테이블에 뭐를), 인사
주방 - 설겆이(그릇몇개를)
-> 구현객체 : 알바생
 * */



