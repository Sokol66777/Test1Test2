package com.training.exproject.main;
import com.training.exproject.package1.Test1;
import com.training.exproject.package1.Test2;
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 test = new Test1();
		test.setA(5);
		test.setB(6);
		System.out.println(test.getA());
		System.out.println(test.getB());
		System.out.println(test.sum());
		System.out.println(test.more());
		Test2 t2 = new Test2(3,2);
		System.out.println(t2.getA());
		System.out.println(t2.getB());
	}

}
