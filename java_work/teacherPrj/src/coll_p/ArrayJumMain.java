package coll_p;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayJumMain {

	public static void main(String[] args) {
		int [] data = {56,78,92,45,78,25,77,94,77,56,83,85,56,45,72};
		String title = "가양미우수", grade="가가가가가가양미우수수";
		ArrayList res = new ArrayList();
		/*
		res.add(new ArrayList()); //가
		res.add(new ArrayList()); //양
		res.add(new ArrayList()); //미
		res.add(new ArrayList()); //우
		res.add(new ArrayList()); //수
		*/
		for (Object object : title.toCharArray()) {
			res.add(new ArrayList());
		}
		for (int i : data) {
			//System.out.println(i);
			/*ArrayList curr;
			if(i>=90) {
				curr = (ArrayList)res.get(4);
			}else if(i>=80) {
				curr = (ArrayList)res.get(3);
			}else if(i>=70) {
				curr = (ArrayList)res.get(2);
			}else if(i>=60) {
				curr = (ArrayList)res.get(1);
			}else{
				curr = (ArrayList)res.get(0);
			}
			curr.add(i);*/
			((ArrayList)res.get(title.indexOf(grade.charAt(i/10)+""))).add(i); 
		}
		
		for (int i =0; i<title.length();i++) {
			ArrayList curr = (ArrayList)res.get(i);
			Collections.sort(curr);
			Collections.reverse(curr);
			System.out.println(title.charAt(i)+" "+curr);
		}
	}

}
