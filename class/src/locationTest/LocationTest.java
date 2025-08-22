package locationTest;

// 주소를 사용하는 이유
public class LocationTest {
//   int test(int data) {
//      data = 20;
//      return data;
//   }
   
   int[] test(int[] data) {
      data[0] = 20;
      return data;
   }
   
   public static void main(String[] args) {
      LocationTest ts = new LocationTest();
//      int data = 50;
//      ts.test(data);
//      System.out.println(data);
      
      int[] data = {50};
      ts.test(data);
      System.out.println(data[0]);
      
   }
   
}
