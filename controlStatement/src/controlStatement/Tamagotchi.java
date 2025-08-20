package controlStatement;

import java.util.Scanner;

// 5번
// HP: (0/5)

// 밥을 안주면 죽는다.
// 밥을 주면 HP 5가 된다.
// 행동 1번당 HP가 1씩 줄어든다.
// 1. 놀아주기
// 2. 씻겨주기
// 3. 노래하기
// 4. 잠자기
// 5. 밥주기

// 만족도 10
// 타마고치 키우기 성공!

public class Tamagotchi {
	public static void main(String[] args) {

//		action type 5	/	만족도 max 10 / hp max 5
//		type1	: 5회 이내에 밥을 주어야함, 안주면 죽음
//						ㄴ> hp 5 start -> 밥 안주면 -1
//		type2	: 놀아주기
//		type3	: 씻겨주기
//		type4	: 노래하기
//		type5	: 잠자기
//		0			: 종료
//		만족도 10 -> 엔딩
  	 
		Scanner sc = new Scanner(System.in);
			String message = "어서오세요~ 타마고치 키우기\n(*￣3￣)╭",
					exampleMessage = "캐릭터를 선택하세요.\nex)1",
						th = "(╬▔皿▔)╯",
						hm = "(～￣(OO)￣)ブ",
						js = "(っ °Д °;)っ",
						lsc = "（；´д｀）ゞ",
						tama = "", tamaName = "";
			int choice = 0, hp = 5, exp = 0;
      
      System.out.println(message);
      System.out.println(exampleMessage);
      System.out.println("1. 태히 " + th);
      System.out.println("2. 안민 " + hm);
      System.out.println("3. 준섬 " + js);
      System.out.println("4. 승창 " + lsc);
      
      choice = sc.nextInt();
      
      switch (choice) {
			case 1:
				tama = th;
				break;
			case 2:
				tama = hm;
				break;
			case 3:
				tama = js;
				break;
			case 4:
				tama = lsc;
				break;

			default:
				break;
			}
      
      System.out.println("타마의 이름을 입력하세요.");
      tamaName = sc.next();
      
      System.out.printf("선택한 캐릭터 : %s\n캐릭터 이름 : %s\n", tama, tamaName);
      
      while (true) {
      	
      	System.out.println("행동을 입력해주세요.\nex)1\n"
      			+ "1. 놀아주기\n"
      			+ "2. 노래하기\n"
      			+ "3. 밥주기\n"
      			+ "0. 종료");
      	
      	choice = sc.nextInt();
      	
      	if(choice == 0) break;
      	
				switch (choice) {
				case 1:
					System.out.printf("%s이(가) 즐거워합니다.\n", tamaName);
					System.out.printf("%s~~~\n", tama);
					break;
				case 2:
					System.out.printf("%s이(가) 노래를 부릅니다.\n", tamaName);
					System.out.printf("%s~~~\n", tama);
					
					break;
				case 3:
					System.out.printf("%s이(가) 잡니다.\n", tamaName);
					System.out.printf("%s~~~\n", tama);
					hp = 6;
					break;
				
				default:
					System.out.println("다시 입력해주세요.");
					break;
				}
				hp--;
				exp++;
				System.out.printf("경험치 %d/%d\n체력%d/%d\n", exp, 10, hp, 5);
				if(hp == 0) {
					System.out.println("좋은 곳으로 갔습니다.");
					break;
				}
				if(exp == 10) {
					System.out.printf("축하합니다. %s %s이(가) 떠납니다. \n", tama, tamaName);
					break;
				}
			}
      
   }
}
