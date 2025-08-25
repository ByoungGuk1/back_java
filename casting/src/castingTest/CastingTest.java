package castingTest;

class A {
   void test() {
      System.out.println("A");
   }
}
class B extends A{
   void test() {
      System.out.println("B");
   }
   
   void test2() {
      System.out.println("BB");
   }
}

public class CastingTest {
   public static void main(String[] args) {
      A b = new B();
      B bb = (B)b;
//      B a = new A(); -> 이거 다운케스팅 아님.
      b.test();
   }
}
