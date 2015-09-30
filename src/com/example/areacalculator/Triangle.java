package com.example.areacalculator;

public class Triangle implements Shape {
	private double height, base;

	public Triangle(double height, double base) {
		this.height = height;
		this.base = base;
	}

	@Override
	public double area() {
		return (base * height) / 2;
	}
}