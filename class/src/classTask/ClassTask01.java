package classTask;

import java.util.Scanner;

//학생 클래스
//학생이 국어점수, 영어점수, 수학점수를 입력하면
//총점과 평균을 확인해서 출력

class Student {
//	1. 필드 구성
//	2. 기본 생성자, 초기화 생성자 생성
//	3.
	
	int korScore;
	int enScore;
	int mathScore;
	int totalScore;
	double scoreAvg;
	
	int calTotalScore() {
		int result = 0;
		result = this.korScore + this.enScore + this.mathScore;
		this.totalScore = result;
		return result;
	}
	
	double calScoreAvg() {
		double result = 0.0;
		if(this.totalScore != 0) {
			result = (double)this.totalScore / 3;
		} else {
			result = (double)this.calTotalScore() / 3;
		}
		result = Double.parseDouble(String.format("%.3f", result));
		this.scoreAvg = result;
		return result;
	}
	
	public Student() {;}
	public Student(int korScore, int enScore, int mathScore) {
		this.korScore = korScore;
		this.enScore = enScore;
		this.mathScore = mathScore;
		calTotalScore();
		calScoreAvg();
	}
}

public class ClassTask01 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student user = new Student();
		Student user2 = new Student(50, 49, 48);
		
		System.out.println("국어점수 입력");
		user.korScore = sc.nextInt();
		System.out.println("영어점수 입력");
		user.enScore = sc.nextInt();
		System.out.println("수학점수 입력");
		user.mathScore = sc.nextInt();
		
		sc.close();
		
		user.calTotalScore();
		System.out.println(user.totalScore);
		user.calScoreAvg();
		System.out.println(user.scoreAvg);

		System.out.println(user2.scoreAvg);
	}
}

//---
//
//package classTask;
//
//import java.util.Scanner;
//
//// 학생 클래스
//// 학생이 국어점수, 영어점수, 수학점수를 입력하면
//// 총점과 평균을 확인해서 출력
//class Student {
//   int number;
//   int kor;
//   int eng;
//   int math;
//   int total;
//   double average;
//   
//   public Student() {;}
//   public Student(int number, int kor, int eng, int math) {
//      this.number = number;
//      this.kor = kor;
//      this.eng = eng;
//      this.math = math;
//      this.total = kor + eng + math;
//      this.average = Double.parseDouble(String.format("%.3f", total / 3.0));
//   }
//   
//   public Student(int number, int[] scores) {
//      this.number = number;
//      this.kor = scores[0];
//      this.eng = scores[1];
//      this.math = scores[2];
//      this.total = kor + eng + math;
//      this.average = Double.parseDouble(String.format("%.3f", total / 3.0));
//   }
//   
//   public Student(int number, Scores scores) {
//      this.number = number;
//      this.kor = scores.kor;
//      this.eng = scores.eng;
//      this.math = scores.math;
//      this.total = kor + eng + math;
//      this.average = Double.parseDouble(String.format("%.3f", total / 3.0));
//   }
//}
//
//class Scores {
//   int kor;
//   int eng;
//   int math;
//   public Scores() {;}
//   public Scores(int kor, int eng, int math) {
//      this.kor = kor;
//      this.eng = eng;
//      this.math = math;
//   }
//   
//} 
//
//public class ClassTask1 {
//   public static void main(String[] args) {
//      Scanner sc = new Scanner(System.in);
//      Student bae = null;
//      
//      Scores scores = new Scores();
////      int[] scores = new int[3];
////      int kor = 0, eng = 0, math = 0;
//      
//      String message = "국어, 영어, 수학 점수를 입력하세요.\nex)70 80 90";
//      
//      System.out.println(message);
//      scores.kor = sc.nextInt(); 
//      scores.eng = sc.nextInt(); 
//      scores.math = sc.nextInt(); 
//            
//      bae = new Student(1, scores);
//      
//      System.out.println("총 점: " + bae.total);
//      System.out.println("평 균: " + bae.average);
//   }
//}
