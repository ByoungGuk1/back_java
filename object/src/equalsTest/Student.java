package equalsTest;

import java.util.Objects;

public class Student {
	private int id;
	private String name;
	private int age;
	
	public Student() {;}
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	int getAge() {
		return age;
	}
	void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id;
	}
	
	public static void main(String[] args) {
		Student student = new Student(1, "이름", 23);
		if (student.equals(new Student(1,"이름", 23))) {
			System.out.println("책 대여 완료");
		} else {
			System.out.println("도난");
		}
		
	}
}
