package excep_p;

public class TryCatchMain {

	public static void main(String[] args) {

		try {  // 실행문 구간   -- 1
			
			
			int a = 0 / 10;
			System.out.println("a : "+a);
			
			//예외처리가 다수인 경우 먼저 발생된 예외에서 catch로 진행및 try 구간 탈출
			// 이하 try구간은 실행하지 않는다
			int b = 10 / 2;		//예외처리 발생  -- 2 예외일때 2-1, 예외가 아닐때 2-2
			System.out.println("b : "+b); // 실행하지 않음 -- 2-2
			
			int [] arr = {11,22,33,44};
			System.out.println("arr : "+arr[2]);
			
		}
		/* catch의 예외처리 클래스가 여러개일때
			상속관계를 유지하는 경우 자손클래스를 위에 작성해야 함 
		catch(Exception e) {
			System.out.println("Exception 발생");
		}
		catch(ArithmeticException e) { //예외처리발생시 진입구간  2-1
			System.out.println("ArithmeticException 발생");
		}*/
		catch(Exception e) {
			System.out.println("Exception 발생 : "+e.getMessage());
			//e.printStackTrace();
			return;
		}
		/*catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException 발생");
		}*/
		finally {
			// 항상 실행
			System.out.println("try~catch 종료 ");  // 3
		}
		
		//TSNMain 
		/// 3,6, 9 
		/// 1-> 20  
		/// if, switch, 3항연산자 사용불가 

	}

}
