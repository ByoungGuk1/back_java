package inheritanceTask;

//PersonTask
//이름, 나이, 주소, 핸드폰
//각 메서드 출력
//work 일을 한다
//sleep 잠을 잔다
//eat 세 끼를 먹는다

//StudentTask
//인스타아이디
//각 메서드 출력
//work 아르바이트를 한다
//sleep 수업 시간에 잠을 잔다
//eat 아침을 거른다

//EmployeeTask
//비상금
//각 메서드 출력
//work 하루 종일 일을 한다
//sleep 잠을 설친다
//eat 야식을 먹는다

//InhertanceTask에서
//사람, 학생, 직장인 객체화 후 각 메서드 출력하기

public class InheritanceTask2 {
	public static void main(String[] args) {
		PersonTask person = new PersonTask("사람", 20, "서울", "010-1234-5678");
//		String name, int age, String address, String phone
		StudentTask student = new StudentTask("학생", 21, "경기도", "010-2345-6789", "instagramId");
//		String name, int age, String address, String phone, String instagramId
		EmployeeTask employee = new EmployeeTask("직장인", 22, "미국", "010-3456-7890", 5000000);
//		String name, int age, String address, String phone, int money
		
		person.work();
		person.sleep();
		person.eat();
		
		System.out.println();
		
		student.work();
		student.sleep();
		student.eat();
		
		System.out.println();

		employee.work();
		employee.sleep();
		employee.eat();
	}
}

//---
//
//package inheritanceTask;
//
////InhertanceTask에서
////사람, 학생, 직장인 객체화 후 각 메서드 출력하기
//public class InheritanceTask2 {
//public static void main(String[] args) {
// PersonTask[] persons = {
//    new EmployeeTask(),
//    new PersonTask(),
//    new StudentTask(),
// };
//
// for(int i = 0; i < persons.length; i++) {
//    persons[i].work();
//    persons[i].eat();
//    persons[i].sleep();
// }
//
//}
//}
