package org.o7planning.tutorial.springmvcsecurity.controller;


public class Calculation {

	public static void main(String args[]) {
		Calculation cal = new Calculation();
		cal.add(1, 2);
		cal.sub(2, 1);
	}

	public int add(int a, int b) {
		return a + b;
	}

	public int sub(int a, int b) {
		return a - b;
	}
}
