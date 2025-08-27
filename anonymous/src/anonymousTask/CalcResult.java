package anonymousTask;

public class CalcResult {
	private int sum;
	private int minus;
	private double div;
	private int multiply;
	
	public CalcResult() {;}
	public CalcResult(int sum, int minus, double div, int multiply) {
		this.sum = sum;
		this.minus = minus;
		this.div = div;
		this.multiply = multiply;
	}
	
	int getSum() {
		return sum;
	}
	void setSum(int sum) {
		this.sum = sum;
	}
	int getMinus() {
		return minus;
	}
	void setMinus(int minus) {
		this.minus = minus;
	}
	double getDiv() {
		return div;
	}
	void setDiv(double div) {
		this.div = div;
	}
	int getMultiply() {
		return multiply;
	}
	void setMultiply(int multiply) {
		this.multiply = multiply;
	}
	
}
