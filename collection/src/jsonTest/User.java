package jsonTest;

import java.util.Objects;

public class User {
//	id, name, age, job
	private Long id;
	private String name;
	private int age;
	private String job;

	public User() {;}
	public User(Long id, String name, int age, String job) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.job = job;
	}

	Long getId() {
		return id;
	}
	void setId(Long id) {
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
	String getJob() {
		return job;
	}
	void setJob(String job) {
		this.job = job;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", job=" + job + "]";
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
		User other = (User) obj;
		return Objects.equals(id, other.id);
	}

}
