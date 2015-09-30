package com.example.areacalculator;

public class Cube implements Shape {
	private double edge;

	public Cube(double edge) {
		this.edge = edge;

	}

	@Override
	public double area() {
		return 6 * edge * edge;
	}
}