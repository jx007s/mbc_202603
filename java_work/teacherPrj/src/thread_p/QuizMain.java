package thread_p;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.swing.JOptionPane;

class QuizTimer extends Thread{
	
	boolean endChk = false; //시험종료 파악할 변수
	
	@Override
	public void run() {
		for (int i = 10; i >=0; i--) {
			if(endChk) {
				break;
			}
			System.out.println(i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		endChk = true; // 시험종료로 표시
	}
}

class QuizQQ extends Thread{
	
	QuizTimer timer;
	
	LinkedHashMap<String , String> map;
	
	public QuizQQ(QuizTimer timer) {
		this.timer = timer;
		map = new LinkedHashMap<String, String>();
		map.put("3+3", "6");
		map.put("비가올땐?", "파전");
		map.put("부산에서는?", "돼지국밥");
		map.put("학원이름?", "mbc");
		map.put("난가끔 눈물을흘린다", "채연");
	}
	
	@Override
	public void run() {
		for (Map.Entry<String , String>mm : map.entrySet()) {
			String answer = JOptionPane.showInputDialog(mm.getKey());
			if(timer.endChk) {
				break;
			}
			System.out.println(answer);
		}
		timer.endChk = true;		//시험문제 모두 풀었을 경우 종료표시
		System.out.println("시험종료");
	}
}

public class QuizMain {

	public static void main(String[] args) {
		QuizTimer timer = new QuizTimer();
		QuizQQ qq = new QuizQQ(timer);
		
		
		timer.start();
		qq.start();
	}

}

//HistoryMain
//국사 시험문제를 구현하세요
//답이 틀리면 다시 풀게 하세요
//p를 쓰면 오답처리하고 다음문제로 진행시키세요
/*
 3+3 => 6
 10-2 => 8 오답(dde)
 8/2 => 4
 3+4*5 => 23 오답(35)
 전체 : 4, 맞은갯수 : 2, 틀린갯수 : 2
 합계 : 25/100 
 * */