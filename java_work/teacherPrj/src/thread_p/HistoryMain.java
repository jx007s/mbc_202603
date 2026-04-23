package thread_p;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;

class HistoryTimer extends Thread{

	boolean endChk = false; //시험종료 파악할 변수
	
	@Override
	public void run() {
		for (int i = 30; i >=0; i--) {
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
/*
class HistoryQQ extends Thread{
	
	HistoryTimer timer;
	
	LinkedHashMap<String , String> map;
	
	int cnt;
	
	public HistoryQQ(HistoryTimer timer) {
		this.timer = timer;
		map = new LinkedHashMap<String, String>();
		map.put("1.감간찬, 2.강감찬, 3.감간찬, 4.강강창", "2");
		map.put("이성계는? 1.최수종, 2.송일국, 3.지진희, 4.김케빈", "3");
		map.put("장보고 와", "청해진");
		map.put("단군의 졸개가 아닌것은? 1.운사, 2.우사, 3.풍사, 4.안사", "4");
		map.put("웅녀는 뭘 먹었는가? 1.부추 2.정구지 3.돼지국밥 4.스파게티", "0");
	}
	
	@Override
	public void run() {
		cnt = 0;
		for (Map.Entry<String , String>mm : map.entrySet()) {
			
			while(true) {
				
				String answer = JOptionPane.showInputDialog(mm.getKey());
				if(timer.endChk) {
					break;
				}	
				if(answer.equals(mm.getValue()) || answer.equals("p")) {
					if(answer.equals(mm.getValue())) {
						cnt++;	//정답일 경우 맞힌 갯수 증가
					}
					break;
				}					
			}
			if(timer.endChk) {
				break;
			}	
		}
		timer.endChk = true;		//시험문제 모두 풀었을 경우 종료표시
		System.out.println("시험종료");
		ppp();
	}
	
	void ppp() {
		map.entrySet().stream().forEach(mm->System.out.println(mm));
		System.out.println("정답:"+cnt+"("+cnt*20+")");
	}
}*/

class HistoryData{
	String qq, answer, userA;

	HistoryData(String qq, String answer) {
		this.qq = qq;
		this.answer = answer;
	}

	@Override
	public String toString() {
		return  qq + " : " + answer + " (" + userA + ") ";
	}
	
	boolean answerChk(HistoryQQ hqq) {
		if(userA.equals(answer)) {
			hqq.cnt++;	//정답일 경우 맞힌 갯수 증가
		}
		return userA.equals(answer) || userA.equals("p");
	}
}

class HistoryQQ extends Thread{
	
	HistoryTimer timer;
	
	List<HistoryData> qqs;
	
	int cnt;
	
	public HistoryQQ(HistoryTimer timer) {
		this.timer = timer;
		qqs = List.of(
		new HistoryData("1.감간찬, 2.강감찬, 3.감간찬, 4.강강창", "2"),
		new HistoryData("이성계는? 1.최수종, 2.송일국, 3.지진희, 4.김케빈", "3"),
		new HistoryData("장보고 와", "청해진"),
		new HistoryData("단군의 졸개가 아닌것은? 1.운사, 2.우사, 3.풍사, 4.안사", "4"),
		new HistoryData("웅녀는 뭘 먹었는가? 1.부추 2.정구지 3.돼지국밥 4.스파게티", "0")
		);
	}
	
	@Override
	public void run() {
		cnt = 0;
		for (HistoryData data: qqs) {
			
			while(true) {
				
				String answer = JOptionPane.showInputDialog(data.qq);
				if(timer.endChk) {
					break;
				}
				data.userA = answer;
				if(data.answerChk(this)) {
					
					break;
				}					
			}
			if(timer.endChk) {
				break;
			}	
		}
		timer.endChk = true;		//시험문제 모두 풀었을 경우 종료표시
		System.out.println("시험종료");
		ppp();
	}
	
	void ppp() {
		qqs.stream().forEach(mm->System.out.println(mm));
		System.out.println("정답:"+cnt+"("+cnt*20+")");
	}
}


public class HistoryMain {

	public static void main(String[] args) {
		HistoryTimer timer = new HistoryTimer();
		HistoryQQ qq = new HistoryQQ(timer);
		
		
		timer.start();
		qq.start();

	}

}
