package controll_p;

import java.util.Date;

import model.PersonDAO;
import model.PersonDTO;

public class PersonMain {

	public static void main(String[] args) {

		

		String pid = "nnn";
		System.out.println("2. detail : "+pid);
		System.out.println(new PersonDAO().detail(pid));
		
		
		PersonDTO insertDTO = new PersonDTO();
		insertDTO.setPid("j1");
		insertDTO.setPame("케로로");
		insertDTO.setAge(24);
		insertDTO.setHeight(184.31);
		insertDTO.setBirth(new Date(1997-1900,5-1,8));
		insertDTO.setFriend("rrr");
		insertDTO.setPfid("pf1");
		
		System.out.println("3. insert: "+ insertDTO);
		System.out.println(new PersonDAO().insert(insertDTO));
		
		
		PersonDTO modifyDTO = new PersonDTO();
		modifyDTO.setPid("qqq");
		modifyDTO.setPame("한별이");
		modifyDTO.setHeight(163.92);
		modifyDTO.setFriend("u2");
		modifyDTO.setPfid("pf4");
		System.out.println("4. modify: "+ modifyDTO);
		System.out.println(new PersonDAO().modify(modifyDTO));
		
		
		
		
		System.out.println("1. list");
		for (PersonDTO dto : new PersonDAO().list()) {
			System.out.println(dto);
		}
	}

}


// personPrj 프로젝트를 생성하고 person 정보를 가져오세요


