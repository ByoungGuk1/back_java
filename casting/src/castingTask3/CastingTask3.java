package castingTask3;

//넷플릭스
//애니메이션, 영화, 드라마 클래스 선언
//사용자가 선택한 영상이
//애니메이션이라면 "자막 지원" 기능 사용
//영화라면 "4D" 기능 사용
//드라마라면 "굿즈" 기능 사용

//클래스{
//  필드 변수
//  생성자
//  getter, setter
//	오버라이딩 된 메서드
//  필드 메서드
//}

public class CastingTask3 {
	public static void main(String[] args) {
		Netflix nf = new Netflix();
		VideoCategory[] videoList = new VideoCategory[3];
		
		videoList[0] = new Animation("애니메이션1");
		videoList[1] = new Movie("영화1");
		videoList[2] = new Drama("드라마1");
		
		for(VideoCategory videos : videoList) {
			System.out.println(videos.getName() + "을 재생");
			nf.playVideo(videos);
			System.out.println();
		}
	}
}
