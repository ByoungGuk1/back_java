package staticTest;

//	필드 : name, age, income(수익)
//	회사의 돈 money
class Employee { //회사원
	String name;
	int age;
	int income;
	static int money;

	void addIncome(int income) {
		System.out.println("(income)"+this.income+"에 "+income+"만큼 추가");
		this.income += income;
		System.out.println("결과 : (income)"+this.income);
	}
	
	void addMoney() {
		System.out.println("(money)"+money+"에 "+income+"만큼 추가");
		money += income;
		income = 0;
		System.out.println("결과 : (money)"+money+", (income)"+income+"");
	}
	
	public Employee() {;}
	public Employee(String name, int age, int income) {
		this.name = name;
		this.age = age;
		this.income = income;
	}
}

//회사원들이 벌어온 수익을 모두 회사의 돈에 합치고, 회사의 돈 출력

public class StaticTask01 {
	public static void main(String[] args) {
		Employee em1 = new Employee("이름1", 30, 60_000);
		Employee em2 = new Employee("이름2", 30, 200_000);
		
		em1.addIncome(1_500);
		em1.addMoney();
		em1.addIncome(2_200);
		em1.addMoney();
		
		em2.addIncome(5_100);
		em2.addMoney();
		em2.addIncome(3_600);
		em2.addMoney();
	}
}

//---

//package staticTest;
//
////필드
////회사의 돈(돈)
////이름(name), 나이(age), 수익(income)
////회사원들이 벌어온 수익을 모두 회사의 돈(돈)에 합치고,
////회사의 돈 출력
//class Employee {
// static int money;
// String name;
// int age;
// int income;
// 
// public Employee() {;}
// public Employee(String name, int age, int income) {
//    this.name = name;
//    this.age = age;
//    this.income = income;
//    money += this.income;
// }
// 
// void printCompanyMoney() {
//    System.out.println(돈);
// }
//}
//
//public class StaticTask1 {
// public static void main(String[] args) {
//    
//    Employee employee1 = new Employee("홍길동", 20, 10_000);
//    Employee employee2 = new Employee("이승찬", 27, -100_000);
//    Employee employee3 = new Employee("송병국", 27, -10_000);
//    Employee employee4 = new Employee("배승원", 30, 150_000);
//    
////    Employee.money = employee1.income + employee2.income + employee3.income + employee4.income;
//    employee1.printCompanyMoney();
//    employee2.printCompanyMoney();
//    employee3.printCompanyMoney();
//    employee4.printCompanyMoney();
//    
// }
//}
