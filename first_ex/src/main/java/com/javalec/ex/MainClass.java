package com.javalec.ex;

public class MainClass {
	public static void main(String[] args) {
		
		Calculation calculation = new Calculation();
		calculation.setFirstNum(2);
		calculation.setSecondNum(5);
		
		calculation.add();
		calculation.sub();
		calculation.multi();
		calculation.div();
	}
}
