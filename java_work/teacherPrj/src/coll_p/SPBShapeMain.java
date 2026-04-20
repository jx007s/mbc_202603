package coll_p;

import java.util.TreeSet;

abstract class SPBShape implements Comparable{
	
	String name;
	int area, border;
	
	
	SPBShape(String name) {
		this.name = name;
	}
	
	abstract void calc();


	@Override
	public int compareTo(Object o) {
		SPBShape you = (SPBShape)o;
		
		int res = name.compareTo(you.name);
		
		if(res==0) {
			res = you.area - area;
		}
		
		if(res==0) {
			res = you.border - border;
		}
		return res;
	}

	@Override
	public String toString() {
		return name + "\t" + area +"\t"+ border;
	}
	
	
}


class CPBRec extends SPBShape{
	int w, h;

	CPBRec(int w, int h) {
		super("직사각형");
		this.w = w;
		this.h = h;
		calc();
	}
	
	@Override
	void calc() {
		area = w*h;
		border = (w+h)*2;
	}	
}

class CPBTri extends SPBShape{
	int w, h, a;

	CPBTri(int w, int h, int a) {
		super("직각삼각형");
		this.w = w;
		this.h = h;
		this.a = a;
		calc();
	}
	
	@Override
	void calc() {
		area = w*h/2;
		border = w+h+a;
	}	
}

class CPBCircle extends SPBShape{
	int r;

	CPBCircle(int r) {
		super("원");
		this.r = r;
		calc();
	}
	
	@Override
	void calc() {
		area = (int)(Math.PI*Math.pow(r, 2));
		border = (int)(Math.PI*2*r);
	}	
}
public class SPBShapeMain {

	public static void main(String[] args) {
		TreeSet shapes = new TreeSet();
		shapes.add(new CPBRec(5, 6));
		shapes.add(new CPBCircle(5));
		shapes.add(new CPBTri(5, 6, 8));
		shapes.add(new CPBRec(10,20));
		shapes.add(new CPBCircle(9));
		shapes.add(new CPBTri(10, 6, 14));
		shapes.add(new CPBRec(4, 3));
		shapes.add(new CPBCircle(3));
		shapes.add(new CPBTri(20,4,22));
		shapes.add(new CPBRec(7,8));
		shapes.add(new CPBCircle(6));
		shapes.add(new CPBTri(6,6,10));
		
		
		for (Object sh : shapes) {
			System.out.println(sh);
		}

	}

}
