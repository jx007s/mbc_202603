package lambda_p;
interface Num{
	int mm1(int a, int b, int c);
}
/*
1. 3개의 합 리턴
2. 3개중 가장 큰수를 리턴
3. 첫번째 두번째 매개변수를 곱하고 3번째 매개변수로 뺀 수 리턴
 * */
public class Lambda3Main {
	
	static void gogo(String title, int a, int b, int c,Num mm) {
		int rr = mm.mm1(a,b,c);
		System.out.println(title+":"+rr);
	}

	public static void main(String[] args) {
		gogo("합",3,10,6, (x,y,z)->x+y+z);
		gogo("가장 큰수",3,10,6, (x,y,z)->Math.max(x,Math.max(y, z)));
		gogo("곱하기빼기",3,10,6, (x,y,z)->x*y-z);

	}

}
