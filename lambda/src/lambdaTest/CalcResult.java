package lambdaTest;

public class CalcResult {
	private int add;
	private int minus;
	private int multi;
	private double div;
	
	public CalcResult() {;}
	public CalcResult(int add, int minus, int multi, double div) {
		super();
		this.add = add;
		this.minus = minus;
		this.multi = multi;
		this.div = div;
	}
	public int getAdd() {
		return add;
	}
	public void setAdd(int add) {
		this.add = add;
	}
	public int getMinus() {
		return minus;
	}
	public void setMinus(int minus) {
		this.minus = minus;
	}
	public int getMulti() {
		return multi;
	}
	public void setMulti(int multi) {
		this.multi = multi;
	}
	public double getDiv() {
		return div;
	}
	public void setDiv(double div) {
		this.div = div;
	}
	
}
