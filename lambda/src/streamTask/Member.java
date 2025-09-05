package streamTask;

import java.util.Objects;
// 필드 : 이름 취미 소개
public class Member {
	private Long id;
	private String name;
	private String hobby;
	private String intro;
	private static Long seq;
	
//	최초 한번
	static{
		seq = 1L;
	}
	
//	생성자가 호출 될 때 마다
	{
		this.id = seq++;
	}
	
	public Member() {;}
	public Member(String name, String hobby, String intro) {
		this.name = name;
		this.hobby = hobby;
		this.intro = intro;
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
	String getHobby() {
		return hobby;
	}
	void setHobby(String hobby) {
		this.hobby = hobby;
	}
	String getIntro() {
		return intro;
	}
	void setIntro(String intro) {
		this.intro = intro;
	}
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", hobby=" + hobby + ", intro=" + intro + "]";
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
		Member other = (Member) obj;
		return Objects.equals(id, other.id);
	}
	
}
