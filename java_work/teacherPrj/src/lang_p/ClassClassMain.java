package lang_p;

import java.util.Arrays;

interface ClaInf{
	void meth_1();
}

class ASDF implements ClaInf{
	String a = "ASDF.a", b = "ASDF.b";
	public void meth_1() {
		System.out.println("ASDF.meth_1() 실행");
	}
}
class Qwer implements ClaInf{
	String a = "Qwer.a", c = "Qwer.c";
	
	public void meth_1() {
		System.out.println("Qwer.meth_1() 실행");
	}
	void meth_2() {
		System.out.println("Qwer.meth_2() 실행");
	}
}

public class ClassClassMain {

	public static void main(String[] args) throws Exception {
		ASDF as1 = new ASDF();
		Class clz = as1.getClass();
		System.out.println(clz);
		System.out.println(clz.getName());
		System.out.println(clz.getSimpleName());
		Package pac = clz.getPackage();
		System.out.println(pac);
		System.out.println(pac.getName());
		System.out.println(as1.getClass().getPackage().getName());
		
		//멤버변수
		System.out.println(
				Arrays.toString(clz.getDeclaredFields()));
		
		//메소드
		System.out.println(
				Arrays.toString(clz.getDeclaredMethods()));
		
		//생성자
		System.out.println(
				Arrays.toString(clz.getDeclaredConstructors()));
		
		
		//동적 바인딩
		Class nn = Class.forName("lang_p.ASDF");
		
		Object oo1 = nn.newInstance();
		ASDF as2 = (ASDF)nn.newInstance();
		System.out.println(as2.a+","+as2.b);
		as2.meth_1();
		
		
		gogo("ASDF");
		gogo("Qwer");
	}
	
	static void gogo(String ttt) throws Exception{
		Class nn = Class.forName("lang_p."+ttt);
		ClaInf oo = (ClaInf)nn.newInstance();
		System.out.println(oo);
		oo.meth_1();
	}

}
