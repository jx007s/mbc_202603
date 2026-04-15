package lang_p;

class SingleA{
	int a = 10;
	String b = "아기상어";
	
	private SingleA() {  //생성자 은닉화
		System.out.println("SingleA 생성자");
	}
}
public class SingleToneMain {

	public static void main(String[] args) {
		
		//SingleA sa = new SingleA();

	}

}
