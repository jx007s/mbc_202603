package thread_p;

/*
멀티스레드 : 동시에 여러 메소드가 실행
멀티스레드 요건
1. Thread 클래스 상속
2. public void run() 재정의 - 실행코드 작성
3. 상속받은 클래스로 인스턴스 생성
4. start() 메소드 호출

 * */

// 1. Thread 클래스 상속
class Myth extends Thread{
	
	//String nn;
	
	
	Myth(String nn) {
		super(nn); // name = nn; 부모멤버변수에 대입
		//this.nn = nn;
	}

	// 2. public void run() 재정의 - 실행코드 작성
	public void run() {
		for (int i = 0; i <100; i++) {
			System.out.print(getName());//getName() 으로 생성시 입력받은 nn 호출
			try {
				Thread.sleep(10); // 1초지연
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}


public class ThreadMain {

	 static void sss() {
		System.out.println("sss 시작");
		
		try {
			Thread.sleep(1000); // 1초지연
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("sss 끝");
	}
	public static void main(String[] args) {
		//sss();
		
		//3. 상속받은 클래스로 인스턴스 생성
		Myth m1 = new Myth("&");
		Myth m2 = new Myth("?");
		Myth m3 = new Myth("*");
//		m1.run();
//		m2.run();
//		m3.run();
		
		
		//4. start() 메소드 호출
		//start() 메소드로 멀티스레딩 시작
		m1.start();
		m2.start();
		m3.start();
	}

}
