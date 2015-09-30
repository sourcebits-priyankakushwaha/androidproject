package com.example.areacalculator;

public class Rectangle implements Shape {
	private double width, length;

	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	@Override
	public double area() {
		return length * width;
	}
}