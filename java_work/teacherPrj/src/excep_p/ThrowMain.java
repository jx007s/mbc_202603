package excep_p;

public class ThrowMain {

	public static void main(String[] args) {
		try {
			
			System.out.println("try 구간1");
			
			// 생성만으로는 catch 진입 안함
			/*
			Exception eee = new Exception("생성한예외처리");
			
			System.out.println("try 구간2");
			
			throw eee;	//catch로 던지기 */
			
			throw new Exception("생성한예외처리2");
			
			//System.out.println("try 구간3"); throw 이후 실행구문불가
		} catch (Exception e) {
			System.out.println("catch 구간 : "+e.getMessage());
		}
		
		System.out.println("try~catch 종료 ");

	}

}
