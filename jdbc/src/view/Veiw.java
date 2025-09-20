package view;

import java.util.Optional;

import dao.MemberDAO;
import vo.MemberVO;

public class Veiw {
	public static void main(String[] args) {
		MemberDAO memberDAO = new MemberDAO();
		MemberVO memberVO = new MemberVO();
		MemberVO changememberVO = new MemberVO();
		
		memberVO.setMemberEmail("hgd123");
		memberVO.setMemberPassword("12345");
		memberVO.setMemberName("홍길동");
		memberVO.setMemberAge(15);
		memberVO.setMemberAddress("서울");
		
		changememberVO.setMemberEmail("hgd123");
		changememberVO.setMemberName("홍길동");
		changememberVO.setMemberAddress("서울");
		
		if(memberDAO.checkId(memberVO.getMemberEmail())) {
			System.out.println("사용 가능한 아이디");
			memberDAO.join(memberVO);
		} else {
			System.out.println("중복된 아이디");
		}
		
		if(memberDAO.login(memberVO) != 0) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
	
		Optional<MemberVO> member = memberDAO.mypage();
		
		member.ifPresent(System.out::println);
//		orElseThrow -> 처리해보기
		
//		if(memberDAO.changePassword("12345")) 
//			System.out.println("비밀번호 변경 성공");
//		else
//			System.out.println("변경 실패");
		
//		System.out.println(memberDAO.logout());
		
//		사용자 정보 변경
//		if(memberDAO.changeUser(changememberVO))
//			System.out.println("사용자 정보 변경 성공");
//		else
//			System.out.println("변경 실패");
		
//		회원탈퇴
		if(memberDAO.deleteMember()){
			System.out.println("탈퇴 완료");
		} else {
			System.out.println("탈퇴 실패");
		}
	}
}
