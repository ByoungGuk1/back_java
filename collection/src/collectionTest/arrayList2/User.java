package collectionTest.arrayList2;

import java.util.Objects;

public class User {
	private String id;
	private String name;
	private String password;
	private String phone;
	private String recentChangePw;
	
	public User() {;}
	public User(String id, String name, String password, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.phone = phone;
	}

	String getId() {
		return id;
	}
	void setId(String id) {
		this.id = id;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	String getPassword() {
		return password;
	}
	void setPassword(String password) {
		this.password = password;
	}
	String getPhone() {
		return phone;
	}
	void setPhone(String phone) {
		this.phone = phone;
	}
	String getRecentChangePw() {
		return phone;
	}
	void setRecentChangePw(String recentChangePw) {
		this.recentChangePw = recentChangePw;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", phone=" + phone + ", recentChangePw="
				+ recentChangePw + "]";
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
