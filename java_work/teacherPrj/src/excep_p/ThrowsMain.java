package excep_p;

class ThEx{
	
	void meth_1()  throws Exception{
		System.out.println("meth_1() 시작-------");
		try {
			meth_2();  //호출시 예외처리 요구
		} catch (Exception e) {
			System.out.println("meth_1 예외처리 : "+e.getMessage());
			
			throw e;	//다시 던지기
		} 
		System.out.println("meth_1() 끝-------");
	}
	
	
	// throws Exception  메소드 선언부에 작성
	// 메소드 호출하는 구간에서  예외처리 요구 :: Exception 을 처리
	void meth_2() throws Exception{
		System.out.println("\t meth_2()");
		
		throw new Exception("meth_2 에러발생");
		
		
		//System.out.println("\t meth_2() 끝-------");
	}
}


public class ThrowsMain {

	public static void main(String[] args) throws Exception {
		ThEx te = new ThEx();
		te.meth_1();

	}

}
