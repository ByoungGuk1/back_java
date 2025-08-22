package staticTest;

import java.util.Scanner;

public class SuperCar {
//	브랜드 - 필드
	String brand;
//	색상 - 필드
	String color;
//	가격 - 필드
	long price;
//	엔진 - 필드
	boolean engine;
//	비밀번호 - 필드
	String password;
//	비밀번호 오류 횟수 - 필드
	int errorCount;
	
//	스택틱 블록 -> 생성자가 실행됐을때 딱 한번 반드시 실행되는 블록
	static{
		System.out.println("생성 완료");
	}
//	초기화 블록 -> 초기화를 위해 실행하는 블록
	{
		this.password = "0000";
	}
	
//	기본 생성자
	public SuperCar() {;}
//초기화 생성자 /초기화 생성자의 오버로딩
	public SuperCar(String brand, String color, long price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
//	초기화 생성자 /모든 필드를 초기화 하는게 아니라 필요한 것만 초기화 생성
	public SuperCar(String brand, String color, long price, String password) {
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.password = password;
	}
	
	public boolean checkPassword(String password) {
		return this.password.equals(password);
	}
	
	public void engineStart() {
		this.engine = true;
	}
	public void engineStop() {
		this.engine = false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		SuperCar ferrari = new SuperCar("Ferarri", "red", 700_000_000, "1234");
		
		int choice = 0;
		String password = null;
		
		while(true) {
			System.out.println("1. 시동 켜기\n2.시동 끄기");
			choice = sc.nextInt();
			
			if(choice == 1) {
				if(!ferrari.engine) {
					System.out.println("비밀번호 입력");
					password = sc.next();
					if(ferrari.checkPassword(password)) {
						ferrari.engineStart();
						ferrari.errorCount++;
					}else {
						ferrari.errorCount++;
						System.out.println("비밀번호를 다시 입력해주세요");
						break;
					}
				}else {
					System.out.println(ferrari.brand + "의 시동이 켜져 있습니다.");					
				}
			}else if(choice == 2){
				if(ferrari.engine) {
					
				}else {
					
				}
				
			}else {
				System.out.println("다시 입력해주세요.");
				continue;
			}
		}
	}
}

//---

//package classTest;
//
//import java.util.Scanner;
//
//public class SuperCar {
////   브랜드
//   String brand;
////   색상
//   String color;
////   가격
//   long price;
////   엔진
//   boolean engine;
////   비밀번호
//   String password;
////   비밀번호 오류 횟수
//   int errorCount;
//   
////   스태틱 블록
//   static {
//      System.out.println("출고 축하합니다~!");
//   }
//   
////   초기화 블록
//   {
//      this.password = "0000";
//   }
//   
////   기본 생성자
//   public SuperCar() {;}
//   
////   초기화 생성자
////   초기화 생성자 오버로딩
//   public SuperCar(String brand, String color, long price) {
//      this.brand = brand;
//      this.color = color;
//      this.price = price;
//   }
//   
//   public SuperCar(String brand, String color, long price, String password) {
//      this.brand = brand;
//      this.color = color;
//      this.price = price;
//      this.password = password;
//   }
//      
//   public boolean checkPassword(String password) {
//      return this.password.equals(password);
//   } 
//   
//   public void engineStart() {
//      this.engine = true;
//   }
//   
//   public void engineStop() {
//      this.engine = false;
//   }
//   
//   
//   public static void main(String[] args) {
//      SuperCar ferrari = new SuperCar("Ferrari", "Red", 700_000_000, "5175");      
//      Scanner sc = new Scanner(System.in);
//      int choice = 0;
//      String password = null;
//      
//      while(true) {
//         System.out.println("1.시동 켜기\n2.시동 끄기");
//         choice = sc.nextInt();
//         
//         if(choice == 1) {
//            if(!ferrari.engine) {
//               System.out.println("비밀번호: ");
//               password = sc.next();
//               if(ferrari.checkPassword(password)) {
////                  시동 켜
//                  ferrari.errorCount = 0;
//                  ferrari.engineStart();
//                  System.out.println(ferrari.brand + "시동 켜짐!");
//               }else {
//                  ferrari.errorCount++;
//                  if(ferrari.errorCount > 2) {
//                     System.out.println("경찰 출동!!!!");
//                     break;
//                  }
//               }
//               
//            }else {
//               System.out.println(ferrari.brand + "시동이 켜져 있습니다.");
//            }
//            
//         }else if(choice == 2) {
//            if(ferrari.engine) {
//               ferrari.engineStop();
//               System.out.println(ferrari.brand + "시동 꺼짐.");
//            }else {
//               System.out.println(ferrari.brand + "시동이 이미 켜져있습니다.");
//            }
//         }else{
//            System.out.println("잘못 입력하셨습니다.");
//            continue;
//         }
//         
//      }
//      
//      
//   }
//   
//}
