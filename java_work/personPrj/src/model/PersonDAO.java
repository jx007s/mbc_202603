package model;
//DAO : DataBase Access Object - 데이터베이스 접근 객체

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class PersonDAO {

	Connection conn = null;
	PreparedStatement ptmt = null;
	ResultSet rs =null;
	
	public PersonDAO() {
		
		String url = "jdbc:postgresql://localhost:5432/mbc_db";
		String user = "mbc_user";
		String pw = "123456";
		
		try {
			//1. db 연결 객체 생성
			conn = DriverManager.getConnection(url, user, pw);
		} catch (Exception e) {
			System.out.println("DB 연결 실패"+e.getMessage());
		}
	}
	
	
	
	public ArrayList<PersonDTO> list(){
		ArrayList<PersonDTO> persons = new ArrayList<PersonDTO>();
		try {
			String sql = "select * from person order by pid";	
			// 2. sql 실행 객체 생성
			ptmt = conn.prepareStatement(sql);
			
			//3. sql 실행 결과 
			rs = ptmt.executeQuery();

			//4. sql 실행 결과 처리
			while(rs.next()) {
				PersonDTO dto = new PersonDTO();
				dto.setPid(rs.getString("pid"));
				dto.setPame(rs.getString("pame"));
				dto.setAge(rs.getInt("age"));
				dto.setHeight(rs.getDouble("height"));
				dto.setBirth(rs.getTimestamp("birth"));
				dto.setReg_date(rs.getTimestamp("reg_date"));
				dto.setFriend(rs.getString("friend"));
				dto.setPfid(rs.getString("pfid"));
				persons.add(dto);
				//System.out.println(dto);
			}
			
		} catch (Exception e) {
			System.out.println("list() 실패"+e.getMessage());
		}finally {
			close();
		}
		
		return persons;
	}
	
	
	
	public PersonDTO detail(String pid){
		PersonDTO dto = null;
		try {
			//String sql = "select * from person where pid = '"+pid+"'";	
			String sql = "select * from person where pid = ?";
			// 2. sql 실행 객체 생성
			ptmt = conn.prepareStatement(sql);
			
			// 동적 쿼리문 ? 에 대입
			//  setXXX(물음표순서, 값)
			//  set자료형 이며  순서는 1번부터 시작
			ptmt.setString(1, pid);
			
			
			//3. sql 실행 결과 
			rs = ptmt.executeQuery();  // select - 실행결과 : 데이터

			//4. sql 실행 결과 처리
			if(rs.next()) {
				dto = new PersonDTO();
				dto.setPid(rs.getString("pid"));
				dto.setPame(rs.getString("pame"));
				dto.setAge(rs.getInt("age"));
				dto.setHeight(rs.getDouble("height"));
				dto.setBirth(rs.getTimestamp("birth"));
				dto.setReg_date(rs.getTimestamp("reg_date"));
				dto.setFriend(rs.getString("friend"));
				dto.setPfid(rs.getString("pfid"));
				
			}
			
		} catch (Exception e) {
			System.out.println("detail() 실패"+e.getMessage());
		}finally {
			close();
		}
		
		return dto;
	}
	
	
	
	public int insert(PersonDTO dto){
		int res = 0;
		try {
			
//			String sql = "insert into person (pid,pame,age, height, birth, reg_date, friend, pfid) "+
//					" values ('da1','이석범', 28 , 186.3 , '2006-03-15','2025-03-09 09:30:25', 'ccc','pf2')";
			
			String sql = "insert into person (pid,pame,age, height, birth, reg_date, friend, pfid) "+
					" values (?,?, ? , ? , ?, now() , ?, ?)";
			// 2. sql 실행 객체 생성
			ptmt = conn.prepareStatement(sql);
			
			ptmt.setString(1, dto.getPid());
			ptmt.setString(2, dto.getPame());
			ptmt.setInt(3, dto.getAge());
			ptmt.setDouble(4, dto.getHeight());
			// java.util.Date --> java.sql.Date -->  sql 구문
			ptmt.setDate(5, new java.sql.Date((dto.getBirth().getTime())));
			ptmt.setString(6, dto.getFriend());
			ptmt.setString(7, dto.getPfid());
						
			//3. sql 실행 결과 
			res = ptmt.executeUpdate();  // insert, update, delete ...  - 실행결과 : 적용된 갯수
			
		} catch (Exception e) {
			System.out.println("insert() 실패"+e.getMessage());
		}finally {
			close();
		}
		
		return res;
	}
	
	
	public int modify(PersonDTO dto){
		int res = 0;
		try {

			String sql = "update person set pame = '두별이', height = 174.23, "
					+ " friend='u3' , pfid = 'pf1' "
					+ " where pid = 'aaa'";

			// 2. sql 실행 객체 생성
			ptmt = conn.prepareStatement(sql);
			
//			ptmt.setString(1, dto.getPid());
//			ptmt.setString(2, dto.getPame());
//			ptmt.setInt(3, dto.getAge());
//			ptmt.setDouble(4, dto.getHeight());
//			// java.util.Date --> java.sql.Date -->  sql 구문
//			ptmt.setDate(5, new java.sql.Date((dto.getBirth().getTime())));
//			ptmt.setString(6, dto.getFriend());
//			ptmt.setString(7, dto.getPfid());
						
			//3. sql 실행 결과 
			res = ptmt.executeUpdate();  // insert, update, delete ...  - 실행결과 : 적용된 갯수
			
		} catch (Exception e) {
			System.out.println("modify() 실패"+e.getMessage());
		}finally {
			close();
		}
		
		return res;
	}
	
	// 종료 메소드
	void close() {
		//5. sql 실행결과 종료
		if(rs!=null) try {rs.close();} catch (Exception e) {} 
		//6. sql 실행객체 종료
		if(ptmt!=null) try {ptmt.close();} catch (Exception e) {} 
		//7. db 연결종료
		if(conn!=null) try {conn.close();} catch (Exception e) {} 
	}
	
	
}
