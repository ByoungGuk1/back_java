package optionalTest;

import java.util.Objects;

public class User {
	private Long id;
	private String userName;
	private String userEmail;
	private String userPassword;
	private static Long seq;
	
	static {
		seq = 1L;
	}
	
	{
		this.id = seq++;
	}

	public User() {;}

	public User(String userName, String userEmail, String userPassword) {
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
	}

	Long getId() {
		return id;
	}

	void setId(Long id) {
		this.id = id;
	}

	String getUserName() {
		return userName;
	}

	void setUserName(String userName) {
		this.userName = userName;
	}

	String getUserEmail() {
		return userEmail;
	}

	void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	String getUserPassword() {
		return userPassword;
	}

	void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	static Long getSeq() {
		return seq;
	}

	static void setSeq(Long seq) {
		User.seq = seq;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", userEmail=" + userEmail + ", userPassword=" + userPassword
				+ "]";
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
