package access;

public class Access1 {
	int data1;
	public int data2;
	protected int data3;
	private int data4;
	
	public Access1() {;}

	public Access1(int data1, int data2, int data3, int data4) {
		super();
		this.data1 = data1;
		this.data2 = data2;
		this.data3 = data3;
		this.data4 = data4;
	}
	
//	getter
	public int getData4() {
		return this.data4;
	}
//	setter
	public void setData4(int data4) {
		this.data4 = data4;
	}
}
