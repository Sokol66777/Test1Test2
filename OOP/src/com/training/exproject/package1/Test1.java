package com.training.exproject.package1;

public class Test1 {
	private int a;
	private int b;
	public void setA(int _a) {
		a=_a;
	}
	public void setB(int _b) {
		b=_b;
	}
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	public int sum() {
		int c=a+b;
		return c;
	}
	public int more() {
		if(a>b) {
			return a;
		}
		if(b>a) {
			return b;
		}
		if(a==b) {
			throw new RuntimeException ("Numbers is equal");
		}
		return 0;
	}

}
