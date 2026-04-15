package lang_p;

// 싱글톤 : 프로그램에서 하나의 객체만을 생성하여 사용
// 1. 생성자 외부호출 차단 
// 2. 자신 타입의 멤버선언 및 외부호출 차단
// 3. static 메소드에 의해 자신 타입멤버 리턴
//     메소드에서 자신 타입멤버가 null 일때만 생성
class SingleA{
	int a = 10;
	String b = "아기상어";
	
	private SingleA() {  //생성자 은닉화
		System.out.println("SingleA 생성자");
	}
	
	//현재클래스 타입의 멤버요소 선언
	private static SingleA me = null;
	
	static SingleA getInstance() {
		
		if(me == null) {
			me = new SingleA(); //me가 없다면 생성
		}
		return me;
	}
	void ppp() {
		System.out.println(a+","+b);
	}
}
public class SingleToneMain {

	public static void main(String[] args) {
		
		//SingleA sa = new SingleA();
		//System.out.println(SingleA.me);
		
		SingleA sa1 = SingleA.getInstance();
		SingleA sa2 = SingleA.getInstance();
		
		sa1.a = 20;
		sa2.b = "엄마상어";
		System.out.println(sa1);
		sa1.ppp();
		
		System.out.println(sa2);
		sa2.ppp();
		
	}

}
