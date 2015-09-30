package com.example.areacalculator;

public class Square implements Shape {
	private double edge;

	public Square(double edge) {
		this.edge = edge;

	}

	@Override
	public double area() {
		return edge * edge;
	}
}