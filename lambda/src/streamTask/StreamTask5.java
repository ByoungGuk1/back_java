package streamTask;

import java.util.ArrayList;
import java.util.Arrays;

public class StreamTask5 {
	public static void main(String[] args) {
		ArrayList<Member> members = new ArrayList<>();
		
		Member member1 = new Member("홍길동", "축구_농구_야구", "나는 축구왕!");
		Member member2 = new Member("이순신", "개발_당구_축구", "나는 개발자 좋아!");
		Member member3 = new Member("장보고", "피아노", "피아노만 한 우물!");
		Member member4 = new Member("김철수", "스포츠댄스_개발", "취미로 춤을 춘다 ~");
		Member member5 = new Member("김영희", "골프_야구", "운동 선수는 나의 꿈");
		Member member6 = new Member("흰둥이", "개발_축구_농구", "개발도 운동도 다 잘해요!");
		Member member7 = new Member("as", "개발_놀기", "자바가 제일 쉬웠어요");
		
		Member[] membersArray = new Member[]{member1, member2, member3, member4, member5, member6, member7};

		members.addAll(Arrays.asList(membersArray));

		ArrayList<String> hobbys = new ArrayList<>();
		
		members.stream()
			.map((data)->data.getHobby().split("_"))
			.filter((hobby)->hobby.length == 2)
			.forEach((data)->{
				hobbys.addAll(Arrays.asList(data));
			});
//			.forEach((data)->{
//				System.out.println(data);
//			});

		System.out.println(hobbys);
		System.out.println("hobbys.size() : " + hobbys.size());
	}
}
