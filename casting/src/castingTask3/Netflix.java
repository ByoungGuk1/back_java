package castingTask3;

public class Netflix {
	
	public Netflix() {;}

	public void playVideo(VideoCategory video) {
		if(video instanceof Animation) {
			Animation ani = (Animation)video;
			ani.subtitle();
		} else if(video instanceof Movie) {
			Movie mv = (Movie)video;
			mv.displayMode();
		} else if(video instanceof Drama) {
			Drama drama = (Drama)video;
			drama.goods();
		} else {
			System.err.println("카테고리 선택(클래스 타입) 오류");
		}
	}
	
}
