package basic_p;
/*
EnumSawonMain
직급별 상여율
사장(100), 부장(170), 과장(150), 대리(200), 사원(120)
이름 직급 기본급 

장동건 사원 300
장서건 과장 300
장남건 사장 300
장중건 대리 300
북두신건 부장 300
이효리 과장 400
삼효리 대리 500
사효리 사원 200
오효리 부장 500


출력
직급 이름 기본급 월급
 * */
enum EGrade{
	사장(100), 부장(170), 과장(150), 대리(200), 사원(120);
	final double rate;
	private EGrade(int rate) {
		this.rate = rate/100.0;
	}
}

class ESawon{
	private EGrade grade;
	private String name;
	private int basic, money;
	
	ESawon(String name, String grade, int basic) {
		
		this.grade = EGrade.valueOf(grade);
		this.name = name;
		this.basic = basic;
		calc();
	}
	private void calc() {
		money = basic + (int)(basic*grade.rate);
	}

	@Override
	public String toString() {
		return grade + "\t" + name + "\t" + basic +"\t"+money;
	}
	
	
}

public class EnumSawonMain {

	public static void main(String[] args) {
		ESawon [] esArr = {
				new ESawon("장동건", "사원", 300),
				new ESawon("장서건", "과장", 300),
				new ESawon("장남건", "사장", 300),
				new ESawon("장중건", "대리", 300),
				new ESawon("북두신건","부장", 300),
				new ESawon("이효리", "과장", 400),
				new ESawon("삼효리", "대리", 500),
				new ESawon("사효리", "사원", 200),
				new ESawon("오효리", "부장", 500),	
		};
		
		for (ESawon eSawon : esArr) {
			System.out.println(eSawon);
		}

	}

}
