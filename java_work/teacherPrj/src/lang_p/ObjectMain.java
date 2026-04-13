package lang_p;



/// 부모클래스 지정하지 않을 경우
/// Object 클래스 자동 상속
class ObjAAA{
	int a, b;

	ObjAAA(int a, int b) {
		this.a = a;
		this.b = b;
	}

//	@Override
//	public String toString() {
//		return "ObjAAA [a=" + a + ", b=" + b + "]";
//	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ObjAAA other = (ObjAAA) obj;
		return a == other.a && b == other.b;
	}
	
//	@Override
//	public String toString() {
//		
//		return "ObjAAA :"+a+","+b;
//	}
	
//	@Override
//	public boolean equals(Object obj) {
//		ObjAAA you = (ObjAAA)obj;
//		
//		return a==you.a && b==you.b;
//	}
	
	
}

public class ObjectMain {

	public static void main(String[] args) {
		ObjAAA a1 = new ObjAAA(10,20);
		ObjAAA a2 = new ObjAAA(10,20);
		ObjAAA a3 = a1;
		ObjAAA a4 = new ObjAAA(30,40);

		System.out.println("a1 : "+a1);
		String tt;
		//tt = a1;
		tt = a1.toString();  // 인스턴스 문자열내용(스트림) 출력
		System.out.println("tt : "+tt);
		
		//주소
		System.out.println("a1==a2 "+(a1==a2));
		System.out.println("a1==a3 "+(a1==a3));
		System.out.println("a1==a4 "+(a1==a4));
		
		//비교
		System.out.println("a1.equals(a2) "+a1.equals(a2));
		System.out.println("a1.equals(a3) "+a1.equals(a3));
		System.out.println("a1.equals(a4) "+a1.equals(a4));
		
		System.out.println("a1.hashCode() "+a1.hashCode());
		
	}

}
