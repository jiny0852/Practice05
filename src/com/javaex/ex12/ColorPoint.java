package com.javaex.ex12;

public class ColorPoint extends Point {

	private String color;
	
	
	public ColorPoint() {
		super();	
		//System.out.println("ColorPoint()");
	}
	public ColorPoint(String color) {
		super();
		this.color = color; 	
		//System.out.println("ColorPoint(1)");
	}
	public ColorPoint(int x, int y, String color) {
		super.setX(x);
		super.setY(y);
		this.color = color; 	
		//System.out.println("ColorPoint(2-1)");
	}
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	public void showInfo() {
		System.out.println("x : " + super.getX() + "\ny : " + getY()  + "\ncolor : " + color);
	}
	
}
