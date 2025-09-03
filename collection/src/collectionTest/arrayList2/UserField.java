package collectionTest.arrayList2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;
import java.util.Scanner;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.internet.MimeMessage.RecipientType;

public class UserField {
	//		DataBase
	final int KEY = 50000;
	public ArrayList<User> users = DBConnecter.users;

	//		Session
	public static String userId;
	public static String code = "";

	//		아이디 검사
	public User checkId(String id) {
		for(User user : users) {
			if(user.getId().equals(id)) {
				return user;
			}
		}
		return null;
	}
	//		회원가입
	public void signUp(User user) {
		User userDataBase = checkId(user.getId());
		if(userDataBase == null) {
			user.setRecentChangePw(LocalDate.now().toString());
			user.setPassword(encrypt(user.getPassword()));
			users.add(user);
		}
	}
	
	//		로그인
//	id와 pw를 받고
//	우선적으로 id를 확인 -> 있으면 유저의 데이터 전체 / 없다면 null
//	유저의 데이터가 있다면, 위에서 가져온 유저의 데이터 중 pw와 입력된 pw의 값을 검사
//	pw가 동일하다면 user반환 / 아니라면 null
//	추후 user의 데이터를 활용하여 이름 등 표시에 사용
	public boolean login(User user) {
		User dbUser = checkId(user.getId());
		if(dbUser != null && dbUser.getPassword().equals(encrypt(user.getPassword()))) {
			userId = user.getId();
			return true;
		}
		return false;
	}

	//		로그아웃
//	현재 가지고 있는 유저의 데이터를 null로 지움
//	null로 변경하여 로그인 되기 전의 상태로 초기화
	public void logout() {
		userId = null;
	}

	//		암호화
	public String encrypt(String pw) {
		String result = "";
		for(char data : pw.toCharArray()) {
			result += (char)(data * KEY);
		}
		return result;
	}

	//		비밀번호 변경 - 마이페이지
//	비밀번호가 이전과 동일하면 안됨
	public User updateUser(User InputUser) {
		User user = checkId(userId);
		String changePW = InputUser.getPassword();
		if(user == null) return null;
		if(user.getPassword().equals(encrypt(changePW)))	{
			System.err.println("비밀번호가 똑같아요");
			return null;
		}
		user.setPassword(encrypt(changePW));
		user.setRecentChangePw(LocalDate.now().toString());
		return user;
	}

	//		비밀번호 변경 - 비밀번호 변경 30일
//	비밀전호가 이전과 동일해도 상관없음
	public void changePassWord(String changePW) {
		User user = checkId(userId);
		if(user == null) return;
		user.setPassword(encrypt(changePW));
		user.setRecentChangePw(LocalDate.now().toString());
	}

	//		인증번호 생성
	public String randomNumber() {
		String code = "";
		for(int i = 0; i < 6; i++) {
			code += (int)(Math.random() * 10);
		}
		UserField.code = code;
		return code;
	}

	//		인증번호 전송
	public void sendMail(String toMemberEmail) {
  // 메일 인코딩
  final String bodyEncoding = "UTF-8"; //콘텐츠 인코딩
  
  //원하는 메일 제목 작성
  String subject = "인증번호 발송 테스트";
  
  //보낸 이메일 작성
  String fromEmail = "bksong121212@gmail.com";
  String fromUsername = "송병국";
  
  String toEmail = toMemberEmail; // 콤마(,)로 여러개 나열
  
  //도메인 사용할 필요 없다
  //앱비밀번호
  final String username = "bksong121212@gmail.com";         
  final String password = "jzdv ohwu qttu txpk";
  
  //랜덤 코드 생성
  this.randomNumber();
  
  // 메일에 출력할 텍스트
  String html = null;
  StringBuffer sb = new StringBuffer();
  sb.append("<h2>" + "인증번호 발송"+ "</h2>");
  sb.append("<h3>" + "인증번호 6자리" + "</h3>");
  sb.append("<h4>" + code + "</h4>");
  html = sb.toString();
  
  // 메일 옵션 설정
  Properties props = new Properties();    
  props.put("mail.smtp.starttls.enable", "true");
  props.put("mail.smtp.host", "smtp.gmail.com");
  props.put("mail.smtp.auth", "true");
  props.put("mail.smtp.port", "587");
  props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
  props.put("mail.smtp.ssl.protocols", "TLSv1.2");
  
  try {
    // 메일 서버  인증 계정 설정
    Authenticator auth = new Authenticator() {
      protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(username, password);
      }
    };
    
    // 메일 세션 생성
    Session session = Session.getDefaultInstance(props, auth);
    
    // 메일 송/수신 옵션 설정
    Message message = new MimeMessage(session);
    message.setFrom(new InternetAddress(fromEmail, fromUsername));
    message.setRecipients(RecipientType.TO, InternetAddress.parse(toEmail, false));
    message.setSubject(subject);
    message.setSentDate(new Date());
    
//    // 메일 콘텐츠 설정
    Multipart mParts = new MimeMultipart();
    MimeBodyPart mTextPart = new MimeBodyPart();
//    MimeBodyPart mFilePart = null;
//  
//    // 메일 콘텐츠 - 내용
    mTextPart.setText(html, bodyEncoding, "html");
    mParts.addBodyPart(mTextPart);
//          
//    // 메일 콘텐츠 설정
    message.setContent(mParts);

    // 메일 발송
    Transport.send( message );
    
  } catch ( Exception e ) {
    e.printStackTrace();
  }
}
	
	//		인증번호 확인
	public boolean checkCode(String inputCode) {
		return code.equals(inputCode);
	}
	
	public static void main(String[] args) {
		UserField field = new UserField();
		Scanner sc = new Scanner(System.in);
		User user1 = new User("admin", "관리자 계정", "1234", "010-1234-5678");
		
//		String message = "인증 번호 입력", inputCode = null;
//		int errorCount = 0;
		
		
		System.out.println(field.checkId(user1.getId()));
		
//		1. 회원가입
		field.signUp(user1);
		System.out.println(DBConnecter.users);
//		2. 로그인하기
		System.out.println("로그인 결과 : " + field.login(user1));
		System.out.println("세션 : " + userId);
////		3. 로그아웃하기
//		field.logout();
//		System.out.println("로그아웃 완료");
//		System.out.println("세션 : " + userId);
		
//		4. 비밀번호 변경
		System.out.println("비밀번호 변경하기");
		User editUser = new User();
		editUser.setPassword(sc.nextLine());
		field.updateUser(editUser);
		System.out.println(user1);
		
////		암호화?
//		System.out.println(field.encrypt("1234"));
		
////		메일인증
//		field.sendMail("bksong121212@gmail.com");
//		
//		while(errorCount < 3){
//			System.out.println(message);
//			inputCode = sc.nextLine().trim();
//			if(!field.checkCode(inputCode)) {
//				errorCount++;
//				if(errorCount >= 3) {
//					System.out.println("처음부터 다시 시도해주세요");
//					break;
//				}	else {
//					System.out.println("다시 시도해주세요\t" + errorCount + " / 3\n");
//				}
//			}	else {
//				System.out.println("인증 성공");
//				break;
//			}
//		}
		
		sc.close();
	}
}
