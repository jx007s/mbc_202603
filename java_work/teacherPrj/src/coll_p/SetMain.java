package coll_p;

import java.util.ArrayList;
import java.util.HashSet;

public class SetMain {

	public static void main(String[] args) {

		Object [] data = {11,22,33,66,11,33,22,"11",97,'a',22};
		
		ArrayList arr = new ArrayList();
		HashSet ss1 = new HashSet();
		
		for (Object oo : data) {
			arr.add(oo);
			ss1.add(oo);
		}
		System.out.println("arr:"+arr);
		System.out.println("ss1:"+ss1);

	}

}
