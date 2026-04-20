package coll_p;

import java.util.HashSet;

public class BingoMain {

	public static void main(String[] args) {
		HashSet bingo = new HashSet();
		
		while(bingo.size()!=25) {
			bingo.add((int)(Math.random()*100)+1);
		}
		
		
		int i = 0;
		for (Object bb : bingo) {
			System.out.print(bb+"\t");
			if(++i%5==0) {
				System.out.println();
			}
		}
	}

}
