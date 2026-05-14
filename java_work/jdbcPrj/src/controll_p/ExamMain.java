package controll_p;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ExamMain {

	public static void main(String[] args) {
		// 연결확인 되었으면 실행하지 않아도 됨
		//Class.forName("org.postgresql.Driver");
		
		String url = "jdbc:postgresql://localhost:5432/mbc_db";
		String user = "mbc_user";
		String pw = "123456";
		
		try {
			//1. db 연결 객체 생성
			Connection conn = DriverManager.getConnection(url, user, pw);
			// DriverManager는 Class.forName("org.postgresql.Driver") 를 이용하여
			// postgresql 을 사용할 수 있는 방법을 이해하고
			// 접속정보 url, user, pw 을 이용하여 
			// getConnection(url, user, pw); 이용하여 DB 에 연결한다.
			
			
			//System.out.println("DB 연결 성공");
			
			String sql = "select * from exam order by id";
			
			// 2. sql 실행 객체 생성
			PreparedStatement ptmt = conn.prepareStatement(sql);
			
			//3. sql 실행 결과 
			ResultSet rs = ptmt.executeQuery();
			
			//4. sql 실행 결과 처리
			while(rs.next()) {  // rs.next() 가지고 올 객체(레코드) 유무
				//rs.getXXX("컬럼명")  :: 컬럼 데이터 호출
				String ttt = rs.getInt("id")+"\t";
				ttt += rs.getInt("hakgi")+"\t";
				ttt += rs.getString("name")+"\t";
				ttt += rs.getString("pid")+"\t";
				ttt += rs.getString("reg_date")+"\t";
				ttt += rs.getInt("kor")+"\t";
				ttt += rs.getInt("eng")+"\t";
				ttt += rs.getInt("mat");
				System.out.println(ttt);
			}
			/*
			System.out.println(rs.next()); //가지고 올 객체(레코드) 유무
			
			//rs.getXXX("컬럼명")  :: 컬럼 데이터 호출
			String ttt = rs.getInt("id")+"\t";
			 ttt += rs.getInt("hakgi")+"\t";
			 ttt += rs.getString("name")+"\t";
			 ttt += rs.getString("pid")+"\t";
			 ttt += rs.getString("reg_date")+"\t";
			 ttt += rs.getInt("kor")+"\t";
			 ttt += rs.getInt("eng")+"\t";
			 ttt += rs.getInt("mat");
			 System.out.println(ttt);
			 rs.next();
			 ttt = rs.getInt("id")+"\t";
			 ttt += rs.getInt("hakgi")+"\t";
			 ttt += rs.getString("name")+"\t";
			 ttt += rs.getString("pid")+"\t";
			 ttt += rs.getString("reg_date")+"\t";
			 ttt += rs.getInt("kor")+"\t";
			 ttt += rs.getInt("eng")+"\t";
			 ttt += rs.getInt("mat");
			 System.out.println(ttt);
			*/
			
			
			
			
			//5. sql 실행결과 종료
			rs.close();
			
			//6. sql 실행객체 종료
			ptmt.close();
			
			//7. db 연결종료
			conn.close();
			
		} catch (Exception e) {
			System.out.println("DB 연결 실패"+e.getMessage());
		}
		
		
		

	}

}


// personPrj 프로젝트를 생성하고 person 정보를 가져오세요


