package extends_p;
class DyShape{
	final String KIND;
	int area, border;
	DyShape(String kind) {
		this.KIND = kind;
	}
	
	void ppp() {
		calc();
		System.out.println(KIND+"\t"+area+"\t"+border);
	}
	void calc() {}
}

class DyRec extends DyShape{
	final int w,h;

	DyRec(int w, int h) {
		super("직사각형");
		this.w = w;
		this.h = h;
	}
	void calc() {
		area = w*h;
		border = (w+h)*2;
	}
}

class DyTri extends DyShape{
	final int w,h,a;

	DyTri(int w, int h,int a) {
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

class DyCircle extends DyShape{
	final int r;

	DyCircle(int r) {
		super("원");
		this.r = r;
	}
	void calc() {
		final double PI = 3.141592;
		area = (int)(PI*r*r);
		border = (int)(PI*r*2);
	}
}

public class DyShapeMain {

	public static void main(String[] args) {
		DyShape [] shapes = {
			new DyCircle(5),
			new DyRec(5,6),
			new DyTri(5,6,8),
			new DyCircle(10),
			new DyTri(10,5,13),
			new DyRec(10,10),
			new DyRec(8,7),
			new DyCircle(3),
			new DyTri(10,10,16)
		};

		for (DyShape sh : shapes) {
			sh.ppp();
		}
	}

}
