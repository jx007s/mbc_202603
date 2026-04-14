package excep_p;

import java.util.Objects;
import java.util.Scanner;

class ThrowPerson{
	String id,pw,pname;

	ThrowPerson(String id, String pw, String pname) {
		this.id = id;
		this.pw = pw;
		this.pname = pname;
	}
	
	ThrowPerson(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ThrowPerson other = (ThrowPerson) obj;
		return Objects.equals(id, other.id) && Objects.equals(pw, other.pw);
	}
	
	
	
}

public class Throw5Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ThrowPerson [] pers = {
			new ThrowPerson("aa", "1111", "이효리"),
			new ThrowPerson("bb", "2222", "삼효리"),
			new ThrowPerson("cc", "3333", "사효리"),
			new ThrowPerson("dd", "4444", "오효리"),
			new ThrowPerson("ee", "5555", "육효리")
		}; 
		
		ThrowPerson me;
		while(true) {
			me = null;
			try {
				System.out.print("ID :");
				String id = sc.nextLine();
				
				System.out.print("PW :");
				String pw = sc.nextLine();
				
				ThrowPerson test = new ThrowPerson(id, pw);
				
				for (ThrowPerson pp : pers) {
					if(pp.equals(test)) {
						me = pp;
						break;
					}
				}
				
				if(me!=null) {
					break;
				}
				
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		System.out.println(me.pname+" 로그인 되었습니다.");
				

	}

}

/*
5명의 정보로 로그인을 구현하세요
로그인 성공시 이름으로 출력하세요
ID   pw   pname
aa, 1111, 이효리
bb, 2222, 삼효리
cc, 3333, 사효리
dd, 4444, 오효리
ee, 5555, 육효리
 * */
