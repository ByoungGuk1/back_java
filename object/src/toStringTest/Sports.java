package toStringTest;

public class Sports {
	private String type;
	private int total;
	
	public Sports() {;}
	public Sports(String type, int total) {
		this.type = type;
		this.total = total;
	}
	
	String getType() {
		return type;
	}
	void setType(String type) {
		this.type = type;
	}
	int getTotal() {
		return total;
	}
	void setTotal(int total) {
		this.total = total;
	}
	
	@Override
	public String toString() {
		return "Sports [type=" + type + ", total=" + total + "]";
	}
	
	public static void main(String[] args) {
		Sports sports = new Sports();
		System.out.println(sports.toString());
		
	}
}
