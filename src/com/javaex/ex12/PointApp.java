package com.javaex.ex12;

public class PointApp {

	public static void main(String[] args) {
		
		Point p = new Point(4, 4);
		
		ColorPoint cp1 = new ColorPoint("red");
		ColorPoint cp2 = new ColorPoint(10, 10, "blue");
		
		p.showInfo();
		System.out.println("---------");
		cp1.showInfo();
		System.out.println("---------");
		cp2.showInfo();

	}

}
