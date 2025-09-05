package streamTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class StreamTask4 {
	static int longIndex = 0;
	
	public void introduce(Member member) {
		System.out.println("id=" + member.getId() + "\nname=" + member.getName() + "\nhobby=" + member.getHobby() + "\nintro=" + member.getIntro());
	}
	
	public void printBase(ArrayList<Member> members) {
	//	베이스가 되는 ArrayList 출력
		System.out.println();
		System.out.println("---<<메인 ArrayList>>---");
		System.out.println();
		members.forEach((data) -> {
			System.out.println(data);
		});
		System.out.println();
		System.out.println("---<<메인 ArrayList>>---");
	}
	public static void main(String[] args) {
		/*
			홍길동, 축구_농구_야구, 나는 축구왕!
			이순신, 개발_당구_축구, 나는 개발자 좋아!
			장보고, 피아노, 피아노만 한 우물!
			김철수, 스포츠댄스_개발, 취미로 춤을 춘다 ~
			김영희, 골프_야구, 운동 선수는 나의 꿈
			흰둥이, 개발_축구_농구, 개발도 운동도 다 잘해요!
		 */
		
		ArrayList<Member> members = new ArrayList<>();
		
		Member member1 = new Member("홍길동", "축구_농구_야구", "나는 축구왕!");
		Member member2 = new Member("이순신", "개발_당구_축구", "나는 개발자 좋아!");
		Member member3 = new Member("장보고", "피아노", "피아노만 한 우물!");
		Member member4 = new Member("김철수", "스포츠댄스_개발", "취미로 춤을 춘다 ~");
		Member member5 = new Member("김영희", "골프_야구", "운동 선수는 나의 꿈");
		Member member6 = new Member("흰둥이", "개발_축구_농구", "개발도 운동도 다 잘해요!");
		
		Member[] membersArray = {member1, member2, member3, member4, member5, member6};
		
		members.addAll(Arrays.asList(membersArray));
		
//		members.add(member1);
//		members.add(member2);
//		members.add(member3);
//		members.add(member4);
//		members.add(member5);
//		members.add(member6);
		
	//각 멤버의 취미를 검토.
	//취미 중 개발을 좋아하는 취미를 가진 맴버의 데이터를 모두 출력
		members.stream().filter((data)->data.getHobby().contains("개발"));
//		.forEach(System.out::println);
//		System.out.println();

	//취미 중 개발을 좋아하는 취미를 가진 맴버의 이름을 "개발자 OOO"로 변경
		members.stream().filter((data)->data.getHobby().contains("개발")).map((data)->{
			data.setName("개발자 " + data.getName());
			return data;
		});
//		.forEach(System.out::println);
//		System.out.println();
		
	//취미를 3개 이상 가지고 있는 사람의 id 출력
		members.stream().filter((data)->data.getHobby().split("_").length >= 3)
		.forEach((data)->{
//			System.out.println(data.getId());
		});
		System.out.println();
		
	//4) 취미를 3개 이상 가진 사람의 id를 ArrayList로 변경하고 hobbyIds 변수에 담기
		ArrayList<Long> hobbyIds = null;
		hobbyIds = members.stream().filter((data)->data.getHobby().split("_").length >= 3)
				.map((data)->data.getId())
				.collect(Collectors.toCollection(ArrayList::new));
		
//		System.out.println(hobbyIds);
		System.out.println();

	//5)	hobbyIds에 존재하는 id와 같은 id를 가진 members의 데이터 소개를 출력
		hobbyIds
			.stream()
			.mapToInt(Long::intValue)	//	:IntStream
			.mapToObj(Integer::valueOf)	//	:Stream<Integer>
			.map((index)->members.get(index - 1))
			.map((data)->data.getIntro());
//			.forEach(System.out::println);
			
//		.stream()
//		.forEach((idValue)->{
//			members.stream().filter((member)->member.getId() == idValue).forEach((member)->{
//				System.out.println(member.getIntro());
//			});
//		});
		System.out.println();

	//6) 소개를 가장 길게 쓴 사용자의 정보를 문자열로 출력하기
//		단일객체는 스트림 문법 사용 불가
		Member member = members.stream()
				.max(Comparator.comparingInt((mem)->mem.getIntro().length()))
				.get();

		MaxLength maxLength = new MaxLength();

		for(Member memberturn : members) {
			if(memberturn.getIntro().length() > maxLength.getSize()) {
				maxLength.setSize(memberturn.getIntro().length());
			}
//			longIndex = memberturn.getIntro().length() > maxLength.getSize() ? memberturn.getIntro().length() : longIndex;
		}
		
		members.stream()
		.filter((data)->data.getIntro().length() == maxLength.getSize())
		.forEach(new StreamTask4()::introduce);

		new StreamTask4().introduce(member);
		System.out.println();
		System.out.println(longIndex);
//		new StreamTask4().printBase(members);

	}
}
