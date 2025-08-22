package classTest;

public class ClassTest {

//	 -A- 자바에서는 해당 구간을 "필드 / 필드 변수" 라고 부름
   String name;
   int age;
//   -A-
   
//   기본 생성자
   public ClassTest() {;}
//   초기화 생성자
   public ClassTest(String name, int age) {
      this.name = name;
      this.age = age;
   }
   
   public static void main(String[] args) {
      ClassTest ct1 = new ClassTest("홍길동", 20);
      ClassTest ct2 = new ClassTest("김길동", 20);
//      ClassTest ct3 = new ClassTest();
      System.out.println(ct1.name);
      System.out.println(ct2.name);
   }
}