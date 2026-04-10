package pac_1;

import java.util.Arrays;

class CapAAA{
	// 멤버변수 정보은닉 : 접근제어자 - private
	private String abc;
	private int qwer;
	public final int RTYU;
	private boolean zxcv;
	private int [] arr;
	
	//최초 입력후 getter or final로 값 고정 :: 입력값 상수화처리
	CapAAA(int qwer, int RTYU) {
		this.qwer = qwer;
		this.RTYU = RTYU;
	}

	//setter : 멤버변수 대입 - set+변수명(첫글자대문자)
	public void setAbc(String abc) {
		this.abc = abc;
	}
	
	//getter : 멤버변수 호출 - get+변수명(첫글자대문자)
	public String getAbc() {
		return abc;
	}
	
	
	
	public boolean isZxcv() {
		return zxcv;
	}

	public void setZxcv(boolean zxcv) {
		this.zxcv = zxcv;
	}

	//배열의 주소리턴 - 배열 원소 변경이 가능하다
	public int[] getArr() {
		return arr;
	}
	
	// 원소번호를 매개변수로 받아 원소값만 리턴 - 배열원소변경불가
	public int getArr(int i) {
		return arr[i];
	}

	public void setArr(int... arr) {
		this.arr = arr;
	}

	public int getQwer() {
		return qwer;
	}

	void ppp() {
		System.out.println(abc+","+qwer+","+zxcv+","+Arrays.toString(arr));
	}
}

public class CapsuleMain {

	public static void main(String[] args) {
		CapAAA ca = new CapAAA(100,200);
		//ca.abc = "아기상어";
		ca.setAbc("엄마상어");
		ca.ppp();
		ca.setZxcv(true);
		ca.setArr(11,22,33,44);
		System.out.println(ca.getAbc());
		System.out.println(ca.getQwer());
		System.out.println(ca.RTYU);
		System.out.println(ca.isZxcv());
		System.out.println(ca.getArr());
		System.out.println(ca.getArr()[0]);
		ca.getArr()[0] = 12345; // 배열원소 리턴을 이용하여 배열원소변경
		System.out.println(ca.getArr()[0]);
		ca.ppp();
		System.out.println(ca.getArr(0));
		//ca.getArr(0) = 56789;
	}

}
