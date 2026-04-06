package arr_p;

import java.util.Arrays;

public class CopyMain {

	public static void main(String[] args) {
		int [] arr1 = {100,200,300,400};
		int [] arr2 = {100,200,300,400};	//같은 값으로 생성
		int [] arr3 = arr1;					//얕은복사 : shallow copy
		int [] arr4 = {	arr1[0],arr1[1],arr1[2],arr1[3]	};	//깊은복사 : deep copy
		int [] arr5 = arr1.clone();
		
		System.out.println("주소------------");
		System.out.println("arr1 : "+arr1+","+Arrays.toString(arr1));
		System.out.println("arr2 : "+arr2+","+Arrays.toString(arr2));
		System.out.println("arr3 : "+arr3+","+Arrays.toString(arr3));
		System.out.println("arr4 : "+arr4+","+Arrays.toString(arr4));
		System.out.println("arr5 : "+arr5+","+Arrays.toString(arr5));
		System.out.println("비교------------");
		System.out.println("arr1==arr2 : "+(arr1==arr2));
		System.out.println("arr1==arr3 : "+(arr1==arr3));	//true
		System.out.println("arr1==arr4 : "+(arr1==arr4));
		System.out.println("arr1==arr5 : "+(arr1==arr5));
		arr1[1] = 2345;
		System.out.println("변경후------------");
		System.out.println("arr1 : "+arr1+","+Arrays.toString(arr1));//원소가 같다
		System.out.println("arr2 : "+arr2+","+Arrays.toString(arr2));
		System.out.println("arr3 : "+arr3+","+Arrays.toString(arr3));//원소가 같다ㅎ
		System.out.println("arr4 : "+arr4+","+Arrays.toString(arr4));
		System.out.println("arr5 : "+arr5+","+Arrays.toString(arr5));

	}

}
