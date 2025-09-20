package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

import vo.MemberVO;

public class MemberDAO {
//	1. 연결
	Connection connection;
	
//	2. 쿼리 실행
	PreparedStatement preparedStatement;
	
//	3. 결과
	ResultSet resultSet;
	
//	4. 로그인시 공용 저장소 세션
	public static Long session;
	
//	5. close
	public void closeResource() {
		try {
			if(resultSet != null)
				resultSet.close();
			if(preparedStatement != null)
				preparedStatement.close();
			if(connection != null)
				connection.close();
		} catch (SQLException e) {
			System.out.println("changeUser(MemberVO) close 오류");
			System.out.println("changeUser(MemberVO) 리소스 해제 오류");
			e.printStackTrace();
		}
	}
	
//	1) 아이디 중복 검사
	public boolean checkId(String memberEmail) {
//		-연결
//		-쿼리 작성
//		-쿼리 전송
//		-데이터를 받는다 (VO)
//		-리턴

//		-연결
		connection = DBConnecter.getConnect();

//		-쿼리 작성
//		String query = "SELECT ID FROM TBL_MEMBER WHERE MEMBER EMAIL =  \'" + memberEmail +"\'";

//		preparedStatement(상위호환)
		String query = "SELECT ID, MEMBER_NAME FROM TBL_MEMBER WHERE MEMBER_EMAIL = ?";
		boolean check = false;

//		-쿼리 전송
//			query는 try-catch를 강제
		try {
			preparedStatement = connection.prepareStatement(query);
			
//			쿼리문에서 ? 의 값을 매핑
			preparedStatement.setString(1, memberEmail);
//			쿼리 실행
//				결과값이 있을 때
			resultSet = preparedStatement.executeQuery();
//				결과값이 없을 때
//			preparedStatement.executeUpdate();

//			-데이터를 받는다 (VO)
			resultSet.next();
			Long id = resultSet.getLong(1);
			String memberName = resultSet.getString(2);
			System.out.print(id + '\t');
			System.out.println(memberName);
			
		} catch (SQLException e) {
//			못찾았을 때
			check = true;
			System.out.println("checkId(String) Query 문 오류");
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null)
					resultSet.close();
				if(preparedStatement != null)
					preparedStatement.close();
				if(connection != null)
					connection.close();
			} catch (SQLException e) {
				System.out.println("checkId(String) close 오류");
				System.out.println("checkId(String) 리소스 해제 오류");
				e.printStackTrace();
			}
		}
//		-리턴
		return check;
	}
	
//	회원가입
	public void join(MemberVO memberVO) {
//		연결
//		쿼리작성
//		쿼리 담기
//		쿼리 실행
//		리턴 없으면 리소스 해제

//		연결
		connection = DBConnecter.getConnect();

//		쿼리작성
		String query = "INSERT INTO TBL_MEMBER "
				+ "VALUES(SEQ_MEMBER.NEXTVAL, ?, ?, ?, ?, ?)";

//		쿼리 담기
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, memberVO.getMemberEmail());
			preparedStatement.setString(2, memberVO.getMemberPassword());
			preparedStatement.setString(3, memberVO.getMemberName());
			preparedStatement.setInt(4, memberVO.getMemberAge());
			preparedStatement.setString(5, memberVO.getMemberAddress());
			
//		쿼리 실행
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			System.out.println("join(memberVO) query문 오류");
			e.printStackTrace();
		} finally {
//		리턴 없으면 리소스 해제
			try {
				if(resultSet != null)
					resultSet.close();
				if(preparedStatement != null)
					preparedStatement.close();
				if(connection != null)
					connection.close();
			} catch (SQLException e) {
				System.out.println("join(memberVO) close 오류");
				System.out.println("join(memberVO) 리소스 해제 오류");
				e.printStackTrace();
			}
		}
	}
	
//	로그인 -실습
	public Long login(MemberVO memberVO) {
		connection = DBConnecter.getConnect();
		String query = "SELECT ID FROM TBL_MEMBER WHERE MEMBER_EMAIL = ? AND MEMBER_PASSWORD = ?";
		Long id = 0L;
		
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, memberVO.getMemberEmail());
			preparedStatement.setString(2, memberVO.getMemberPassword());

			resultSet = preparedStatement.executeQuery();
			
			resultSet.next();
			id = resultSet.getLong(1);
			session = id;
			
		} catch (SQLException e) {
//			못찾았을 때
			System.out.println("login(MemberVO) Query 문 오류 또는 값을 찾지 못함.");
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null)
					resultSet.close();
				if(preparedStatement != null)
					preparedStatement.close();
				if(connection != null)
					connection.close();
			} catch (SQLException e) {
				System.out.println("login(memberVO) close 오류");
				System.out.println("login(memberVO) 리소스 해제 오류");
				e.printStackTrace();
			}
		}
		return id;
	}
	
//	마이페이지
	public Optional<MemberVO> mypage() {
		String query = "SELECT ID, MEMBER_EMAIL, MEMBER_PASSWORD, MEMBER_NAME, MEMBER_AGE, MEMBER_ADDRESS "
				+ "FROM TBL_MEMBER WHERE ID = ?";
		connection = DBConnecter.getConnect();
		MemberVO memberVO = new MemberVO();
		
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, session);
			
			resultSet = preparedStatement.executeQuery();
			resultSet.next();
			memberVO.setId(resultSet.getLong("ID"));
			memberVO.setMemberEmail(resultSet.getString("MEMBER_EMAIL"));
			memberVO.setMemberPassword(resultSet.getString("MEMBER_PASSWORD"));
			memberVO.setMemberName(resultSet.getString("MEMBER_NAME"));
			memberVO.setMemberAge(resultSet.getInt("MEMBER_AGE"));
			memberVO.setMemberAddress(resultSet.getString("MEMBER_ADDRESS"));
		} catch (SQLException e) {
			System.out.println("mypage() query error");
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null)
					resultSet.close();
				if(preparedStatement != null)
					preparedStatement.close();
				if(connection != null)
					connection.close();
			} catch (SQLException e) {
				System.out.println("mypage() close 오류");
				System.out.println("mypage() 리소스 해제 오류");
				e.printStackTrace();
			}
		}
		return  Optional.ofNullable(memberVO);
	}
	
//	비밀번호 변경 1
	public boolean changePassword(String password) {
		String query = "UPDATE TBL_MEMBER SET MEMBER_PASSWORD = ? WHERE ID = ?";
		connection = DBConnecter.getConnect();
//		MemberVO memberVO = new MemberVO();
		boolean result = false;
		
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, password);
			preparedStatement.setLong(2, session);
			
			preparedStatement.executeUpdate();
			result = true;
		} catch (SQLException e) {
			result = false;
			System.out.println("changePassword(String) queryerror");
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null)
					resultSet.close();
				if(preparedStatement != null)
					preparedStatement.close();
				if(connection != null)
					connection.close();
			} catch (SQLException e) {
				System.out.println("changePassword(String) close 오류");
				System.out.println("changePassword(String) 리소스 해제 오류");
				e.printStackTrace();
			}
		}
		return result;
	}

//	로그아웃
	public boolean logout() {
		try {
			session = 0L;
			System.out.println("로그아웃");
			return true;
		} catch (Exception e) {
			System.out.println("로그아웃 실패");
			return false;
		}
	}
	
//	회원 정보 수정
	public boolean changeUser(MemberVO memberVO) {
		String updateDataQuery = "UPDATE TBL_MEMBER SET MEMBER_EMAIL = ?, MEMBER_NAME = ?, MEMBER_ADDRESS = ? "
				+ "WHERE ID = ?";
		
		connection = DBConnecter.getConnect();
		boolean result = false;	
		try {
			preparedStatement = connection.prepareStatement(updateDataQuery);
			preparedStatement.setString(1, memberVO.getMemberEmail());
			preparedStatement.setString(2, memberVO.getMemberName());
			preparedStatement.setString(3, memberVO.getMemberAddress());
			preparedStatement.setLong(4, session);
			
			preparedStatement.executeUpdate();
			result = true;
		} catch (SQLException e) {
			System.out.println("changeUser(MemberVO) updateDataQuery error");
			e.printStackTrace();
		} finally {
			closeResource();
		}
		return result;
	}
	
//	회원탈퇴
	public boolean deleteMember() {
		String deleteQuery = "DELETE FROM TBL_MEMBER WHERE ID = ?";
		boolean result = true;

		connection = DBConnecter.getConnect();

		try {
			preparedStatement = connection.prepareStatement(deleteQuery);
			preparedStatement.setLong(1, session);
			
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			result = false;
			System.out.println("deleteMember() deleteQuery error");
			e.printStackTrace();
		} finally {
			closeResource();
		}
		return result;
	}

}
