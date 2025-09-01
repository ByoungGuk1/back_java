package mail;

import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Message.RecipientType;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class MailTest {
	public static void main(String[] args) {
    // 메일 인코딩
    final String bodyEncoding = "UTF-8"; //콘텐츠 인코딩
    
    //원하는 메일 제목 작성
    String subject = "메일 발송 테스트";
    
    //보낸 이메일 작성
    String fromEmail = "bksong121212@gmail.com";
    String fromUsername = "송병국";
    
    String toEmail = "bksong121212@gmail.com"; // 콤마(,)로 여러개 나열
    
    //도메인 사용할 필요 없다
    //앱비밀번호
    final String username = "bksong121212@gmail.com";         
    final String password = "cygd pryg gqqe nwzv";
    
    // 메일에 출력할 텍스트
    String html = null;
    StringBuffer sb = new StringBuffer();
    sb.append("<div style=\"font-family: 'Apple SD Gothic Neo', 'sans-serif' !important; width: 540px; height: 600px; border-top: 4px solid {$point_color}; margin: 100px auto; padding: 30px 0; box-sizing: border-box;\">\r\n"
    		+ "	<h1 style=\"margin: 0; padding: 0 5px; font-size: 28px; font-weight: 400;\">\r\n"
    		+ "		<span style=\"font-size: 15px; margin: 0 0 10px 3px;\">{$site_title_top}</span><br />\r\n"
    		+ "		<span style=\"color: {$point_color};\">메일인증</span> 안내입니다.\r\n"
    		+ "	</h1>\r\n"
    		+ "	<p style=\"font-size: 16px; line-height: 26px; margin-top: 50px; padding: 0 5px;\">\r\n"
    		+ "		안녕하세요.<br />\r\n"
    		+ "		{$site_title_content}에 가입해 주셔서 진심으로 감사드립니다.<br />\r\n"
    		+ "		아래 <b style=\"color: {$point_color};\">'메일 인증'</b> 버튼을 클릭하여 회원가입을 완료해 주세요.<br />\r\n"
    		+ "		감사합니다.\r\n"
    		+ "	</p>\r\n"
    		+ "\r\n"
    		+ "	<a style=\"color: #FFF; text-decoration: none; text-align: center;\" href=\"{$auth_url}\" target=\"_blank\"><p style=\"display: inline-block; width: 210px; height: 45px; margin: 30px 5px 40px; background: {$point_color}; line-height: 45px; vertical-align: middle; font-size: 16px;\">메일 인증</p></a>\r\n"
    		+ "\r\n"
    		+ "	<div style=\"border-top: 1px solid #DDD; padding: 5px;\">\r\n"
    		+ "		<p style=\"font-size: 13px; line-height: 21px; color: #555;\">\r\n"
    		+ "			만약 버튼이 정상적으로 클릭되지 않는다면, 아래 링크를 복사하여 접속해 주세요.<br />\r\n"
    		+ "			{$auth_url}\r\n"
    		+ "		</p>\r\n"
    		+ "	</div>\r\n"
    		+ "</div>");
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
      
//      // 메일 콘텐츠 설정
      Multipart mParts = new MimeMultipart();
      MimeBodyPart mTextPart = new MimeBodyPart();
      MimeBodyPart mFilePart = null;
//    
//      // 메일 콘텐츠 - 내용
      mTextPart.setText(html, bodyEncoding, "html");
      mParts.addBodyPart(mTextPart);
//            
//      // 메일 콘텐츠 설정
      message.setContent(mParts);
 
      // 메일 발송
      Transport.send( message );
      
    } catch ( Exception e ) {
      e.printStackTrace();
    }
	}
}
