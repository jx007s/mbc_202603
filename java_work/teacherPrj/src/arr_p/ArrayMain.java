package arr_p;

public class ArrayMain {

	public static void main(String[] args) {
		// 배열변수 선언 = 배열초기화
		// 자료형 [] 변수명 = 배열생성 및 초기화 : 배열생성 생략
		int [] arr1 = {100,200,300,400,'a','b'};

		System.out.println("arr1 : "+arr1);
		// [I@28a418fc
		// [ : 배열 1차원
		// I : int
		// @ 구분기호
		// 28a418fc : 배열주소 16진수로 표현 - 4byte 사용
		
		System.out.println("arr1[0] "+arr1[0]);
		System.out.println("arr1[1] "+arr1[1]);
		System.out.println("arr1[2] "+arr1[2]);
		System.out.println("arr1[3] "+arr1[3]);
		System.out.println("arr1[4] "+arr1[4]);
		System.out.println("arr1[5] "+arr1[5]);
		
		//System.out.println("arr1[6] "+arr1[6]); 존재하지 않는 원소 호출 불가
		System.out.println("arr1.length "+arr1.length);
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("arr1["+i+"] "+arr1[i]);
		}
		System.out.println("--------------------------");
		for (int i : arr1) {	//향상된 for문 : 원소번호 확인 불가
			System.out.println(i);
		}
		System.out.println("--------------------------");
		arr1[0] = 1357;		//원소대입
		arr1[1] = 2468;
		//arr1[6] = 999;존재하지 않는 원소 대입 불가
		for (int i : arr1) {	//향상된 for문 : 원소번호 확인 불가
			System.out.println(i);
		}
		System.out.println("--------------------------");
		
		int [] arr2 = new int[5]; //new int[5] : 배열생성 및 배열주소 대입
		int [] arr3;
		//arr3 = {12,34,56};  배열 초기화 및 명시적 생성은 배열변수 선언시에만 가능
		arr3 = new int[3];	
		int [] arr4;
		arr4 = new int[] {66,77,88,99}; // 배열 생성 및 초기화 및 주소대입
		
	}

}
