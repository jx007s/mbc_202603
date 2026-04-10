package extends_p;
abstract class AbsShape{
	final String KIND;
	int area, border;
	AbsShape(String kind) {
		this.KIND = kind;
	}
	
	void ppp() {
		calc();
		System.out.println(KIND+"\t"+area+"\t"+border);
	}
	abstract void calc();
}

class AbsRec extends AbsShape{
	final int w,h;

	AbsRec(int w, int h) {
		super("직사각형");
		this.w = w;
		this.h = h;
	}
	void calc() {
		area = w*h;
		border = (w+h)*2;
	}
}

class AbsTri extends AbsShape{
	final int w,h,a;

	AbsTri(int w, int h,int a) {
		super("직각삼각형");
		this.w = w;
		this.h = h;
		this.a = a;
	}
	void calc() {
		area = w*h/2;
		border = w+h+a;
	}
}

class AbsCircle extends AbsShape{
	final int r;

	AbsCircle(int r) {
		super("원");
		this.r = r;
	}
	void calc() {
		final double PI = 3.141592;
		area = (int)(PI*r*r);
		border = (int)(PI*r*2);
	}
}

public class AbsShapeMain {

	public static void main(String[] args) {
		AbsShape [] shapes = {
			new AbsCircle(5),
			new AbsRec(5,6),
			new AbsTri(5,6,8),
			new AbsCircle(10),
			new AbsTri(10,5,13),
			new AbsRec(10,10),
			new AbsRec(8,7),
			new AbsCircle(3),
			new AbsTri(10,10,16)
		};

		for (AbsShape sh : shapes) {
			sh.ppp();
		}
	}

}
